package problem_solving;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        boolean isPrime = true;
        
        System.out.print("Enter A Number: ");
        number = input.nextInt();
        
        for(int i = 2; i<number; i++){
            if(number%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("not Prime");
        }
    }
}
