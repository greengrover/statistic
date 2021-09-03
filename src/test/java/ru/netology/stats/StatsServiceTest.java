package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    StatsService service = new StatsService();
    int[] sales = {15, 8, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSumSales() {

        assertEquals(180, service.calculateSumSales(sales));

    }

    @Test
    void calculateAverageSale() {

        assertEquals(15, service.calculateAverageSale(sales));

    }

    @Test
    void calculateMaxMonth() {

        assertEquals(8, service.calculateMaxMonth(sales));

    }

    @Test
    void calculateMinMonth() {

        assertEquals(9, service.calculateMinMonth(sales));
    }

    @Test
    void calculateCountMonthUnderAverage() {

        assertEquals(5, service.calculateCountMonthUnderAverage(sales));

    }

    @Test
    void calculateCountMonthAboveAverage() {

        assertEquals(5, service.calculateCountMonthAboveAverage(sales));
    }

}