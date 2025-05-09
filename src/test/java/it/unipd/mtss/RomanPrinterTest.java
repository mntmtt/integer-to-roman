/// /////////////////////////////////////////////////////////////////
// Giuseppe De Fina 2113187
// Matteo Mantoan 2101085
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    final String space = " ";

    String expectedI = """
            ooooo
             888
             888
             888
             888
             888
            o888o
            """;

    @Test
    void testPrintOneToThree() {
        String result1 = RomanPrinter.print(1);
        String result2 = RomanPrinter.print(2);
        String result3 = RomanPrinter.print(3);

        assertEquals(expectedI, result1);
        assertEquals(expectedI + space + expectedI, result2);
        assertEquals(expectedI + space + expectedI + space + expectedI,
                result3);
    }
}
