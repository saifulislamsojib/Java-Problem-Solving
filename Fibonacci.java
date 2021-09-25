package problem_solving;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       int first, second, fibo, n;
       first = 0;
       second = 1;
       
       Scanner input = new Scanner(System.in);
       System.out.print("Please Enter Value of N: ");
       n = input.nextInt();
       
       System.out.print(first+"  "+second);
       
       for(int i = 0; i<(n-2); i++){
           fibo = first + second;
           System.out.print("  " + fibo);
           first = second;
           second = fibo;
       }
       System.out.println();
    }
}
