package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldCalculateSumOfSales () {
        StatsService service1 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service1.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales () {
        StatsService service2 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service2.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxSalesMonth () {
        StatsService service3 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service3.findMax(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinSalesMonth () {
        StatsService service4 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service4.findMin(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthsWithSalesBelowAverage () {
        StatsService service5 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service5.monthsBelowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthsWithSalesAboveAverage () {
        StatsService service6 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service6.monthsAboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
