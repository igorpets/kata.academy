package kata.academy.calculator;

/*
 * Создай консольное приложение "Калькулятор".
 * Приложение должно читать из консоли введенные пользователем строки, числа,
 * арифметические операции проводимые между ними и выводить в консоль результат их выполнения.
 * Реализуй класс Main с методом public static String calc(String input).
 * Метод должен принимать строку с арифметическим выражением между двумя числами и возвращать строку
 * с результатом их выполнения.
 * Ты можешь добавлять свои импорты, классы и методы.
 * Добавленные классы не должны иметь модификаторы доступа (public или другие).
 *
 * Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами:
 *   a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотри пример)! Решения, в которых каждое число и
 *   арифмитеческая операция передаются с новой строки считаются неверными.
 * Калькулятор умеет работать как с арабскими (1,2,3,4,5...), так и с римскими (I,II,III,IV,V...) числами.
 * Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.
 * На выходе числа не ограничиваются по величине и могут быть любыми.
 * Калькулятор умеет работать только с целыми числами.
 * Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки
 *   вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
 * При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно,
 *   при вводе арабских - ответ ожидается арабскими.
 * При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
 * При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций,
 *   приложение выбрасывает исключение и завершает свою работу.
 * Результатом операции деления является целое число, остаток отбрасывается.
 * Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.
 * Результатом работы калькулятора с римскими числами могут быть только положительные числа,
 *   если результат работы меньше единицы, выбрасывается исключение
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LogicException {
        for (; ; ) {
            System.out.println("Input:");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            System.out.println();
            System.out.println("Output:");
            System.out.println(calc(input));
            System.out.println();
        }
    }

    public static String calc(String input) throws LogicException {
        // Сразу приводим к большим буквам.
        String[] elements = input.toUpperCase().split(" ");
        if (elements.length != 3)
            throw new LogicException("Ошибка, введите 3 параметра.");
        Operations operator = Calculator.get_operation(elements[1].charAt(0));
        if (operator == Operations.EMPTY) {
            throw new LogicException("Введите оператор из списка [+-*/].");
        }
        NumberTypes t1 = NumberTypes.get_type(elements[0]);
        NumberTypes t2 = NumberTypes.get_type(elements[2]);
        if (t1 == NumberTypes.EMPTY)
            throw new LogicException("Операнд 1 в неверном формате.");
        if (t2 == NumberTypes.EMPTY)
            throw new LogicException("Операнд 2 в неверном формате.");
        if (t1 != t2)
            throw new LogicException("Операнды в разных системах счисления.");
        String result = "throws Exception";
        Calculator calculator = null;
        switch (t1) {
            case ARABIC -> calculator = new CalculatorArabic(elements[0], elements[2], operator);
            case ROMAN -> calculator = new CalculatorRoman(elements[0], elements[2], operator);
        }
        if (calculator != null) {
            calculator.go();
            result = calculator.getResult();
        }
        return result;
    }
}
