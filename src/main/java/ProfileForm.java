import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class ProfileForm extends BasePage {
    By yourRepositButtonLocator = By.xpath("//span[contains(text(), \"Your repositories\")]/parent::a");
    public final static String TITLE = "ProfileForm Page";

    public ProfileForm(WebDriver driver) {
        super(driver, TITLE);
    }

    public RepositoriesPage goToRepositoriesPage() {
        assertTrue(driver.findElement(yourRepositButtonLocator).isDisplayed());
        driver.findElement(yourRepositButtonLocator).click();
        return new RepositoriesPage(driver);
    }


}
