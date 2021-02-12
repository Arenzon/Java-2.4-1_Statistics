package ru.netology.statistics;

public class StatisticsService {


        public int calculateSum ( int[] sales ) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int arithmeticMean ( int[] sales ) {

        int average = calculateSum(sales) / sales.length;

        return average;

    }

    public int monthOfMaxSale ( int[] sales ) {
        int month = 0;
        int n = 0;
        int currentMax = sales[0];
        for (int sale : sales) {
            if (currentMax <= sale) {
                currentMax = sale;
                n = month;
            }
            month++;
        }
        n++;
        return n;

    }

    public int monthOfMinSale ( int[] sales ) {
        int month = 0;
        int n = 0;
        int currentMin = sales[0];
        for (int sale : sales) {
            if (currentMin > sale) {
                currentMin = sale;
                n = month;
            }
            month++;
        }
        n++;
        return n;

    }

    public int sumMonthMinMean ( int[] sales ) {
        int average = average(sales);
        int sumMonth = 0;
        for (int sale : sales) {
            if (average > sale) {
                sumMonth++;
            }
        }
        return sumMonth;

    }

    private int average ( int[] sales ) {
        return calculateSum(sales) / sales.length;

    }

    public int sumMonthMaxMean ( int[] sales ) {
        int average = average(sales);
        int sumMonth = 0;
        for (int sale : sales) {
            if (average < sale) {
                sumMonth++;
            }
        }
        return sumMonth;
    }
}
