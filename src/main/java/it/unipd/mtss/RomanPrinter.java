////////////////////////////////////////////////////////////////////
// Giuseppe De Fina 2113187
// Matteo Mantoan 2101085
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {

    final static String space = " ";

    private static HashMap<String, String> charToAsciiArt;
    static {
        charToAsciiArt = new HashMap<>();
        charToAsciiArt.put("I", """
                ooooo
                 888
                 888
                 888
                 888
                 888
                o888o
                """);
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        return switch (romanNumber) {
            case "I" -> charToAsciiArt.get("I");
            case "II" ->
                charToAsciiArt.get("I") + space + charToAsciiArt.get("I");
            case "III" -> charToAsciiArt.get("I") + space
                    + charToAsciiArt.get("I") + space + charToAsciiArt.get("I");
            default -> "";
        };
    }
}
