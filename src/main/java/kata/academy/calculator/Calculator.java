package kata.academy.calculator;

import java.util.List;

abstract class Calculator {
    protected NumberTypes ntype = NumberTypes.EMPTY;
    protected int operand1;
    protected int operand2;
    protected int result = 0;
    protected Operations operation = Operations.EMPTY;

    Calculator(String num1, String num2, Operations operation) {
        this.operation = operation;
    }

    // Выполняем операцию.
    public void go() {
        switch (operation) {
            case ADD -> result = operand1 + operand2;
            case SUB -> result = operand1 - operand2;
            case MUL -> result = operand1 * operand2;
            case DIV -> result = operand1 / operand2;
        }
    }

    protected void checkOperands() throws LogicException {
        if (operand1 < 1)
            throw new LogicException("Первое число меньше 1.");
        if (operand1 > 10)
            throw new LogicException("Первое число больше 10.");
        if (operand2 < 1)
            throw new LogicException("Второй операнд меньше 1.");
        if (operand2 > 10)
            throw new LogicException("Второй операнд больше 10.");
    }

    // Вывод результата на экран в заданном формате Калькулятора.
    abstract public String getResult() throws LogicException;

    // Определяет тип операции (+-*/).
    // Если ошибка, возвращает EMPTY.
    public static Operations get_operation(char operation) {
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
