package  ru.netology.service;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import ru.netology.service.CashbackHackService;

@Test(groups = {"cashback-test"})
public class CashbackHackServiceTest {

    private CashbackHackService service;

    @BeforeMethod
    public void setUp() {
        this.service = new CashbackHackService();
    }

    @Test(description="Проверка остатка при покупке ровно на тысячу рублей")
    public void testRemainWithExactThousand() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test(description="Проверка остатка при покупке менее тысячи рублей")
    public void testRemainBelowThousand() {
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test(description="Проверка остатка при крупной покупке")
    public void testRemainAboveThousand() {
        Assert.assertEquals(service.remain(10000), 0);
    }

    @Test(description="Проверка предельной ситуации чуть ниже тысячи")
    public void testRemainJustBeforeNextBoundary() {
        Assert.assertEquals(service.remain(999), 1);
    }
}