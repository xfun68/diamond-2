package com.tw.workshop.diamond;

public class LineGenerator {

    public String getLine(String diamondLetter, String lineLetter) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < (diamondLetter.charAt(0) - 'A') * 2 + 1; i++) {
            stringBuilder.append(" ");
        }
        int diff = diamondLetter.charAt(0) - lineLetter.charAt(0);
        stringBuilder.setCharAt(diff, lineLetter.charAt(0));
        stringBuilder.setCharAt((stringBuilder.length() - 1 - (diff)) , lineLetter.charAt(0));
        return stringBuilder.toString();
    }
}
