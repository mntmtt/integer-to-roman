/// /////////////////////////////////////////////////////////////////
// Giuseppe De Fina 2113187
// Matteo Mantoan 2101085
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

    @ParameterizedTest
    @CsvSource({"0", "-10", "1001", "1010"})
    void testConvertInvalidArguments(int invalidArgument) {
        assertThrows(IllegalArgumentException.class,
                () -> IntegerToRoman.convert(invalidArgument));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/roman_numerals.csv", numLinesToSkip = 1)
    void testConvert(int argument, String expected) {
        final String actual = IntegerToRoman.convert(argument);

        assertEquals(expected, actual);
    }

}
