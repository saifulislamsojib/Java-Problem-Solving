package problem_solving;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n;
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter End Number: ");
        n = input.nextInt();
        
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
            else {
                isPrime = true;
            }
        }
        
    }
}
