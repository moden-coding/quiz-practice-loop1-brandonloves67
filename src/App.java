
/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int countodd = 0;
        int counteven = 0;
        System.out.println("Give me an integer: ");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
           
            }
            if ( number % 2 == 1) {
                System.out.println(number + "is odd");
                
            }
            else{System.out.println(number + "is even");}

            if (number % 2 == 0) {
                counteven++;

            } else {
                countodd++;
            }



            }
             System.out.println("Number of even numbers: " + counteven);
        System.out.println("Number of odd numbers: " + countodd);
        }
       
    }
