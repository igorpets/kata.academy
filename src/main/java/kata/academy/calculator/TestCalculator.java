package kata.academy.calculator;

import kata.academy.calculator.*;
public class TestCalculator {
    public static void main(String[] args) {
        // Тестирование Calculator.get_type
        if (Calculator.get_type("123450") != NumberTypes.ARABIC)
            System.out.println("Ошибка 01 Calculator.get_type ожидался NumberTypes.ARABIC");
        if (Calculator.get_type("881") != NumberTypes.ARABIC)
            System.out.println("Ошибка 01 Calculator.get_type ожидался NumberTypes.ARABIC");
        if (Calculator.get_type("02") != NumberTypes.ARABIC)
            System.out.println("Ошибка 01 Calculator.get_type ожидался NumberTypes.ARABIC");
        if (Calculator.get_type("123IV") != NumberTypes.EMPTY)
            System.out.println("Ошибка 02 Calculator.get_type ожидался NumberTypes.EMPTY");
        if (Calculator.get_type("IV") != NumberTypes.ROMAN)
            System.out.println("Ошибка 02 Calculator.get_type ожидался NumberTypes.ROMAN");
        if (Calculator.get_type("IIX") != NumberTypes.ROMAN)
            System.out.println("Ошибка 02 Calculator.get_type ожидался NumberTypes.ROMAN");
        if (Calculator.get_type("III") != NumberTypes.ROMAN)
            System.out.println("Ошибка 02 Calculator.get_type ожидался NumberTypes.ROMAN");
    }
}
