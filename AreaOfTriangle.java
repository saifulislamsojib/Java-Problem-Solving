package problem_solving;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String [] args){
        
        double base, height, area;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give the base: ");
        base = input.nextDouble();
        
        System.out.print("Give the height: ");
        height = input.nextDouble();
        
        area = 0.5 * base * height;
        System.out.println("The area of triangle is: "+area);
    }
}
