package com.letscode.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner operationScan = new Scanner(System.in);

        System.out.print("Which operation would you like to do? \n" +
                "1 for addition \n" +
                "2 for subtraction \n" +
                "3 for multiplication \n" +
                "4 for division \n" +
                "Enter: ");
        int operator = operationScan.nextInt();

        System.out.print("Please enter the first operand number: ");
        float firstOperand = operationScan.nextFloat();

        System.out.print("Please enter the second operand number: ");
        float secondOperand = operationScan.nextFloat();

        float result = 0;

        switch (operator) {
            case 1:
                result = firstOperand + secondOperand;
                System.out.printf("%.2f + %.2f = %.2f", firstOperand, secondOperand, result);
                break;
            case 2:
                result = firstOperand - secondOperand;
                System.out.printf("%.2f - %.2f = %.2f", firstOperand, secondOperand, result);
                break;
            case 3:
                result = firstOperand * secondOperand;
                System.out.printf("%.2f x %.2f = %.2f", firstOperand, secondOperand, result);
                break;
            case 4:
                result = firstOperand / secondOperand;
                System.out.printf("%.2f ÷ %.2f = %.2f", firstOperand, secondOperand, result);
                break;
            default:
                System.out.print("Invalid operator.");
        }
    }
}
