package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;

public class BillGenerator {


    private static double totalCost;
    private static double totalSalesTax;

    public static Item getTheItem(String line) {
        String name = "";
        String[] result = line.split(" ");
        int numberOfTokens = result.length;
        double shelfPrice = Double.parseDouble(result[numberOfTokens - 1]);
        int quantity = Integer.parseInt(result[0]);
        for (int n = 1; n <= numberOfTokens - 3; n++) {
            name += result[n];
            if(n<numberOfTokens-3) name+=" ";
        }
        boolean imported = line.contains("imported");
        return new Item(name, shelfPrice, imported);
    }


    public static void main(String[] args) {
        try {

            File file = new File("Input.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                Item item = getTheItem(line);
                System.out.println("1 " + item.getName() + ": " + item.getCostOfItem());
                totalCost+=item.getCostOfItem();
                totalSalesTax+=item.getCostOfItem()-item.getShelfPrice();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        DecimalFormat currencyFormat = new DecimalFormat("#.##");
        totalSalesTax = Double.parseDouble(currencyFormat.format(totalSalesTax));
        totalCost = Double.parseDouble(currencyFormat.format(totalCost));
        System.out.println("Sales Tax: "+totalSalesTax);
        System.out.println("Total: " + totalCost);
    }
}
