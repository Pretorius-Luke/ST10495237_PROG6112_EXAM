/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10495237_prog6112_exam;

/**
 *
 * @author lab_services_student
 */
public class ST10495237_PROG6112_EXAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] quarter = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};
        String[] names = {"YEAR 1", "YEAR 2"};

        int temp1 = 0;
        int temp2 = 0;

        //sales data stored in a 2D array for easier management
        int[][] sales = {
            {300, 150, 700}, // YEAR 1
            {250, 200, 600} // YEAR 2
        };

        System.out.println("PRODUCT SALES REPORT - 2025");

        //dashed line
        System.out.println("-------------------------------------------------");

        //total sales calculation
        for (int i = 0; i < 3; i++) {
            temp1 += sales[0][i];

        }

        for (int i = 0; i < 3; i++) {
            temp2 += sales[1][i];

        }
        //calculating total
        int total = temp2 + temp1; 
        //calculating avg
        int temp3 = (total / 6);
        int avg = (int) Math.round(temp3);
        //variables for highest and lowest
        int highestValue = 0;
        int lowestValue = sales[0][0];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > highestValue) {
                    highestValue = sales[i][j];
                }
            }
        }
        
        for (int i = 0; i < sales.length; i++) { 
            for (int j = 0; j < sales[i].length; j++) { 
                if (sales[i][j] < lowestValue) {
                    lowestValue = sales[i][j]; 
                }
            }
        }

        System.out.println("Total sales: " + total);
        System.out.println("Average sales: " + avg);
        System.out.println("Maximium sales: " + highestValue);
        System.out.println("Minimium sales: " + lowestValue);
        System.out.println("-------------------------------------------------");


    }

}
