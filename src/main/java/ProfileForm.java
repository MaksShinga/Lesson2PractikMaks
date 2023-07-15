import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileForm extends BasePage {
    By yourRepositButtonLocator = By.xpath("//span[contains(text(), \"Your repositories\")]/parent::a");

    public ProfileForm(WebDriver driver) {
        super(driver);
    }

    public RepositoriesPage goToRepositoriesPage() {
        Assertions.assertTrue(driver.findElement(yourRepositButtonLocator).isDisplayed());
        driver.findElement(yourRepositButtonLocator).click();
        return new RepositoriesPage(driver);
    }


}
