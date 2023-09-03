package kata.academy.calculator;

abstract class Calculator {
    protected NumberTypes ntype = NumberTypes.EMPTY;
    protected int operand1;
    protected int operand2;
    protected int result;
    protected Operations operation = Operations.EMPTY;

    Calculator(String num1, String num2, Operations operation) {
        this.operation = operation;
    }

    // Выполняем операцию.
    public void go() {

    }

    protected void checkOperands() throws LogicException{
        if (operand1 < 0)
            throw new LogicException("Первое число меньше 0.");
        if (operand1 > 10)
            throw new LogicException("Первое число больше 10.");
        if (operand2 < 0)
            throw new LogicException("Второй операнд меньше 0.");
        if (operand2 > 10)
            throw new LogicException("Второй операнд больше 10.");
    }

    // Вывод результата на экран в заданном формате Калькулятора.
    abstract public String getResult();

    // Определяет тип операнда.
    public static NumberTypes get_type(String operand) {
        NumberTypes result = NumberTypes.EMPTY;
        if (operand.length() > 0) {
            if (operand.equals(operand.replaceAll("\\D", ""))) {
                result = NumberTypes.ARABIC;
            } else if (operand.replaceAll("[IVX]", "").length()==0) {
                result = NumberTypes.ROMAN;
            }
        }
        return result;
    }

    // Определяет тип операции (+-*/).
    // Если ошибка, возвращает EMPTY.
    public static Operations get_operation(char operation){
        Operations result = Operations.EMPTY;
        switch (operation) {
            case '+' -> result = Operations.ADD;
            case '-' -> result = Operations.SUB;
            case '*' -> result = Operations.MUL;
            case '/' -> result = Operations.DIV;
        }
        return result;
    }
}
