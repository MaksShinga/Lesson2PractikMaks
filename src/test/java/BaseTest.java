import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    protected Logger logger;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/maksmur/IdeaProjects/MyTestFramework/src/main/resources/drivers/chromedriver");
        Logger logger = LogManager.getLogger();
        logger.info("Chrome driver object creation is starting");
        driver = new ChromeDriver();
        logger.info("Chrome driver object is created ");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://github.com");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
