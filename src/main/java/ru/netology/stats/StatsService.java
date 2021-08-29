package ru.netology.stats;

public class StatsService {

    public int calculateSumSales(int[] sales) {
        int sumSales = 0;
        for (int sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public int calculateAverageSale(int[] sales) {

        return calculateSumSales(sales) / sales.length;
    }

    public int calculateMaxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateCountMonthUnderAverage(int[] sales) {

        int monthUnderAverage = 0;

        for (int sale : sales) {
            if (sale < (calculateSumSales(sales) / sales.length)) {
                monthUnderAverage = monthUnderAverage + 1;
            }
        }
        return monthUnderAverage;
    }

    public int calculateCountMonthAboveAverage(int[] sales) {
        int monthAboveAverage = 0;

        for (int sale : sales) {
            if (sale > (calculateSumSales(sales) / sales.length))
                monthAboveAverage = monthAboveAverage + 1;
        }
        return monthAboveAverage;
    }

}
