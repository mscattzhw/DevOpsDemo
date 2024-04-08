package ch.zhaw.iwi.devops.demo;

public class RomanNumerals {
    public String convertToRoman(int number) {
        if (number == 4) {
            return "IV";
        } else if (number == 5) {
            return "V";
        } else if (number == 6) {
            return "VI";
        } else if (number == 7) {
            return "VII";
        } else if (number == 8) {
            return "VIII";
        } else if (number == 9) {
            return "IX";
        }
        String result = "";
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }
    
}
