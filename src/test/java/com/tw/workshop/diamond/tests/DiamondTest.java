package com.tw.workshop.diamond.tests;

import com.tw.workshop.diamond.LineGenerator;
import com.tw.workshop.diamond.Printer;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DiamondTest {

    private final Printer printer = new Printer(new LineGenerator());

    @Test
    public void print_diamond_for_C() throws Exception {
        Assert.assertEquals(Arrays.asList(
                "  A  ",
                " B B ",
                "C   C",
                " B B ",
                "  A  "),
                printer.diamond("C"));
    }

}
