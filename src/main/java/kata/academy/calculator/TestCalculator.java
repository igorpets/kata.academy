package kata.academy.calculator;

import kata.academy.calculator.*;

public class TestCalculator {
    public static void main(String[] args) {
        // Тестирование Calculator.get_type
        if (NumberTypes.get_type("123450") != NumberTypes.ARABIC)
            System.out.println("Ошибка 101 NumberTypes.get_type ожидался NumberTypes.ARABIC");
        if (NumberTypes.get_type("881") != NumberTypes.ARABIC)
            System.out.println("Ошибка 102 NumberTypes.get_type ожидался NumberTypes.ARABIC");
        if (NumberTypes.get_type("02") != NumberTypes.ARABIC)
            System.out.println("Ошибка 103 NumberTypes.get_type ожидался NumberTypes.ARABIC");
        if (NumberTypes.get_type("123IV") != NumberTypes.EMPTY)
            System.out.println("Ошибка 104 NumberTypes.get_type ожидался NumberTypes.EMPTY");
        if (NumberTypes.get_type("IV") != NumberTypes.ROMAN)
            System.out.println("Ошибка 105 NumberTypes.get_type ожидался NumberTypes.ROMAN");
        if (NumberTypes.get_type("IIX") != NumberTypes.ROMAN)
            System.out.println("Ошибка 106 NumberTypes.get_type ожидался NumberTypes.ROMAN");
        if (NumberTypes.get_type("III") != NumberTypes.ROMAN)
            System.out.println("Ошибка 107 NumberTypes.get_type ожидался NumberTypes.ROMAN");

        if (RomanNumeral.romanToArabic("MMXVIII") != 2018)
            System.out.println("Ошибка 201 RomanNumeral.romanToArabic ожидался 2018");
        if (RomanNumeral.romanToArabic("VIII") != 8)
            System.out.println("Ошибка 202 RomanNumeral.romanToArabic ожидался 8");
        if (RomanNumeral.romanToArabic("СLI") != 151)
            System.out.println("Ошибка 203 RomanNumeral.romanToArabic ожидался 151");
    }
}
