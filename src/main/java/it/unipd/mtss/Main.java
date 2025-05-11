////////////////////////////////////////////////////////////////////
// Giuseppe De Fina 2113187
// Matteo Mantoan 2101085
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Wrong number of arguments.");
            System.exit(1);
        }

        try {
            int number = Integer.parseInt(args[0]);
            String roman = RomanPrinter.print(number);
            System.out.println(roman);
        } catch (IllegalArgumentException e) {
            System.err.println(
                    "Error: input must be an integer between 1 and 1000.");
            System.exit(2);
        }
    }
}
