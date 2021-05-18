package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m;

        System.out.print("Введите номер месяца: ");
        m = input.nextInt();

        if (m==2||m==1||m==12){
            System.out.print("Winter");
        }
        else if(m==3 || m==4 || m==5){
            System.out.print("Spring");
        }
        else if(m==6 || m==7 || m==8){
            System.out.print("Summer");
        }
        else if (m==9 || m==10 || m==11){
            System.out.print("Autumn");
        }
        else{
            System.out.print("Error");
        }
    }
}
