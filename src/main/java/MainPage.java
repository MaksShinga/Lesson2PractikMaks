import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    By imgLocator = By.xpath("//img[@class='avatar circle'][1]");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public ProfileForm goToProfileForm() {
        Assertions.assertTrue(driver.findElement(imgLocator).isDisplayed());
        driver.findElement(imgLocator).click();
        return new ProfileForm(driver);
    }
}
