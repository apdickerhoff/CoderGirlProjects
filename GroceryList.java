package com.company;
import static java.lang.System.out;
import java.util.Scanner;
public class GroceryList {
    public static void main(String[] args) {
        // ---- Your code goes below this line ----
        Scanner keyboard = new Scanner(System.in);
        String Item1;
        String Item2;
        String Item3;
        int Quantity1;
        int Quantity2;
        int Quantity3;
        float Cost1;
        float Cost2;
        float Cost3;
        float total_cost;
        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? ");
        Item1 = keyboard.next();
        out.print("Item 2? ");
        Item2 = keyboard.next();
        out.print("Item 3? ");
        Item3 = keyboard.next();

        out.println("Now, please enter the quantity of each item.");
        out.print("How many " + Item1 + "? ");
        Quantity1 = keyboard.nextInt();
        out.print("How many " + Item2 + "? ");
        Quantity2 = keyboard.nextInt();
        out.print("How many " + Item3 + "? ");
        Quantity3 = keyboard.nextInt();

        out.println("Now, please enter the price of each item.");
        out.print("How much does one " + Item1 + " cost? ");
        Cost1 = keyboard.nextFloat();
        out.print("How much does one " + Item2 + " cost? ");
        Cost2 = keyboard.nextFloat();
        out.print("How much does one " + Item3 + " cost? ");
        Cost3 = keyboard.nextFloat();

        total_cost = Quantity1*Cost1 + Quantity2*Cost2 + Quantity3*Cost3;
        out.println("Calculating your grocery bill.");
        out.println("Your total cost is " + total_cost);

    }
}

