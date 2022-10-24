package selenium.helpDesk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.core.BaseSeleniumPage;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "//select[@id='id_queue']")
    private WebElement queueList;

    @FindBy(xpath = "//select[@name='queue']//option[@value='1']")
    private WebElement queueValue;

    @FindBy(id = "id_title")
    private WebElement title;

    @FindBy(id = "id_body")
    private WebElement body;

    @FindBy(id = "id_due_date")
    private WebElement dateField;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//a[text()='23']")
    private WebElement dateValue;

    @FindBy(id = "id_submitter_email")
    private WebElement email;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(id = "userDropdown")
    private WebElement loginButton;

    /**
     * Инициализируем PageFactory для взаимодействия с элементами на странице и открытие url
     * Когда создадим экземпляр класса MainPage откроется url и произойдет инициализация всех элементов на странице
     */
    public MainPage() {// Создали пустой конструктор
        driver.get("https://django-helpdesk-demo.herokuapp.com/"); // Открытие url в браузере
        PageFactory.initElements(driver, this);// Инициализируем все элементы на странице, передаем драйвер и класс, который хотим
        // инициализировать. Драйвер лежит в родительском классе.
    }


    /**
     * Метод для взаимодействия с элементами на странице
     */
    public MainPage createTicket(String titleValue, String bodyValue, String emailValue) {
        queueList.click();
        queueValue.click();
        title.sendKeys(titleValue);
        body.sendKeys(bodyValue);
        dateField.click();
        dateValue.click();
        email.sendKeys(emailValue);
        submitButton.click();
        return this; // Возвращаем this чтобы были доступны все методы из этого класса.
    }

    public LoginPage openLoginPage() {
        loginButton.click();
        return new LoginPage();
    }
}