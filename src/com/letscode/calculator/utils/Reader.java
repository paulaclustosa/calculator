package com.letscode.calculator.utils;

import java.util.Scanner;

public class Reader {

    private static Scanner operationScan = new Scanner(System.in);

    public static int getOperator() {
        Printer.printChooseOperationMessage();
        return operationScan.nextInt();
    }

    public static float getFirstOperand() {
        Printer.printFirstOperandMessage();
        return operationScan.nextFloat();
    }

    public static float getSecondOperand() {
        Printer.printSecondOperandMessage();
        return operationScan.nextFloat();
    }

}
