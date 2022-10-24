package selenium.helpDesk;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.core.BaseSeleniumPage;

public class LoginPage extends BaseSeleniumPage {
    @FindBy (id = "username")
    private WebElement loginField;

    @FindBy (id = "password")
    private WebElement passwordField;

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    /**
     * Метод для авторизации и перехода на страницу TicketsPage
     */

    public TicketsPage auth(String login, String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password, Keys.ENTER);
        return new TicketsPage();//
    }
}