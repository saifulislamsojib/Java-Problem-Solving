package problem_solving;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Row Number: ");
        num = input.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
//                System.out.print(" " + j);
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
