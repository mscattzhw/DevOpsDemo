package ch.zhaw.iwi.devops.demo;

public class RomanNumerals {
    public String convertToRoman(int number) {
        if (number == 1) {
            return "I";
        } else if (number == 2) {
            return "II";
        }
        return null; 
    }
}
