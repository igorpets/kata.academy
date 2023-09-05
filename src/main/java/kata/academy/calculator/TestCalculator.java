package kata.academy.calculator;

/**
 * Тестирование калькулятора.
 * */

class TestCalculator {
    private static int test_index = 100;
    private static String code_name;
    private static int error_count;

    // Тестирование
    public static void main(String[] args) throws LogicException {
        // Calculator.get_type
        code_name = "NumberTypes.get_type()";
        test(NumberTypes.get_type("123450") != NumberTypes.ARABIC, "ожидался NumberTypes.ARABIC");
        test(NumberTypes.get_type("891") != NumberTypes.ARABIC, "ожидался NumberTypes.ARABIC");
        test(NumberTypes.get_type("02") != NumberTypes.ARABIC, "ожидался NumberTypes.ARABIC");
        test(NumberTypes.get_type("123IV") != NumberTypes.EMPTY, "ожидался NumberTypes.EMPTY");
        test(NumberTypes.get_type("X7") != NumberTypes.EMPTY, "ожидался NumberTypes.EMPTY");
        test(NumberTypes.get_type("IV") != NumberTypes.ROMAN, "ожидался NumberTypes.ROMAN");
        test(NumberTypes.get_type("IIX") != NumberTypes.ROMAN, "ожидался NumberTypes.ROMAN");
        test(NumberTypes.get_type("III") != NumberTypes.ROMAN, "ожидался NumberTypes.ROMAN");
        test(NumberTypes.get_type("MCDLXVI") != NumberTypes.ROMAN, "ожидался NumberTypes.ROMAN");

        // RomanNumeral
        test_index = 200;
        code_name = "RomanNumeral.romanToArabic()";
        test(RomanNumeral.romanToArabic("VIII") != 8, "ожидался 8");
        test(RomanNumeral.romanToArabic("CLI") != 151, "ожидался 151");
        test(RomanNumeral.romanToArabic("MMXVIII") != 2018, "ожидался 2018");
        test2(RomanNumeral.arabicToRoman(7), "VII");
        test2(RomanNumeral.arabicToRoman(151), "CLI");
        test2(RomanNumeral.arabicToRoman(3027), "MMMXXVII");

        // Main
        test_index = 300;
        code_name = "Main.calc()";
        test2(Main.calc("1 + 2"), "3");
        test2(Main.calc("10 + 9"), "19");
        test2(Main.calc("5 / 3"), "1");
        test2(Main.calc("10 / 3"), "3");
        test2(Main.calc("10 * 10"), "100");
        test2(Main.calc("8 - 5"), "3");
        test2(Main.calc("I + II"), "III");
        test2(Main.calc("IX - II"), "VII");
        test2(Main.calc("IX * X"), "XC");
        test2(Main.calc("X * X"), "C");
        test2(Main.calc("X / X"), "I");
        test2(Main.calc("X / III"), "III");
        test2(Main.calc("IX / V"), "I");
        test2(Main.calc("X / II"), "V");
        test2(Main.calc("X / II"), "V");

        // Исключения в Main
        check_exception("");
        check_exception(" - ");
        check_exception("XII - ");
        check_exception("XII - IV");
        check_exception("5 + 121");
        check_exception("8 + VI");
        check_exception("II + 0");
        check_exception("8 % VI");

        // Финальная проверка результатов теста
        if (error_count > 0)
            System.out.println("Обнаружено " + error_count + " ошибок!");
        else
            System.out.println("Тест завершен успешно!");
    }

    private static void test(boolean condition, String error) {
        test_index++;
        if (condition) {
            error_count++;
            System.out.println("Ошибка " + code_name + " N" + test_index + " " + error);
        }
    }

    private static void test2(String result, String etalon) {
        test_index++;
        if (!(result.equals(etalon))) {
            error_count++;
            System.out.println(
                    "Ошибка " + code_name + " N" + test_index + " получили " + result + " ожидали " + etalon);
        }
    }

    private static void check_exception(String input) {
        try {
            test_index++;
            Main.calc(input);
            print_exception(input, "ожидался Exception");
        } catch (Exception e) {
        }
    }

    private static void print_exception(String input, String error) {
        error_count++;
        System.out.println("Ошибка " + code_name + " N" + test_index + " [" + input + "] " + error);
    }
}
