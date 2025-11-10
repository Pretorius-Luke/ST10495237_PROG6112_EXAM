/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testTotalSales() {
        ProductSales product = new ProductSales();

        int[][] sales = {
            {100, 200, 150},
            {300, 250, 400},
            {50, 100, 75}
        };

        int expectedTotal = 100 + 200 + 150 + 300 + 250 + 400 + 50 + 100 + 75; // Sum of all sales
        int actualTotal = product.TotalSales(sales);

        assertEquals(expectedTotal, actualTotal, "Total sales should be correct");
    }

    @Test
    public void testAverageSales() {
        ProductSales product = new ProductSales();

        int[][] sales = {
            {100, 200, 150},
            {300, 250, 400},
            {50, 100, 75}
        };

        // Total sales = 100 + 200 + 150 + 300 + 250 + 400 + 50 + 100 + 75 = 1625
        // Total number of sales = 9
        double expectedAverage = 1625.0 / 9; 
        double actualAverage = product.AverageSales(sales);

        assertEquals(expectedAverage, actualAverage, 0.001, "Average sales should be correct");
    }
}
