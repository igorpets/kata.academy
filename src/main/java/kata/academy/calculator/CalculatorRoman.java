package kata.academy.calculator;

class CalculatorRoman extends Calculator {
    CalculatorRoman(String num1, String num2, Operations operation) throws LogicException {
        super(num1, num2, operation);
        ntype = NumberTypes.ROMAN;
        operand1 = Integer.parseInt(num1);
        operand2 = Integer.parseInt(num2);
        checkOperands();
    }

    @Override
    public String getResult() {
        return "12";
    }
}
