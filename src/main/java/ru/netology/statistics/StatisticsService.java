package ru.netology.statistics;

public class StatisticsService {


        public long calculateSum(long[] sales) {
            long sum = 0;
            for (long sale : sales) {
                sum += sale;
            }
            return sum;
        }

        public float arithmeticMean(long[] sales) {

            float average = calculateSum(sales)/sales.length;

            return average;

        }
        public long monthOfMaxSale(long[] sales){
            int month = 0;
            int n=0;
            long currentMax = sales[0];
            for (long sale : sales) {
                if (currentMax <= sale){
                    currentMax = sale;
                    n=month;
                }
                month++;
            }
            n++;
            return n;

        }
        public long monthOfMinSale(long[] sales){
            int month = 0;
            int n=0;
            long currentMin = sales[0];
            for (long sale : sales) {
                if (currentMin > sale){
                    currentMin = sale;
                    n=month;
                }
                month++;
            }
            n++;
            return n;

        }

        public long sumMonthMinMean(long[] sales){
            int sumMonth = 0;
            float arithmeticMean = calculateSum(sales)/sales.length;
            for (long sale : sales) {
                if (arithmeticMean > sale){
                    sumMonth++;
                }
            }
            return sumMonth;

        }

        public long sumMonthMaxMean(long[] sales){
            int sumMonth = 0;
            float arithmeticMean = calculateSum(sales)/sales.length;
            for (long sale : sales) {
                if (arithmeticMean < sale){
                    sumMonth++;
                }
            }
            return sumMonth;
        }
    }