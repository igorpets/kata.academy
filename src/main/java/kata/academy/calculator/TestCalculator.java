package kata.academy.calculator;

class TestCalculator {
    private static int test_index = 100;
    private static String code_name;

    public static void main(String[] args) throws LogicException {
        // Тестирование Calculator.get_type
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
        test_index += 100;
        code_name = "RomanNumeral.romanToArabic()";
        test(RomanNumeral.romanToArabic("MMXVIII") != 2018, "ожидался 2018");
        test(RomanNumeral.romanToArabic("VIII") != 8, "ожидался 8");
        test(RomanNumeral.romanToArabic("СLI") != 151, "ожидался 151");

        // Main
        code_name = "Main.calc()";
        test(!Main.calc("1 + 2").equals("3"), "ожидался '3'");
        test(!Main.calc("I + II").equals("III"), "ожидался 'III'");
    }

    private static void test(boolean condition, String error) {
        test_index++;
        if (condition)
            System.out.println("Ошибка "+code_name+" N" + test_index + " " + error);
    }
}
