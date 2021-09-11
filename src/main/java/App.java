/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
public class App
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        float order = sc.nextFloat();
        sc.nextLine();
        System.out.print("What is the State? ");
        String state = sc.nextLine();
        float tax = 0;
        float total = order;
        float realTax = 0;
        String build = String.format("The total is $%.2f", order);
        if (state.equals("WI"))
        {
            tax =(float) .055;
            realTax = order * tax;
            order = order * (1 + tax);
            build = String.format("The subtotal is $%.2f \nThe tax is $%.2f \nThe total is $%.2f", total, realTax, order);
        }
        System.out.println(build);
    }
}
