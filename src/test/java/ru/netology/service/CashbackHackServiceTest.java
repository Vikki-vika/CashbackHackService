package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test(description = "Покупка меньше 1000 рублей")
    public void testWhenCostIsLessThanOneThousand() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test(description = "Покупка ровно 1000 рублей")
    public void testWhenCostIsExactlyOneThousand() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test(description = "Покупка свыше 1000 рублей")
    public void testWhenCostExceedsOneThousand() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1500), 500); //  Ошибка, должно быть 0!
    }

    @Test(description = "Крайний случай чуть меньше 1000 рублей")
    public void testEdgeCaseJustBeforeThreshold() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(999), 1);
    }
}