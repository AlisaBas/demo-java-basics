package by.itacademy.habasaraba.javabasics;

import java.util.Scanner;
public class Task7 {
    public static int calculator(int a, int b, char operation){
        int result;
        switch(operation) {
            case '+':
                result = a + b;
            case '-':
                result = a - b;
            case '/':
                result = a / b;
            case '*':
                result = a * b;
                break;
            default:
                result = calculator(a, b, operation);
        }
                return result;
    }}

    /*


        String operation=sc.nextLine();
        int result;
        if(operation="+") result= a+b;
        if(operation="-") result=a-b;
        if(operation="*") result=a*b;
        if(operation="/") result=a/b;
        return result;
                    }
                }

     */







