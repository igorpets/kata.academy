package kata.academy.calculator;

import kata.academy.calculator.*;

public class TestCalculator {
    public static void main(String[] args) throws LogicException{
        // Тестирование Calculator.get_type
        if (Calculator.get_type("123450") != NumberTypes.ARABIC)
            System.out.println("Ошибка 101 Calculator.get_type ожидался NumberTypes.ARABIC");
        if (Calculator.get_type("881") != NumberTypes.ARABIC)
            System.out.println("Ошибка 102 Calculator.get_type ожидался NumberTypes.ARABIC");
        if (Calculator.get_type("02") != NumberTypes.ARABIC)
            System.out.println("Ошибка 103 Calculator.get_type ожидался NumberTypes.ARABIC");
        if (Calculator.get_type("123IV") != NumberTypes.EMPTY)
            System.out.println("Ошибка 104 Calculator.get_type ожидался NumberTypes.EMPTY");
        if (Calculator.get_type("IV") != NumberTypes.ROMAN)
            System.out.println("Ошибка 105 Calculator.get_type ожидался NumberTypes.ROMAN");
        if (Calculator.get_type("IIX") != NumberTypes.ROMAN)
            System.out.println("Ошибка 106 Calculator.get_type ожидался NumberTypes.ROMAN");
        if (Calculator.get_type("III") != NumberTypes.ROMAN)
            System.out.println("Ошибка 107 Calculator.get_type ожидался NumberTypes.ROMAN");

        if (RomanNumeral.romanToArabic("MMXVIII") != 2018)
            System.out.println("Ошибка 201 RomanNumeral.romanToArabic ожидался 2018");
    }
}
