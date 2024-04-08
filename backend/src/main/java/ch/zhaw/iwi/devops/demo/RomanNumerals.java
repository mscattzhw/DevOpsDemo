package ch.zhaw.iwi.devops.demo;

public class RomanNumerals {
    public String convertToRoman(int number) {
        if (number == 4) {
            return "IV";
        }
        String result = "";
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }
    
}
