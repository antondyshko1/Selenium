package selenium.core;

import org.openqa.selenium.WebDriver;
abstract public class BaseSeleniumPage {// Делаем абстрактным, чтобы не создать экземпляр
    protected static WebDriver driver;
    public static void setDriver(WebDriver webDriver){ // Присваиваем вебдрайвер, который инициализируется в тестовом классе
        driver = webDriver;
        }
}

