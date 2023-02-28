package by.itacademy.habasaraba.javabasics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = a / 10;
        if(a<=10){
            System.out.println(1);
        }
       else if(b%10==0){
            System.out.println((Math.round(b)-1));

    }
    else {
            System.out.println((Math.round(b)+1));
    }
    }}


