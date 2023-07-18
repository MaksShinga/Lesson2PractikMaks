import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewIssuePage extends  BasePage{

    private By titleFieldLocator = By.id("issue_title");
    private By commentFieldLocator = By.id("issue_body");
    private By submitNewIssueButtonLocator = By.xpath("//button[@class=\"btn-primary btn ml-2\"]");
    public final static String TITLE = "NewIssue Page";

    public NewIssuePage(WebDriver driver) {
        super(driver, TITLE);
    }

    public CreatedIssuePage createNewIssue(String title, String comment) {
        driver.findElement(titleFieldLocator).sendKeys(title);
        driver.findElement(commentFieldLocator).sendKeys(comment);
        driver.findElement(submitNewIssueButtonLocator).click();
        logger.info("New issue is created");
        return new CreatedIssuePage(driver);
    }
}
