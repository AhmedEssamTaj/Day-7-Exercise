import java.util.Scanner;

/*
Author: Ahmed Essam Taj
Date: 28, October
Day 7 Exercise

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 /*
        Q1/ Write a Java method to find the smallest number among three
numbers

 */
        // ===== answer Q1 ==============
        System.out.println("=============== Q1 =======================");
        System.out.println("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input the third number: ");
        int thirdNumber = scanner.nextInt();
        int small = smallest(firstNumber, secondNumber, thirdNumber);
        System.out.println(small);


 /*
        Q2/  Write a Java method that check if the entered number is negative or
positive or zero.

 */
        // ===== answer Q2 ==============
        System.out.println("=============== Q2 =======================");
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("number ("+number+") is " + numberType(number));

/*
        Q3/  Write a Java method to check whether a string is a valid password.

 */
        // ===== answer Q3 ==============
        System.out.println("=============== Q3 =======================");
        System.out.println("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits\n" +
                "Input a password (You are agreeing to the above Terms and\n" +
                "Conditions.)");
        String password = scanner.next();
        boolean isValidPassword = isValid(password);
        System.out.println("password ("+password+") is " + isValidPassword);

    }

    // ===== Q1 Method ======
    public static int smallest(int num1, int num2, int num3) {
        int smallest = num1;
        if (num3 < num2 && num3 < smallest) {
            smallest = num3;
        }else if (num2 < num1 && num2 < num3) {
            smallest = num2;
        }
        return smallest;

    }

    // ===== Q2 Method ======
    public static String numberType(int num) {

        if (num < 0) {
            return "Negative";
        }else if (num == 0) {
            return "Zero";
        }else {
            return "Positive";
        }

    }

    // ===== Q3 Methods ======
    public static boolean  isValid (String pass) {

        if (pass.length() >= 8 && checkAscii(pass) && checkDigits(pass)) {
            return true;
        } else
            return false;



    }
public static boolean checkAscii (String pass) {

        for (int i = 0; i < pass.length(); i++) {
            int ascii = (int)pass.charAt(i);
            if (!(ascii >= 48 && ascii <= 57) && !(ascii >= 65 && ascii <= 90) && !(ascii >= 97 && ascii <= 122)) {
                return false;
            }
        }

        return true;

}

public static boolean checkDigits (String pass) {

int digits = 0;
    for (int i = 0; i < pass.length(); i++) {
        char ch = pass.charAt(i);

        if (Character.isDigit(ch)) {
            digits ++;
        }
    }

    if (digits >= 2 ) {
        return true;
    }
    return false;
}
}