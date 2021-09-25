package problem_solving;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int a, b, c, result;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        a = input.nextInt();
        
        System.out.print("Enter second number: ");
        b = input.nextInt();
        
        System.out.print("Enter third number: ");
        c = input.nextInt();
        
        if(a>b && a>c){
            result = a;
        }
        else if(b>a && b>c){
            result = b;
        }
        else{
            result = c;
        }
        System.out.println("The largest number is : "+result);    }
}
