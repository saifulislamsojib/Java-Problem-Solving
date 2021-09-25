package problem_solving;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        
        char c;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Write a charactor: ");
        c = input.next().toLowerCase().charAt(0);
        
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant"+c);
        }
        
    }
}
