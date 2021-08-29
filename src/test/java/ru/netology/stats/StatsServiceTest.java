package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSumSales() {

        int expected = 180;
        int actual = service.calculateSumSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void calculateAverageSale() {

        int expected = 15;
        int actual = service.calculateAverageSale(sales);

        assertEquals(expected, actual);

    }

    @Test
    void calculateMaxMonth() {

        int expected = 8;
        int actual = service.calculateMaxMonth(sales);

        assertEquals(expected, actual);

    }

    @Test
    void calculateMinMonth() {

        int expected = 9;
        int actual = service.calculateMinMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateCountMonthUnderAverage() {

        int expected = 5;
        int actual = service.calculateCountMonthUnderAverage(sales);

        assertEquals(expected, actual);

    }

    @Test
    void calculateCountMonthAboveAverage() {

        int expected = 5;
        int actual = service.calculateCountMonthAboveAverage(sales);

        assertEquals(expected, actual);
    }

}