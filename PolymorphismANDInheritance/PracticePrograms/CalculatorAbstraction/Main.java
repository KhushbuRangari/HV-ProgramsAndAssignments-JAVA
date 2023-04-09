package CalculatorAbstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Addition\n 2)Subtraction\n 3)Multiple\n 4)Division\n 5)Modulo ");
        System.out.println("Enter your Choice :");
        int ch = sc.nextInt();
      

        switch (ch) {
            case 1:
                sc = new Scanner(System.in);
                System.out.println("Enter number a for addition ");
                int a = sc.nextInt();
                System.out.println("Enter number b for addition ");
                int b = sc.nextInt();
                cal = new Calculator(a, b);

                System.out.println("The addition of numbers given is :" + cal.add(a, b));

                break;
            case 2:
                sc = new Scanner(System.in);
                System.out.println("Enter number a for subtraction ");
                a = sc.nextInt();
                System.out.println("Enter number b for subtraction ");
                b = sc.nextInt();
                cal = new Calculator(a, b);

                System.out.println("The Subtraction of numbers given is :" + cal.subtract(a, b));
                break;
            case 3:
                sc = new Scanner(System.in);
                System.out.println("Enter number a for multiply ");
                a = sc.nextInt();
                System.out.println("Enter number b for multiply ");
                b = sc.nextInt();
                cal = new Calculator(a, b);

                System.out.println("The Multiplication of numbers given is :" + cal.multiply(a, b));
                break;
            case 4:
                sc = new Scanner(System.in);
                System.out.println("Enter number a for divide ");
                a = sc.nextInt();
                System.out.println("Enter number b for divide ");
                b = sc.nextInt();
                cal = new Calculator(a, b);

                System.out.println("The Division of numbers given is :" + cal.divide(a, b));
                break;
            case 5:
                sc = new Scanner(System.in);
                System.out.println("Enter number a for addition ");
                a = sc.nextInt();
                System.out.println("Enter number b for addition ");
                b = sc.nextInt();
                cal = new Calculator(a, b);

                System.out.println("The Modulo of numbers given is :" + cal.modulo(a, b));
                break;
            case 6:
                System.exit(0);

        }
    }
    }
}
