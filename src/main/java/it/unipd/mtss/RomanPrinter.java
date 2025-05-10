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
        charToAsciiArt.put('X',
                "ooooooo  ooooo \n `8888    d8'  \n   Y888..8P"
                        + "    \n    `8888'     \n   .8PY888.    \n  d8'"
                        + "  `888b   \no888o  o88888o ");
        charToAsciiArt.put('L',
                "ooooo        \n`888'        \n 888         \n 888"
                        + "         \n 888         \n 888"
                        + "       o \no888ooooood8 ");
        charToAsciiArt.put('C',
                "  .oooooo.   \n d8P'  `Y8b  "
                        + "\n888          \n888          \n888          "
                        + "\n`88b    ooo  \n `Y8bood8P'  ");
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < HEIGHT; i++) {
            for (char c : romanNumber.toCharArray()) {
                resultBuilder.append(charToAsciiArt.get(c).split("\n")[i]);
            }
            if (i != (HEIGHT - 1)) {
                resultBuilder.append("\n");
            }
        }
        return resultBuilder.toString();
    }
}
