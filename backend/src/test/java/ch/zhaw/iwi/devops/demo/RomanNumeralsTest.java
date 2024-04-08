package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void convertToRoman_1_ReturnsI() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(1);
        assertEquals("I", result);
    }

    @Test
    public void convertToRoman_2_ReturnsII() {
        RomanNumerals converter = new RomanNumerals();
        String result = converter.convertToRoman(2);
        assertEquals("II", result);
    }
}