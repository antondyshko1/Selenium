package selenium.helpDesk;

import helpers.TestValues;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import selenium.core.BaseSeleniumTest;

import static helpers.StringModifire.getUniquesString;

public class HelpDeskTest extends BaseSeleniumTest {
    @Test
    public void checkTicket(){
        String title = getUniquesString(TestValues.TEST_TITLE);
        selenium.helpDesk.TicketPage ticketPage = new  MainPage().createTicket(title, TestValues.TEST_BODY, TestValues.TEST_EMAIL)
                                                                 .openLoginPage()
                                                                 .auth("demo","demo1234")
                                                                 .findTicket(title);
        Assertions.assertTrue(ticketPage.getTitle().contains(title));
        Assertions.assertEquals(ticketPage.getBody(),TestValues.TEST_BODY);
        Assertions.assertEquals(ticketPage.getEmail(),TestValues.TEST_EMAIL);
    }
}
