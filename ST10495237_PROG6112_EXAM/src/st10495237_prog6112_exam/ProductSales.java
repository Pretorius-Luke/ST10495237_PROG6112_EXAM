/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10495237_prog6112_exam;

/**
 *
 * @author lab_services_student
 */
public class ProductSales implements IProductSales{


    // Method to find the total sales
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for (int[] row : productSales) {
            for (int sale : row) {
                total += sale;
            }
        }
        return total;
    }

    // Method to find the average of sales
    @Override
    public double AverageSales(int[][] productSales) {
        int total = 0;
        int count = 0;
        for (int[] row : productSales) {
            for (int sale : row) {
                total += sale;
                count++;
            }
        }
        return count == 0 ? 0 : (double) total / count;
    }

    // Method to find the maximum sale
    @Override
    public int MaxSale(int[][] productSales) {
        int max = Integer.MIN_VALUE;
        for (int[] row : productSales) {
            for (int sale : row) {
                if (sale > max) {
                    max = sale;
                }
            }
        }
        return max;
    }

    // Method to find the minimum sale
    @Override
    public int MinSale(int[][] productSales) {
        int min = Integer.MAX_VALUE;
        for (int[] row : productSales) {
            for (int sale : row) {
                if (sale < min) {
                    min = sale;
                }
            }
        }
        return min;
    }



        
    }


    
   

