package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @org.junit.jupiter.api.Test
    void sumArray() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void arithmeticMean() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.arithmeticMean(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void montOfMaxSale() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.monthOfMaxSale(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void montOfMinSale() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.monthOfMinSale(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumMontMinMean() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.sumMonthMinMean(sales);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void sumMontMaxMean() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.sumMonthMaxMean(sales);

        assertEquals(expected, actual);
    }
}