package ru.netology.stats.services;

public class StatsService {
    public long amountSales(long[] sales) {
        long amount = 0;
        for (long s : sales) {
            amount = amount + s;
        }
        return amount;
    }

    public long amountSalesAverage(long[] sales) {
        long amount = 0;
        long amountAverage = 0;
        for (long s : sales) {
            amount = amount + s;
            amountAverage = amount / sales.length;
        }
        return amountAverage;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowerMiddle(long[] sales) {
        long amount = 0;
        long amountAverage = 0;
        int counter = 0;
        for (long s : sales) {
            amount = amount + s;
            amountAverage = amount / sales.length;
        }
        for (long s : sales) {
            if (s < amountAverage) {
                counter++;
            }
        }
        return counter;
    }

    public int upperMiddle(long[] sales) {
        long amount = 0;
        long amountAverage = 0;
        int counter = 0;
        for (long s : sales) {
            amount = amount + s;
            amountAverage = amount / sales.length;
        }
        for (long s : sales) {
            if (s > amountAverage) {
                counter++;
            }
        }
        return counter;
    }
}
