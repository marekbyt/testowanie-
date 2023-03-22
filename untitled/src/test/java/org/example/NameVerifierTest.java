package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameVerifierTest {

    @Test
    void shouldValidateName() {
        // given
        String name = "Bartosz";
        NameVerifier nameVerifier = new NameVerifier();
        boolean expectedNameValid = true;
        // when
        boolean actualNameValid = nameVerifier.isNameValid(name);

        // then
        assertEquals(expectedNameValid, actualNameValid);
    }

    @Test
    void shouldNotValidateWhenAllLettersAreLowerCase() {
        // given
        String name = "bartosz";
        NameVerifier nameVerifier = new NameVerifier();

        boolean expectedNameValid = false;
        // when
        boolean actualNameValid = nameVerifier.isNameValid(name);

        // then
        assertEquals(expectedNameValid, actualNameValid);
    }

    @Test
    void shouldNotValidateWhenAllLettersAreUpperCase() {
        // given
        String name = "BARTOSZ";

        NameVerifier nameVerifier = new NameVerifier();

        boolean expectedNameValid = false;
        // when
        boolean actualNameValid = nameVerifier.isNameValid(name);

        // then
        assertEquals(expectedNameValid, actualNameValid);
    }

    @Test
    void shouldNotValidateEmptyName() {
        // given
        String name = "";
        NameVerifier nameVerifier = new NameVerifier();

        boolean expectedNameValid = false;
        // when
        boolean actualNameValid = nameVerifier.isNameValid(name);

        // then
        assertEquals(expectedNameValid, actualNameValid);
    }

    @Test
    void shouldNotValidateNull() {
        // given
        String name = null;
        NameVerifier nameVerifier = new NameVerifier();

        boolean expectedNameValid = false;
        // when
        boolean actualNameValid = nameVerifier.isNameValid(name);

        // then
        assertEquals(expectedNameValid, actualNameValid);
    }

}