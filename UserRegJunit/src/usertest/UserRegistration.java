package usertest;

import java.util.regex.*;
public class UserRegistration {


    public boolean validateFirstName(String firstNamePattern, String firstName) {
        return Pattern.matches(firstNamePattern,firstName);
    }

    public boolean validateLastName(String lastNamePattern, String lastName) {
        return Pattern.matches(lastNamePattern,lastName);
    }

    public boolean validateEmail(String emailPattern, String email) {
        return Pattern.matches(emailPattern,email);
    }

    public boolean validatePhoneNumber(String phoneNumberPattern, String phoneNumber) {
        return Pattern.matches(phoneNumberPattern,phoneNumber);
    }

    public boolean validatePassward(String passwardPattern, String passward) {
        return Pattern.matches(passwardPattern,passward);
    }

    public static void main(String[] args){
        
    }
}