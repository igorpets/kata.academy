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

    /*
     * Преобразование ROMAN в ARABIC
     * LET numeral be the input String representing an Roman Numeral
     * LET symbol be initialy set to RomanNumeral.values()[0]
     * WHILE numeral.length > 0:
     *      IF numeral starts with symbol's name:
     *          add symbol's value to the result
     *          remove the symbol's name from the numeral's beginning
     *      ELSE:
     *          set symbol to the next symbol
     **/
    public static int romanToArabic(String input) throws LogicException {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new LogicException("Введен пустой операнд.");
        }

        return result;
    }
}