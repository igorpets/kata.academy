package kata.academy.calculator;

class CalculatorRoman extends Calculator {
    CalculatorRoman(String num1, String num2, Operations operation) throws LogicException {
        super(num1, num2, operation);
        ntype = NumberTypes.ROMAN;
        operand1 = RomanNumeral.romanToArabic(num1);
        operand2 = RomanNumeral.romanToArabic(num2);
        checkOperands();
    }

    @Override
    public String getResult() {
        return RomanNumeral.arabicToRoman(result);
    }
}
