package pl.klimas7.interview;

public interface PasswordValidator {
    /**
     * Should return true when:
     * - password have length more then 8 signs
     * - has one digits
     * - has one capital letter
     * - has one lower case letter
     * - has one special character !@#$%&*
     * @param password to validate
     * @return result
     */
    boolean validate(String password);
}
