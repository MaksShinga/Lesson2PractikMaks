import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class IssuesPage extends BasePage{
    //span[contains(text(), "New issue")]/parent::a
    private By newIssueButtonLocator = By.xpath("/html/body/div[1]/div[6]/div/main/turbo-frame/div/div[1]/div[2]/a");
    public final static String TITLE = "Issues Page";

    public IssuesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public NewIssuePage goToNewIssuePage() {
        assertTrue(driver.findElement(newIssueButtonLocator).isDisplayed());
        driver.findElement(newIssueButtonLocator).click();
        return new NewIssuePage(driver);
    }
}
