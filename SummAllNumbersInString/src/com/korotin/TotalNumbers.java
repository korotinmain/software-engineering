package com.korotin;

import java.util.Scanner;

public class TotalNumbers {
    private String initText;
    private String inputTextFromUser;

    Scanner scanner = new Scanner(System.in);

    public TotalNumbers(String inputText) {
        this.initText = inputText;
        System.out.print(LiteralConstants.Strings.INPUT_TEXT);
        this.inputTextFromUser = scanner.nextLine();
        getTotal();
    }

    private void getTotal() {
        System.out.println(LiteralConstants.Strings.SUM_FROM_INIT + this.getNumbersFromText(this.initText));
        System.out.println(LiteralConstants.Strings.SUM_FROM_INPUT + this.getNumbersFromText(this.inputTextFromUser));
    }

    private int getNumbersFromText(String inputText) {
        System.out.print(inputText + " - ");
        String textWithoutWhitespaces = StringAssistant.deleteWhitespaces(inputText);
        int total = StringAssistant.getTotalOfNumbersFromString(textWithoutWhitespaces);
        return total;
    }
}