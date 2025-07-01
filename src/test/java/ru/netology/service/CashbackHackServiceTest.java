package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {@Test
public void shouldReturn0IfAmountIsExactly1000() {
    CashbackHackService service = new CashbackHackService();
    int amount = 1000;
    int expected = 0;
    int actual = service.remain(amount);
    Assert.assertEquals(expected, actual);
}

    @Test
    public void shouldCalculateRemainingAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRemainingAmount2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRemainingAmount3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

}
