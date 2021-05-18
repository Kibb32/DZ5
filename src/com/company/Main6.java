package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n;
        int result;

        System.out.print("Введите год: ");
        n = input.nextInt();

        if (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)){
            System.out.print("12/09/2000");
        }else {
            System.out.print("13/09/2000");
        }



    }
}
