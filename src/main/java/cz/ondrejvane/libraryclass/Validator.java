package cz.ondrejvane.libraryclass;

import org.apache.commons.validator.routines.EmailValidator;

/**
 * Ukázková třída pro vzor Library class
 * Třída obsahuje metody pro základní validaci
 * @author ondrejvane
 */
public final class Validator {

    /**
     * Kontruktor musí být privátní, aby neblo možné vytvářet instance této třídy
     */
    private Validator() {}

    public static boolean isValidEmail(String email) {
        // get the EmailValidator instance
        EmailValidator validator = EmailValidator.getInstance();

        // check for valid email addresses using isValid method
        return validator.isValid(email);
    }

    public static boolean isPasswordValid(String password) {
        return password.length() > 8;
    }

}
