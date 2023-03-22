package org.example.calculations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    void testSameAssertion() {
        String name = "Bartosz";
        String anotherName = new String("Bartosz");
        Assertions.assertEquals(name, anotherName);
        Assertions.assertSame(name, anotherName);
    }
}
