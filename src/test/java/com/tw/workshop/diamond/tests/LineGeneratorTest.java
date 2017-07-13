package com.tw.workshop.diamond.tests;

import com.tw.workshop.diamond.LineGenerator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineGeneratorTest {

    private final LineGenerator lineGenerator = new LineGenerator();

    @Test
    public void generate_line_for_diamond_letter_A_and_line_letter_A() throws Exception {
        assertEquals("A", new LineGenerator().getLine("A", "A"));
    }

    @Test
    public void generate_line_for_diamond_letter_B_and_line_letter_A() throws Exception {
        assertEquals(" A ", new LineGenerator().getLine("B", "A"));
    }

    @Test
    public void generate_line_for_diamond_letter_C_and_line_letter_A() throws Exception {
        assertEquals("  A  ", new LineGenerator().getLine("C", "A"));
    }

    @Test
    public void generate_line_for_diamond_letter_D_and_line_letter_A() throws Exception {
        assertEquals("   A   ", lineGenerator.getLine("D", "A"));
    }

    @Test
    public void generate_line_for_diamond_letter_B_and_line_letter_B() throws Exception {
        assertEquals("B B", lineGenerator.getLine("B", "B"));
    }

    @Test
    public void generate_line_for_diamond_letter_C_and_line_letter_B() throws Exception {
        assertEquals(" B B ", lineGenerator.getLine("C", "B"));
    }

    @Test
    public void generate_line_for_diamond_letter_D_and_line_letter_B() throws Exception {
        assertEquals("  B B  ", lineGenerator.getLine("D", "B"));
    }

    @Test
    public void test_generate_super_line() throws Exception {
        LineGenerator lineGenerator = new LineGenerator('*');
        assertEquals(" B*B ", lineGenerator.getLine("C", "B"));
    }
}
