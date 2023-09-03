package kata.academy.calculator;

enum NumberTypes {
    ARABIC, ROMAN, EMPTY;

    // Определяет тип операнда.
    public static NumberTypes get_type(String operand) {
        NumberTypes result = NumberTypes.EMPTY;
        if (operand.length() > 0) {
            if (operand.equals(operand.replaceAll("\\D", ""))) {
                result = NumberTypes.ARABIC;
            } else if (operand.replaceAll("[IVXLCDM]", "").length() == 0) {
                result = NumberTypes.ROMAN;
            }
        }
        return result;
    }
}
