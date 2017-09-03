/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author yemin
 */
public class PasswordDAO {

    public static String checkPasswordStrength(String password) {
        boolean hasLetter = false;
        boolean hasDigit = false;
        
        String message = "";
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLetter(x)) {

                    hasLetter = true;
                } else if (Character.isDigit(x)) {

                    hasDigit = true;
                }

                // no need to check further, break the loop
                if (hasLetter && hasDigit) {

                    break;
                }

            }
            if (hasLetter && hasDigit) {
                message = "Your password strength is strong.";
                return message;
            } else {
                message = "Your password strength is not strong.";
                return message;
            }
        } else {
            message = "Your password should have at least 8 characters.";
            return message;
        }
    }
}
