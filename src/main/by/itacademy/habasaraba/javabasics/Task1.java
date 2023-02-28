package by.itacademy.habasaraba.javabasics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double a =in.nextDouble();
        double b =in.nextDouble();
        double c=in.nextDouble();
        double  D=b*b-4*a*c;
        if(D>0){
            double x1,x2;
            x1=(-b+Math.sqrt(D))/(2*a);
            x2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("Корни уравнения: x1= "+ x1 + "x2= "+ x2);
        }
        else if(D==0){
            double x;
            x=-b/(2*a);
            System.out.println("Корень уравнения: x= "+ x);
        }
        else{
            System.out.println("Уравнение не имеет корней");
        }
    }}
