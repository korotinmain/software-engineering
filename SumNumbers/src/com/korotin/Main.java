package com.korotin;

public class Main implements LiteralConstants {
    public static void main(String[] args) {
        System.out.println(AUTHOR_NAME);
        TotalNumbers totalNumbers = new TotalNumbers(INIT_INPUT_TEXT);
        totalNumbers.closeScanner();
    }
}
