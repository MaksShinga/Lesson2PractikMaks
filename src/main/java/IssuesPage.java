import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IssuesPage extends BasePage{

    private By newIssueButtonLocator = By.xpath("//span[contains(text(), \"New issue\")]/parent::a");

    public IssuesPage(WebDriver driver) {
        super(driver);
    }

    public NewIssuePage goToNewIssuePage() {
        Assertions.assertTrue(driver.findElement(newIssueButtonLocator).isDisplayed());
        driver.findElement(newIssueButtonLocator).click();
        return new NewIssuePage(driver);
    }
}
