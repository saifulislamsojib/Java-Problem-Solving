package problem_solving;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String [] args){
    
        int num1 = 15;
        int num2 = 30;
        float num3 = 5.5f;
        double num4 = 5.5;
        char a = 'a';
        String name = "Saiful Islam Sojib";
        float sum = num1 + num2 + num3;
        boolean isThif = true;
        
        System.out.printf("%d + %d + %.2f = %f\n", num1, num2, num3, sum);
        System.out.printf("print %c\n", a);
        System.out.printf("print %s\n", name);
        System.out.printf("Result %b %f\n", isThif, num4);
        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Write Your Name: ");
//        String name1 = input.next();
//        System.out.println(name1);

        int random = (int) Math.floor(100+Math.random()*400);
        
        System.out.println(random);
        
    }
}