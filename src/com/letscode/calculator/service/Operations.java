package com.letscode.calculator.service;

public class Operations {

    private static int END_STATUS = 0;

    public static void verifyOperator(int operator) {
        if (!(operator == 1 || operator == 2 || operator == 3 || operator == 4)) {
            System.out.println("Unfortunately you chose an invalid operator! Please try again.");
            System.exit(END_STATUS);
        }
    }

    public static void calculateOperation(int operator, float firstOperand, float secondOperand) {
        verifyOperator(operator);

        float result;

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
                System.out.println("Sorry! Something went wrong... operation failed!");
                break;
        }
    }
}
