package com.tw.workshop.diamond;

public class SuperLineGenerator extends LineGenerator {

    public String getLine(String diamondLetter, String lineLetter) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < (diamondLetter.charAt(0) - 'A') * 2 + 1; i++) {
            stringBuilder.append(" ");
        }

        int firstPos = diamondLetter.charAt(0) - lineLetter.charAt(0);
        int secondPos = stringBuilder.length() - 1 - (diamondLetter.charAt(0) - lineLetter.charAt(0));

        stringBuilder.setCharAt(firstPos, lineLetter.charAt(0));
        for (int i = firstPos + 1; i < secondPos; i++) {
            stringBuilder.setCharAt(i, '*');
        }
        stringBuilder.setCharAt(secondPos, lineLetter.charAt(0));

        return stringBuilder.toString();
    }
}
