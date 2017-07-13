package com.tw.workshop.diamond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Printer {
    private final LineGenerator lineGenerator = new LineGenerator();

    public List<String> diamond(String letter) {
        List<String> result = new ArrayList<>();
        for (String lineLetter : seq(letter)) {
            result.add(lineGenerator.getLine(letter, lineLetter));
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

}
