package problem_solving;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = input.nextInt();
        
        for(int i = num; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
//                System.out.print(" "+j);
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
