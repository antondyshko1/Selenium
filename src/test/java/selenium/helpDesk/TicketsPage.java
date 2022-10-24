package selenium.helpDesk;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.core.BaseSeleniumPage;

public class TicketsPage extends BaseSeleniumPage {
    @FindBy(id = "search_query")
    private WebElement searchFiled;

    @FindBy(xpath = "//div[@class='tickettitle']")
    private WebElement ticket;

    public TicketsPage() {
        PageFactory.initElements(driver,this);
    }

    /**
     * Метод для поиска тикета 
     */
    public TicketPage findTicket(String str){
        searchFiled.sendKeys(str, Keys.ENTER);
        ticket.click();
        return new TicketPage();
    }
}