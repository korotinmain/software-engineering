package com.korotin;

public class StringAssistant {
    public static String deleteWhitespaces(String inputText) {
        return inputText.replaceAll(LiteralConstants.WHITESPACE_PATTERN, "");
    }

    public static int getTotalOfNumbersFromString(String inputText) {
        char[] chars = inputText.toCharArray();
        int total = 0;
        for (char character : chars) {
            if (Character.isDigit(character)) {
                total += Character.getNumericValue(character);
            }
        }
        return total;
    }
}
