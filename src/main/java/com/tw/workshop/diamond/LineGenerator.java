package com.tw.workshop.diamond;

public class LineGenerator {
    public LineGenerator() {
    }

    String getLine(String diamondLetter, String lineLetter) {
        if (diamondLetter.equals("A")) {
            return "A";
        } else if (diamondLetter.equals("B")) {
            if (lineLetter.equals("A")) {
                return " A ";
            } else {
                return "B B";
            }
        } else {
            if (lineLetter.equals("A")) {
                return "  A  ";
            } else if (lineLetter.equals("B")) {
                return " B B ";
            } else {
                return "C   C";
            }
        }
    }
}
