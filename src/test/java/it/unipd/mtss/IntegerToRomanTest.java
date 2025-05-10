/// /////////////////////////////////////////////////////////////////
// Giuseppe De Fina 2113187
// Matteo Mantoan 2101085
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

    @ParameterizedTest
    @CsvSource({"0", "-10", "1001", "1010"})
    void testConvertInvalidArguments(int invalidArgument) {
        assertThrows(IllegalArgumentException.class,
                () -> IntegerToRoman.convert(invalidArgument));
    }

    static Stream<Arguments> testConvertOneToThreeData() {
        return Stream.of(Arguments.of("I", 1), Arguments.of("II", 2),
                Arguments.of("III", 3));
    }

    @ParameterizedTest
    @MethodSource("testConvertOneToThreeData")
    void testConvertOneToThree(String expected, int argument) {
        final String actual = IntegerToRoman.convert(argument);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> testConvertFourToSixData() {
        return Stream.of(Arguments.of("IV", 4), Arguments.of("V", 5),
                Arguments.of("VI", 6));
    }

    @ParameterizedTest
    @MethodSource("testConvertFourToSixData")
    void testConvertFourToSix(String expected, int argument) {
        final String actual = IntegerToRoman.convert(argument);

        assertEquals(expected, actual);
    }

}
