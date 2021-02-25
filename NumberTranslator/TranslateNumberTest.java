package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranslateNumberTest  {

    @Test
    public void test_translate_to_string_number_1() {

        NumberTranslator nt = new NumberTranslator();

        String actual_result = nt.translateNumber(1);
        String expected_result = "One";

        assertEquals(expected_result, actual_result);
    }

    @Test
    public void test_translate_to_string_number_2() {

        NumberTranslator nt = new NumberTranslator();

        String actual_result = nt.translateNumber(2);
        String expected_result = "Two";

        assertEquals(expected_result, actual_result);
    }

    @Test
    public void test_translate_to_string_number_3() {

        NumberTranslator nt = new NumberTranslator();

        String actual_result = nt.translateNumber(3);
        String expected_result = "Three";

        assertEquals(expected_result, actual_result);
    }

    @Test
    public void test_translate_to_string_number_4() {

        NumberTranslator nt = new NumberTranslator();

        String actual_result = nt.translateNumber(4);
        String expected_result = "Four";

        assertEquals(expected_result, actual_result);
    }

    @Test
    public void test_translate_to_string_number_5() {

        NumberTranslator nt = new NumberTranslator();

        String actual_result = nt.translateNumber(5);
        String expected_result = "Five";

        assertEquals(expected_result, actual_result);
    }
}
