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
        int maxSaleValue = getMaxSaleValue(sales);
        int maxMonth = 0;
        int monthCounter = 0;
        for (int sale : sales) {
            monthCounter++; //monthCounter = monthCounter + 1;
            if (sale == maxSaleValue) {
                maxMonth = monthCounter;
            }

        }
        return maxMonth;
    }

    private int getMaxSaleValue(int[] sales) {
        int maxSaleValue = sales[0];
        for (int sale : sales) {
            if (sale > maxSaleValue) {
                maxSaleValue = sale;
            }
        }
        return maxSaleValue;
    }

    public int calculateMinMonth(int[] sales) {
        int minSaleValue = getMinMonthValue(sales);
        int minMonth = 0;
        int monthCounter = 0;
        for (int sale : sales) {
            monthCounter++;
            if (sale == minSaleValue) {
                minMonth = monthCounter;
            }
        }
        return minMonth;
    }

    private int getMinMonthValue(int[] sales) {
        int minSaleValue = sales[0];
        for (int sale : sales) {
            if (sale < minSaleValue) {
                minSaleValue = sale;
            }
        }
        return minSaleValue;

    }


    public int calculateCountMonthUnderAverage(int[] sales) {

        int monthUnderAverage = 0;
        int avgSales = calculateAverageSale(sales);
        for (int sale : sales) {
            if (sale < avgSales) {
                monthUnderAverage = monthUnderAverage + 1;
            }
        }
        return monthUnderAverage;
    }

    public int calculateCountMonthAboveAverage(int[] sales) {
        int monthAboveAverage = 0;
        int avgSales = calculateAverageSale(sales);
        for (int sale : sales) {
            if (sale > avgSales)
                monthAboveAverage = monthAboveAverage + 1;
        }
        return monthAboveAverage;
    }

}
