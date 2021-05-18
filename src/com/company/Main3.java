package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 7;
        int i = 1;
        int result;

        while (i < 10) {

            result = a * i;
            System.out.println(+result);

            ++i;
        }
    }
}
