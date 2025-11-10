/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package question2;

/**
 *
 * @author lab_services_student
 */
public interface IProductSales {
    
    int[][] GetProductSales();
    
    int GetTotalSales();
    
    int GetSalesUnderLimit();
    
    int GetSaleOverLimit();
    
    int GetProductsProcessed();
    
    double GetAverageSales();
    
}
