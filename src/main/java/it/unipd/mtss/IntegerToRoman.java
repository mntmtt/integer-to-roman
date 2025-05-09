////////////////////////////////////////////////////////////////////
// Giuseppe De Fina 2113187
// Matteo Mantoan 2101085
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    /**
     * Converts an integer number to roman
     *
     * @param number
     *            the integer number to be converted
     * @return the string representation of the roman number
     */
    public static String convert(int number) {
        if (number < 0 || number > 1000) {
            throw new IllegalArgumentException(
                    "number should be > 0 and <= 1000");
        }

        return switch (number) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            default -> throw new IllegalArgumentException(
                    "only 1 ... 3 numbers are supported");
        };
    }
}
