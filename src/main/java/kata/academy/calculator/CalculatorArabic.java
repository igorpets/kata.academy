package kata.academy.calculator;

class CalculatorArabic extends Calculator {
    CalculatorArabic(String num1, String num2, Operations operation) throws LogicException{
        super(num1, num2, operation);
        ntype = NumberTypes.ARABIC;
        operand1 = Integer.parseInt(num1);
        operand2 = Integer.parseInt(num2);
        checkOperands();
    }

    @Override
    public String getResult() {
        return String.valueOf(result);
    }
}
