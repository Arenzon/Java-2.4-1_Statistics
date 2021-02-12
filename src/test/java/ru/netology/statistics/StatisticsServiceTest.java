package ru.netology.statistics;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {

    @org.junit.jupiter.api.Test
    void sumArray () {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void arithmeticMean () {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.arithmeticMean(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void montOfMaxSale () {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.monthOfMaxSale(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void montOfMinSale () {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.monthOfMinSale(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumMontMinMean () {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.sumMonthMinMean(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumMontMaxMean () {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.sumMonthMaxMean(sales);

        assertEquals(expected, actual);
    }
}
