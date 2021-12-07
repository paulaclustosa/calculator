package com.letscode.calculator;

import com.letscode.calculator.service.Operations;
import com.letscode.calculator.utils.Printer;
import com.letscode.calculator.utils.Reader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Operations.calculateOperation(Reader.getOperator(), Reader.getFirstOperand(), Reader.getSecondOperand());

    }
}
