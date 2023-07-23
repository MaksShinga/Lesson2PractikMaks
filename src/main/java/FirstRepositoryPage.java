import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class FirstRepositoryPage extends BasePage {

    private By issuesButtonLocator = By.id("issues-tab");
    public final static String TITLE = "FirstRepository Page";

    public FirstRepositoryPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public IssuesPage goIssuesPage() {
        assertTrue(driver.findElement(issuesButtonLocator).isDisplayed());
        driver.findElement(issuesButtonLocator).click();
        return new IssuesPage(driver);
    }
}
