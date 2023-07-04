import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class RegisterTest {

         @Test
    public void testRegister(){
            String urlRegistr= "https://demowebshop.tricentis.com/register";
            Register register = open(urlRegistr, Register.class);
            register.registertestFemale();
        }

        @Test
    public void testRegister1(){
        String urlRegistr= "https://demowebshop.tricentis.com/register";
        Register register = open(urlRegistr, Register.class);
        register.registertestMale();
    }

}
