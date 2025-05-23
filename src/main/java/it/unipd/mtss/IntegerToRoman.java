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
        if (number <= 0 || number > 1000) {
            throw new IllegalArgumentException(
                    "number should be > 0 and <= 1000");
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
                "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(symbols[i]);
                number -= values[i];
            }
        }

        return result.toString();
    }
}
