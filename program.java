package com.company;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class program {
    public static void main (String[]args){
        while(true) {
            Scanner input = new Scanner(System.in);
            String choose;
            System.out.print("\nAND, OR, NOT: ");
            choose = input.nextLine();
            if (choose.equals("AND") || choose.equals("and") || choose.equals("1")) {
                Integer IF1;
                System.out.print("\nIF1: ");
                IF1 = input.nextInt();
                Integer IF2;
                System.out.print("IF2: ");
                IF2 = input.nextInt();
                if (IF1.equals(1) && (IF2.equals(1))) {
                    System.out.print("\nLamp is aan.\n");
                }
                if (IF1.equals(0) && (IF2.equals(0))) {
                    System.out.print("\nLamp is uit.\n");
                }
                if (IF1.equals(0) && (IF2.equals(1))) {
                    System.out.print("\nLamp is uit\n");
                }
            } else if (choose.equals("OR") || choose.equals("or") || choose.equals("2")) {
                Integer IF1;
                System.out.print("\nIF1: ");
                IF1 = input.nextInt();
                Integer IF2;
                System.out.print("IF2: ");
                IF2 = input.nextInt();
                if (IF1.equals(1) && (IF2.equals(1))) {
                    System.out.print("\nLamp is aan.\n");
                }
                if (IF1.equals(1) && (IF2.equals(0))) {
                    System.out.print("\nLamp is aan.\n");
                }
                if (IF1.equals(0) && (IF2.equals(1))) {
                    System.out.print("\nLamp is aan\n");
                }
                if (IF1.equals(0) && (IF2.equals(0))) {
                    System.out.println("\nLamp is uit\n");
                }
            } else if (choose.equals("NOT") || choose.equals("not") || choose.equals("3")) {
                Integer IF1;
                System.out.print("\nIF1: ");
                IF1 = input.nextInt();
                if (IF1.equals(1)) {
                    System.out.print("\nLamp is uit.\n");
                }
                if (IF1.equals(0)) {
                    System.out.print("\nLamp is aan.\n");
                }
            }
        }
    }
}
