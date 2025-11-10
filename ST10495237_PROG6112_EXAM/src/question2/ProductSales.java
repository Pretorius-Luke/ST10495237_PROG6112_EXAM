/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author lab_services_student
 */
public class ProductSales implements IProductSales {

    @Override
    public int[][] GetProductSales() {
        int[][] sales = {
            {300, 150, 700}, // YEAR 1
            {250, 200, 600} // YEAR 2
        };
        return sales;
    }

    @Override
    public int GetTotalSales() {
        int totalSales = 0;
        int[][] salesData = GetProductSales();  // Fetch sales data
        for (int[] productSales : salesData) {
            for (int sale : productSales) {
                totalSales += sale;
            }
        }
        return totalSales;
    }

    @Override
    public int GetSalesUnderLimit() {
        int count = 0;
        int salesLimit = 200;  // example limit
        int[][] salesData = GetProductSales();  // Fetch sales data
        for (int[] productSales : salesData) {
            for (int sale : productSales) {
                if (sale < salesLimit) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int GetSaleOverLimit() {
        int count = 0;
        int salesLimit = 200;  // example limit
        int[][] salesData = GetProductSales();  // Fetch sales data
        for (int[] productSales : salesData) {
            for (int sale : productSales) {
                if (sale > salesLimit) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int GetProductsProcessed() {
        int[][] salesData = GetProductSales();  // Fetch sales data
        return salesData.length;  // Number of products
    }

    @Override
    public double GetAverageSales() {
        int totalSales = 0;
        int totalEntries = 0;
        int[][] salesData = GetProductSales();  // Fetch sales data
        for (int[] productSales : salesData) {
            for (int sale : productSales) {
                totalSales += sale;
                totalEntries++;
            }
        }
        return totalEntries == 0 ? 0 : (double) totalSales / totalEntries;
    }
}

