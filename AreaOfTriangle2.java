package problem_solving;

import java.util.Scanner;

public class AreaOfTriangle2 {

    public static void main(String [] args){
        
        double a, b, c, s, area;
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first lenght: ");
        a = input.nextDouble();
        
        System.out.print("Enter Ssecond lenght: ");
        b = input.nextDouble();
        
        System.out.print("Enter third lenght: ");
        c = input.nextDouble();
        
        if(a+b>c && b+c>a && c+a>b){
        
            s = a+b+c/2;
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            
            System.out.println("The area of triangle is: "+area);
        }
        else {
            System.out.println("Triangle not posiable");
        }
    }
}