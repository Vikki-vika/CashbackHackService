package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test(description = "Тестирование правильной выдачи остаточной суммы")
    public void shouldReturnCorrectRemainAmountForSmallPurchase() {
        CashbackHackService cashbackService = new CashbackHackService();
        int result = cashbackService.remain(900);
        Assert.assertEquals(result, 100); // проверка правильности расчета
    }

    @Test(description = "Ошибка: некорректная обработка целочисленного деления")
    public void shouldFailOnEdgeCaseOfZeroAmount() {
        CashbackHackService cashbackService = new CashbackHackService();
        int result = cashbackService.remain(0);
        Assert.assertEquals(result, 1000); // ожидалось 1000, но метод возвращает неверный результат
    }

    @Test(description = "Проверка обработки точного совпадения с границей кешбэка")
    public void shouldHandleExactBoundaryMatch() {
        CashbackHackService cashbackService = new CashbackHackService();
        int result = cashbackService.remain(1000);
        Assert.assertEquals(result, 0); // ожидаемый результат — ноль дополнительного расхода
    }
}