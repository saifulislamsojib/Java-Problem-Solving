package problem_solving;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, fact = 1;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        
        if(n<0){
            System.out.println("Negative Number not allowed");
        }
        else if(n==0||n==1) {
            fact = 1;
        }
        else {
            for (int i = n; i >= 1; i--) {
               fact =  fact * i;
               System.out.println(i);
            }
        }
        System.out.println(fact);
    }
}
