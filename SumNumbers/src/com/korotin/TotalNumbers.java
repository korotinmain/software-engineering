package com.korotin;

import java.util.Scanner;

public class TotalNumbers implements LiteralConstants {
    private String initText;
    private String inputTextFromUser;

    Scanner scanner = new Scanner(System.in);

    public TotalNumbers(String inputText) {
        this.initText = inputText;
        System.out.print(INPUT_TEXT);
        this.inputTextFromUser = scanner.nextLine();
        getTotal();
    }

    private void getTotal() {
        System.out.println(SUM_FROM_INIT + this.getNumbersFromText(this.initText));
        System.out.println(SUM_FROM_INPUT + this.getNumbersFromText(this.inputTextFromUser));
    }

    private int getNumbersFromText(String inputText) {
        System.out.print(inputText + " - ");
        int total = StringAssistant.getTotalOfNumbersFromString(inputText);
        return total;
    }

    public void closeScanner() {
        scanner.close();
    }
}