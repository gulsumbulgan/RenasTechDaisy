package students.zelal.practice;

public class Lab03 {

    public static void main(String[] args) {


//        Learn how to utilize arithmetic in Java code
//
//## Objective
//        Create a program that adds two numbers together. Assign a variable to each number. Print out the sum in the console
//
//### Hello All, Below is the homework for Java.
//###  1.  Write a Java program to print the result of the following operations.

//        Test Data:
//        a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6);

//        b. (55+9) % 9
        System.out.println((55+9) % 9);

//        c. 20 + -3*5 / 8
        System.out.println(20 + -3*5 / 8);

//        d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println( 5 + 15 / 3 * 2 - 8 % 3);

//### 2. Write a Java program that prints the multiplication table of a number. For example, below is the output for multiplication table of 2.
//        OUTPUT
//                ----------
//        2 * 1 = 2
//        2 * 2 = 4
//        2 * 3 = 6
//        2 * 4 = 8
//                .
//.
//.
//        2 * 10 = 20

        int f=3;
        for(  int counter=1  ; counter<=10;    counter++ ){
            int result=f*counter;
            System.out.println("2 * " + counter + "= "+counter);
        }








    }
}
