package problem_solving;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int sum = 0, num, temp, r;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = input.nextInt();
        temp = num;
        
        while(temp != 0) {
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }
        
        if(num == sum){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }
    }
}
