package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int findMax(int[] sales) {
        int maxMonth = 0;
        int currentMonth = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = currentMonth;
            }
            currentMonth = currentMonth + 1;
        }
        return maxMonth + 1;
    }

    public int findMin(int[] sales) {
        int minMonth = 0;
        int currentMonth = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = currentMonth;
            }
            currentMonth = currentMonth + 1;
        }
        return minMonth + 1;
    }

    public int monthsBelowAverageSales(int[] sales) {
        int averageSale = sumSales(sales) / sales.length;
        int monthsBelowAverage = 0;
        for (int sale : sales) {
            if (sale < averageSale) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public int monthsAboveAverageSales(int[] sales) {
        int averageSale = sumSales(sales) / sales.length;
        int monthsAboveAverage = 0;
        for (int sale : sales) {
            if (sale > averageSale) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }
}




