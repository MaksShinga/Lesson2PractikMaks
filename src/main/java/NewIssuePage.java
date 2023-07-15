import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewIssuePage extends  BasePage{

    private By titleFieldLocator = By.id("issue_title");
    private By commentFieldLocator = By.id("issue_body");
    private By submitNewIssueButtonLocator = By.xpath("//button[@class=\"btn-primary btn ml-2\"]");

    public NewIssuePage(WebDriver driver) {
        super(driver);
    }

    public CreatedIssuePage createNewIssue(String title, String comment) {
        driver.findElement(titleFieldLocator).sendKeys(title);
        driver.findElement(commentFieldLocator).sendKeys(comment);
        driver.findElement(submitNewIssueButtonLocator).click();
        return new CreatedIssuePage(driver);
    }
}
