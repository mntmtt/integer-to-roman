/// /////////////////////////////////////////////////////////////////
// Giuseppe De Fina 2113187
// Matteo Mantoan 2101085
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RomanPrinterTest {

    final String space = " ";

    @ParameterizedTest
    @CsvFileSource(resources = "/roman_ascii_art.csv", numLinesToSkip = 1)
    void testPrint(int argument, String expected) {
        expected = expected.replace("\\n", "\n").strip();

        String actual = RomanPrinter.print(argument);
        actual = "\"" + actual + "\"";
        assertEquals(expected, actual);
    }
}
