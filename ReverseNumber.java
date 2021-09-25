package problem_solving;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int sum = 0, num, temp, r;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = input.nextInt();
        temp = num;
        
        while(temp != 0){
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        
        System.out.println("Reverse of "+num+" = "+sum);
    }
}
