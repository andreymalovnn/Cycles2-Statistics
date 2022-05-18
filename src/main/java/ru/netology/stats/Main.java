package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service1 = new StatsService();
        int sum = service1.sumSales(sales);
        System.out.println("Сумма всех продаж = " + sum);

        StatsService service2 = new StatsService();
        int average = service2.averageSales(sales);
        System.out.println("Средняя сумма продаж в месяц = " + average);

        StatsService service3 = new StatsService();
        int maxMonth = service3.findMax(sales);
        System.out.println("Номер месяца, в котором был пик продаж = " + maxMonth);

        StatsService service4 = new StatsService();
        int minMonth = service4.findMin(sales);
        System.out.println("Номер месяца, в котором был минимум продаж = " + minMonth);

        StatsService service5 = new StatsService();
        int monthsBelowAverage = service5.monthsBelowAverageSales(sales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего = " + monthsBelowAverage);

        StatsService service6 = new StatsService();
        int monthsAboveAverage = service6.monthsAboveAverageSales(sales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего = " + monthsAboveAverage);
    }
}
