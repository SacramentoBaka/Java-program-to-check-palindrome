import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.print("Enter a Word: ");
        String originalWord = input.next();
        originalWord = originalWord.replace(" ", "");
        String updatedWord = "";

        for (int i = originalWord.length() - 1; i >= 0; i--) {
            updatedWord += originalWord.charAt(i);
        }
        boolean palindrome = true;
        for (int j = 0; j < originalWord.length(); j++) {
            if (originalWord.charAt(j) != updatedWord.charAt(j)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("The Word " + originalWord + " is a Palindrome");
        } else {
            System.out.println("The Word " + originalWord + " is not a Palindrome");
        }
    }
}






        /*
            * // 1 Calculator Program
            System.out.println("_______________________________________");
            System.out.println("Simple Calculator Program to (+, -, *, /).");
            System.out.println("_______________________________________");
            System.out.print("Enter First Value   : ");
            double num1 = input.nextDouble();
            System.out.print("Enter an Operator   : ");
            String operator  = input.next();
            System.out.print("Enter Second Value  : ");
            double num2 = input.nextDouble();

            System.out.println("_______________________________________");
            switch (operator){
                case "+":
                    System.out.println("The Answer is: " + (num1+num2));
                    break;
                case "-":
                    System.out.println("The Answer is: " + (num1-num2));
                    break;
                case "*":
                    System.out.println("The Answer is: " + (num1*num2));
                    break;
                case "/":
                    if(num2 == 0){
                        System.out.println("Cannot divide by 0");
                        return;
                    }
                    System.out.println("The Answer is: " + (num1/num2));
                    break;
                default:
                    System.out.println("Invalid input, please try again");
            }
            System.out.println("_______________________________________");
            *
            *
            *
            *
*/


//
//    public static void main (String[] args) {
//        System.out.println("Hello, Welcome to Fibonacci Sequence number Generator");
//        System.out.println("How Many number you want to be Generated: ");
//        int num = input.nextInt();
//        System.out.println("Okay now i'm printing " + num + " Numbers in the Fibonacci Series");
//        for (int i = 0; i < num; i++) {
//            System.out.print(fibonacciSeries2(i) + " ");
//        }
//        System.out.println("[ Index " + num + " contain a value " + fibonacciSeries2(num) + " ].");
//    }
//    public static long fibonacciSeries2 (long n) {
//
//        long firstValue = 0;
//        long secondValue = 1;
//        long nextValue = 1;
//
//        if (n == 0)
//            return firstValue;
//        else if (n == 1)
//            return secondValue;
//        else if (n == 2) {
//            return nextValue;
//        }
//        for (int i = 3; i <= n; i++) {
//
//            nextValue = firstValue + secondValue;
//            firstValue = secondValue;
//            secondValue = nextValue;
//        }
//        return nextValue;
//    }
