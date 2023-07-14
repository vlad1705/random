package com.company;

import java.util.Scanner;

public class task0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the number of iterations: ");
        int countOfcycles = scan.nextInt();

        for (int i = 0; i < countOfcycles; i++) {
            System.out.print("Enter the group of 3 numbers: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int acumulator = a;
            for (int j = 0; j < n; j++) {
                acumulator = acumulator + ((int) Math.pow(2, j)) * b;
                System.out.println(acumulator);
            }
        }
        scan.close();
    }

}

