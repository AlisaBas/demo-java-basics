package by.itacademy.habasaraba.javabasics;

import org.junit.Test;

import java.util.Scanner;

public class Task7Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        char operation=sc.next().charAt(0);
        Task7 task7=new Task7();
        int result= task7.calculator(a,b,operation);
        System.out.println("Результат операции " +result );
    }
}

