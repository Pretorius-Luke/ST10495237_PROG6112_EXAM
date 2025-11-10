/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package st10495237_prog6112_exam;

/**
 *
 * @author lab_services_student
 */
public interface IProductSales {
    // Method to find the total sales
    int TotalSales(int[][] productSales);
    
    // Method to find the average of sales
    double AverageSales(int[][] productSales);
    
    // Method to find the maximium sale
    int MaxSale(int[][] productSales);
    
    // Method to find the minimium sale
    int MinSale(int[][] productSales);
    
}
