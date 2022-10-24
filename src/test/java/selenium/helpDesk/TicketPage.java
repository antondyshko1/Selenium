package selenium.helpDesk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.core.BaseSeleniumPage;


public class TicketPage extends BaseSeleniumPage {
    @FindBy(xpath = "//th[text()='Submitter E-Mail']/following::td[1]")
    private WebElement email;

    @FindBy(xpath = "//h3")
    private WebElement title;

    @FindBy(xpath = "//td[@id='ticket-description']//p")
    private WebElement body;

    public TicketPage() { // Инициализация элементов на странице
        PageFactory.initElements(driver,this);
    }
    /**
     * Методы, которые возвращают текст из элементов
     */
    public String getEmail(){
        return email.getText();
    }
    public String getTitle(){
        return title.getText();
    }
    public String getBody(){
        return body.getText();
    }
}