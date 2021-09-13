/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double euros, usd, exchange_rate;

        System.out.print("How many euros are you exchanging? ");
        euros = user_input.nextDouble();
        System.out.print("What is the exchange rate? ");
        exchange_rate = user_input.nextDouble();

        usd=(euros*exchange_rate);

        System.out.println(String.format("%.2f at an exchange rate of "+ exchange_rate +" is\n%.2f U.S. dollars",euros,usd));
    }
}
