import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatedIssuePage extends BasePage{
    private By editButtonLocator = By.xpath("//span[contains(text(), \"Edit\")]//ancestor::button");
    private By saveButtonLocator = By.xpath("//button[@class=\"Button--secondary Button--medium Button\"]");
    private By titleFieldLocator = By.id("issue_title");
    private By closeIssueButtonLocator = By.xpath("//button[@name=\"comment_and_close\"]");

    public CreatedIssuePage(WebDriver driver) {
        super(driver);
    }
    public CreatedIssuePage editIssue(String title) {
        driver.findElement(editButtonLocator).click();
        driver.findElement(titleFieldLocator).clear();
        driver.findElement(titleFieldLocator).sendKeys(title);
        driver.findElement(saveButtonLocator).click();
        return new CreatedIssuePage(driver);
    }

    public CreatedIssuePage closeIssue() {
        Assertions.assertTrue(driver.findElement(closeIssueButtonLocator).isDisplayed());
        driver.findElement(closeIssueButtonLocator).click();
        return new CreatedIssuePage(driver);
    }
}
