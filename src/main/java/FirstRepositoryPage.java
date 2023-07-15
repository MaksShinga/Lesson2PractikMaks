import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstRepositoryPage extends BasePage {

    private By issuesButtonLocator = By.id("issues-tab");

    public FirstRepositoryPage(WebDriver driver) {
        super(driver);
    }

    public IssuesPage goIssuesPage() {
        Assertions.assertTrue(driver.findElement(issuesButtonLocator).isDisplayed());
        driver.findElement(issuesButtonLocator).click();
        return new IssuesPage(driver);
    }
}
