import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Register {
    @FindBy(how = How.XPATH, using = "(//input[@name='Gender'])[1]")
    private SelenideElement buttonGenderMale;

    @FindBy(how = How.XPATH, using = "(//input[@name='Gender'])[2]")
    private SelenideElement buttonGenderFemale;

    @FindBy(how = How.ID, using = "FirstName")
    private SelenideElement findFirstName;

    @FindBy(how = How.ID, using = "LastName")
    private SelenideElement findLastName;

    @FindBy(how = How.ID, using = "Email")
    private SelenideElement findEmail;

    @FindBy(how = How.ID, using = "Password")
    private SelenideElement findPassword;

    @FindBy(how = How.ID, using = "ConfirmPassword")  //register-button
    private SelenideElement findConfirmPassword;

    @FindBy(how = How.ID, using = "register-button")  //register-button
    private SelenideElement registerButton;

    public void findFill(SelenideElement element, String fillObj) {
        element.sendKeys(fillObj);
    }

    public void registertestFemale() {
        buttonGenderFemale.click();
        findFill(findFirstName, "Zina");
        findFill(findLastName, "Ivanova");
        findFill(findEmail, "sss@sss.ru");
        findFill(findPassword, "11111111");
        findFill(findConfirmPassword, "11111111");
        registerButton.click();
    }

    public void registertestMale() {
        buttonGenderMale.click();
        findFill(findFirstName, "Misha");
        findFill(findLastName, "Petrov");
        findFill(findEmail, "ffff@sss.ru");
        findFill(findPassword, "11111111");
        findFill(findConfirmPassword, "11111111");
        registerButton.click();
    }

}
