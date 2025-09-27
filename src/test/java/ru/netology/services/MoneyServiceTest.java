package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MoneyServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/money.csv")
    public void testRegisteredUnderLimit(int expected, int threshold, int income, int expenses) {
        MoneyService service = new MoneyService();

        int actual = service.calculate(threshold, income, expenses);

        Assertions.assertEquals(expected, actual);
    }
}
