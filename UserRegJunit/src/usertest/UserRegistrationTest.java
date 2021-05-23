package usertest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {
    UserRegistration object = new UserRegistration();
    @Test
    public void checkFirstName(){
        Assertions.assertTrue(object.validateFirstName("[A-Z]{1}[a-z]{2,}","Ashok"));
    }
    @Test
    public void checkLastName(){
        Assertions.assertTrue(object.validateLastName("[A-Z]{1}[a-z]{2,}","Patel"));
    }
    @Test
    public void checkEmail(){
        Assertions.assertTrue(object.validateEmail("^[a-zA-Z0-9]+[\\.\\-\\+\\_]?[a-zA-Z0-9]*@[a-zA-Z]+[.]?[a-zA-Z]{2,4}[\\.]?([a-z]{2})?$","ashok.patel@gmail.com.in"));
    }
    @Test
    public void checkPhoneNumber(){
        Assertions.assertTrue(object.validatePhoneNumber("^[0-9]{2}[ ][0-9]{10}$","91 1234567809"));
    }
    @Test
    public void checkPassword(){
        Assertions.assertTrue(object.validatePassward("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}","Ashok123@"));
    }


}
