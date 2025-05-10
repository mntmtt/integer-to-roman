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
        if (number <= 0 || number > 20) {
            throw new IllegalArgumentException("number should be > 0 and <= 6");
        }

        int[] values = {10, 9, 5, 4, 1};
        String[] symbols = {"X", "IX", "V", "IV", "I"};

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
