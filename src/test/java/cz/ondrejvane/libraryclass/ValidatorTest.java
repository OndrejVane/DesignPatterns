package cz.ondrejvane.libraryclass;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidatorTest {

    @Test
    public void testEmailValidator() {
        // correct inputs
        assertTrue(Validator.isValidEmail("test@test.cz"));
        assertTrue(Validator.isValidEmail("TEST@TEST.eu"));
        assertTrue(Validator.isValidEmail("a@s.com"));

        // incorrect inputs
        assertFalse(Validator.isValidEmail("test@test."));
        assertFalse(Validator.isValidEmail("@test.cz"));
        assertFalse(Validator.isValidEmail("test@"));
        assertFalse(Validator.isValidEmail("test@.cz"));
        assertFalse(Validator.isValidEmail("test@test.e"));
        assertFalse(Validator.isValidEmail(""));
    }

    @Test
    public void isPasswordValid() {
        assertTrue(Validator.isPasswordValid("123456789"));
        assertFalse(Validator.isPasswordValid("12345678"));
        assertFalse(Validator.isPasswordValid(""));
    }
}
