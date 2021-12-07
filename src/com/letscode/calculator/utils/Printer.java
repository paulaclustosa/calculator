package com.letscode.calculator.utils;

public class Printer {

    private static String CHOOSE_OPERATION_MESSAGE = "Hi! Welcome to the calculator program. \n" +
            "Which operation would you like to do? \n" +
            "1 for addition \n" +
            "2 for subtraction \n" +
            "3 for multiplication \n" +
            "4 for division \n" +
            "Enter: ";

    private static String FIRST_OPERAND_MESSAGE = "Please enter the first operand number: ";

    private static String SECOND_OPERAND_MESSAGE = "Please enter the second operand number: ";

    public static void printChooseOperationMessage() {
        System.out.print(CHOOSE_OPERATION_MESSAGE);
    }

    public static void printFirstOperandMessage() {
        System.out.print(FIRST_OPERAND_MESSAGE);
    }

    public static void printSecondOperandMessage() {
        System.out.print(SECOND_OPERAND_MESSAGE);
    }
}
