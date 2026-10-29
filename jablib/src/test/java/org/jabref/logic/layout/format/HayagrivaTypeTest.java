package org.jabref.logic.layout.format;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HayagrivaTypeTest {

    private final HayagrivaType formatter = new HayagrivaType();

    @ParameterizedTest
    @MethodSource
    void format(String expected, String entryTypeDisplayName) {
        assertEquals(expected, formatter.format(entryTypeDisplayName));
    }

    private static Stream<Arguments> format() {
        return Stream.of(
                Arguments.of("article", "Article"),
                Arguments.of("chapter", "InBook"),
                Arguments.of("web", "Online"),
                Arguments.of("Misc", "Misc"),
                Arguments.of("Misc", "InCollection"),
                Arguments.of("performance", "Performance"),
                Arguments.of("artwork", "Artwork"),
                Arguments.of("audio", "Music"),
                Arguments.of("video", "Movie"),
                Arguments.of("letter", "Letter"),
                Arguments.of("patent", "Patent"),
                Arguments.of("periodical", "Periodical"),
                Arguments.of("legislation", "Legislation"),
                Arguments.of("Misc", "SoftwareVersion"),
                Arguments.of("Misc", "Mycustomtype")
        );
    }
}
