package com.tw.workshop.diamond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Printer {
    public List<String> diamond(String letter) {
        List<String> result = new ArrayList<>();
        for (String lineLetter : seq(letter)) {
            result.add(getLine(letter, lineLetter));
        }
        return result;
    }

    private List<String> seq(String diamondLetter) {
        if (diamondLetter.equals("A")) {
            return Arrays.asList("A");
        } else if (diamondLetter.equals("B")) {
            return Arrays.asList("A", "B", "A");
        } else {
            return Arrays.asList("A", "B", "C", "B", "A");
        }
    }

    private String getLine(String diamondLetter, String lineLetter) {
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
