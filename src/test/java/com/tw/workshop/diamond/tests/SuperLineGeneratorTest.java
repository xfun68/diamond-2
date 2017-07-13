package com.tw.workshop.diamond.tests;

import com.tw.workshop.diamond.SuperLineGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuperLineGeneratorTest {

    private final SuperLineGenerator superLineGenerator = new SuperLineGenerator();

    @Test
    public void test_generate_super_line() throws Exception {
        assertEquals(" B*B ", superLineGenerator.getLine("C", "B"));
    }
}
