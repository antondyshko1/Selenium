package selenium.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {

    /**
     * Класс в котором инициализируем драйвер и прописываем настройки
     */
    protected WebDriver driver;
    @BeforeEach
    public void  setUp(){
        WebDriverManager.chromedriver().setup();// Скачиваем вебдрайвер
        driver = new ChromeDriver(); // Обозначаем, что переменная driver является хром драйвер
        driver.manage().window().maximize();//Открываем браузер во весь экран
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// Время загрузки страницы
        driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);//Время ожидание элемента
        BaseSeleniumPage.setDriver(driver); //Инициализация драйвера
    }
    @AfterEach
    public void tearDown(){
        driver.close();//Останавливаем драйвер
        driver.quit();//Закрываем браузер
    }

}
