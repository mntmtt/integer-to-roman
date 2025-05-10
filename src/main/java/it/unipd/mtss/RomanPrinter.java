////////////////////////////////////////////////////////////////////
// Giuseppe De Fina 2113187
// Matteo Mantoan 2101085
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {

    final static int HEIGHT = 7;

    final static String space = " ";

    private static HashMap<Character, String> charToAsciiArt;
    static {
        charToAsciiArt = new HashMap<>();
        charToAsciiArt.put('I',
                "ooooo \n`888' \n 888  \n 888  \n 888  \n 888  \no888o ");
        charToAsciiArt.put('V',
                "oooooo     oooo \n `888.     .8'  "
                        + "\n  `888.   .8'   \n   `888. .8'    "
                        + "\n    `888.8'     \n     `888'"
                        + "      \n      `8'       ");
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String result = "";
        for (int i = 0; i < HEIGHT; i++) {
            for (char c : romanNumber.toCharArray()) {
                result += charToAsciiArt.get(c).split("\n")[i];
            }
            if (i != (HEIGHT - 1)) {
                result += "\n";
            }
        }
        return result;
    }
}
