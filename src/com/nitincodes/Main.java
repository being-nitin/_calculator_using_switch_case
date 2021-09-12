package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // simple calculator using switch case:
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1 = sc.nextInt();
        System.out.println("enter the second number");
        int n2 = sc.nextInt();
        System.out.println("select symbol(+,-,*,/)");
        String sym = sc.next();
        int res;
        switch (sym) {
            case "+":
                res = n1 + n2;
                System.out.println("the sum of" + n1 + "and" + n2 + " is " + res);
                break;
            case "-":
                res = n1 - n2;
                System.out.println("the difference of" + n1 + "and" + n2 + " is" + res);
                break;
            case "*":
                res = n1 * n2;
                System.out.println("the product of" + n1 + "and" + n2 + " is" + res);
                break;
            case "/":
                res = n1 / n2;
                System.out.println("the sum of " + n1 + " and " + n2 + " is " + res);
                break;
            default:
                System.out.println("Null");
        }
    }
}