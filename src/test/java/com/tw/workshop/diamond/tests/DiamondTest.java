package com.tw.workshop.diamond.tests;

import com.tw.workshop.diamond.LineGenerator;
import com.tw.workshop.diamond.Printer;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DiamondTest {

    @Test
    public void print_diamond_for_C() throws Exception {
        Printer printer = new Printer(new LineGenerator());
        Assert.assertEquals(Arrays.asList(
                "  A  ",
                " B B ",
                "C   C",
                " B B ",
                "  A  "),
                printer.diamond("C"));
    }

    @Test
    public void print_super_diamond_for_C() throws Exception {
        Printer printer = new Printer(new LineGenerator('*'));
        Assert.assertEquals(Arrays.asList(
                "  A  ",
                " B*B ",
                "C***C",
                " B*B ",
                "  A  "),
                printer.diamond("C"));
    }

}
