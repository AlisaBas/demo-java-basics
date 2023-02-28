package by.itacademy.habasaraba.javabasics;

import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {

        //2.Отобразить в окне консоли аргументы командной строки в обратном порядке
        //https://metanit.com/java/tutorial/7.3.php Stringbuffer похоже переводит вводимые данные в буфер строк, далее обрабатывает и выводит по принципу reverse
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            StringBuffer toll = new StringBuffer(vvod.nextLine());
            toll.reverse();
            System.out.println("Hello " + toll.toString()); //relbmessa
        }
    }
}

   /* public class CommandLineParams {
        public static void main(String[] args) { for(int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + " = " + args[i]); }
        } }
 public static void main(String[] args) { for(int i = args.length-1; i >=0; i--) {
            System.out.println("Argument " + i + " = " + args[i]); }
        } }
*/


