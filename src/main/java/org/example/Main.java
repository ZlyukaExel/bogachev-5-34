package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        for (int i = 1; i <= s; i++) {
            int p = s-i;
            System.out.print(" ".repeat(p*p));
            printLine(i,p);
        }
    }

    public static void printLine(int n,int p){
        for (int i = 0; i <= n; i++) {
            System.out.print("/".repeat(i)+"\\".repeat(i)+" ".repeat(2*p));
        }

        for (int i = n-1; i > 0; i--) {
            System.out.print("/".repeat(i)+"\\".repeat(i)+" ".repeat(2*p));
        }

        System.out.println();
    }
}