package kata.academy.calculator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum RomanNumeral {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100),
    CD(400), D(500), CM(900), M(1000);

    private int value;

    RomanNumeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<RomanNumeral> getReverseSortedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
                .collect(Collectors.toList());
    }

    /**
     * Преобразование ROMAN в ARABIC
     * <p>
     * LET numeral be the input String representing an Roman Numeral
     * LET symbol be initialy set to RomanNumeral.values()[0]
     * WHILE numeral.length > 0:
     * ___IF numeral starts with symbol's name:
     * ______add symbol's value to the result
     * ______remove the symbol's name from the numeral's beginning
     * ___ELSE:
     * ______set symbol to the next symbol
     **/
    public static int romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            //System.out.println(romanNumeral + " " + symbol.name());
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " не может быть преобразован в Римское число.");
        }

        return result;
    }

    /**
     * Преобразование ARABIC в ROMAN.
     * <p>
     * LET number be an integer between 1 and 4000
     * LET symbol be RomanNumeral.values()[0]
     * LET result be an empty String
     * WHILE number > 0:
     * IF symbol's value <= number:
     * append the result with the symbol's name
     * subtract symbol's value from number
     * ELSE:
     * pick the next symbol
     **/
    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else
                i++;
        }

        return sb.toString();
    }
}