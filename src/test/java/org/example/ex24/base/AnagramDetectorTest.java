package org.example.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams_set1() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("difo", "fido");


        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams_set2() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("note", "tone");


        // then
        assertTrue(actual);
    }


    @Test
    void isAnagram_returns_false_for_nonanagrams_set1() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("difo", "god");

        // then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_set2() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("difo", "god");

        // then
        assertFalse(actual);
    }
}