/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.*;

/**
 *
 * @author lab_services_student
 */
public class ProductSalesApplication extends JFrame implements ActionListener {

    private JTextArea txt;
    private JButton save, load;

    // main method
    public static void main(String[] args) {
        ProductSalesApplication sales = new ProductSalesApplication();
        sales.setVisible(true);
        sales.setSize(300, 350);
        sales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //using methods and name
    public ProductSalesApplication() {
        super("Product Sales Application");
        setLayout(new GridLayout(3, 1));
        addMenu();
        addButtons();
        addTxtArea();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //variables for actionlistener
        Object source = e.getSource();
        String com = e.getActionCommand();
        //adding menu commands
        if (com.equals("Save Product Data")) {

            writeToFile();

        } else if (com.equals("Load Porduct Data")) {

            readFromFile();
        }
        //adding button commands
        if (source == save) {

            writeToFile();
            txt.setText("File Saved");

        } else if (source == load) {
            readFromFile();
        }

    }

    //adding the text area
    private void addTxtArea() {
        JPanel panel = new JPanel();
        txt = new JTextArea(10, 10);
        txt.setEditable(false); //setting txt area to non editable
        salesCalculations();
        panel.add(txt);

        add(panel);

    }

    private void addButtons() {
        JPanel panel = new JPanel();

        load = new JButton("Load Product Data");
        load.addActionListener(this);

        save = new JButton("Save Product Data");
        save.addActionListener(this);

        panel.add(load);
        panel.add(save);

        add(panel);

    }

    //adding the menu bar to the GUI
    private void addMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("exit");
        exitItem.addActionListener(this);
        fileMenu.add(exitItem);

        JMenu toolsMenu = new JMenu("Tools");

        JMenuItem loadItem = new JMenuItem("Load Product Data");
        JMenuItem clearItem = new JMenuItem("Clear");
        JMenuItem saveItem = new JMenuItem("Save Product Data");

        loadItem.addActionListener(this);
        clearItem.addActionListener(this);
        saveItem.addActionListener(this);

        toolsMenu.add(loadItem);
        toolsMenu.add(saveItem);
        toolsMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);

        setJMenuBar(menuBar);
    }

    //write to file method
    private void writeToFile() {
        String fileName = "data.txt";
        String content = txt.getText();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("DATA LOG\n" + "*******\n" + content + "\n**********");
            System.out.println("Content successfully written to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    private void readFromFile() {
        String filePath = "data.txt"; // Replace with your file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                txt.append(line + "\n");

            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private void salesCalculations() {

        int temp1 = 0;
        int temp2 = 0;

        //sales data stored in a 2D array for easier management
        int[][] sales = {
            {300, 150, 700},
            {250, 200, 600}};
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
        //variables for under and over the limit

        int over = 0;
        int under = sales[0][0];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > 500) {
                    over += 1;  // Increment 'over' counter
                }
            }
        }

// Loop through the 2D array to count numbers less than 500
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] < 500) {
                    under += 1;  // Increment 'under' counter
                }
            }
        }

        txt.setText("Total Sales: " + total
                + "\nAverage Sales: " + avg
                + "\nSales over limit: " + over
                + "\nSales over limit: " + (under-300)
        );

    }

}
