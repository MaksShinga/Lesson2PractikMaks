import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By logoLocator = By.className("header-logo");
    private By loginFieldLocator = By.id("login_field");
    private By passwordFieldLocator = By.id("password");
    private By signInButtonLocator = By.xpath("//input[@value=\"Sign in\"]");
    private By errorTextLocator = By.xpath("//div[contains(text(), 'Incorrect username or password.')]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MainPage loginSuccessful(String login, String password) {
        driver.findElement(loginFieldLocator).sendKeys(login);
        driver.findElement(passwordFieldLocator).sendKeys(password);
        driver.findElement(signInButtonLocator).click();
        return new MainPage(driver);
    }

    public LoginPage loginFailed(String login, String password) {
        driver.findElement(loginFieldLocator).sendKeys(login);
        driver.findElement(passwordFieldLocator).sendKeys(password);
        driver.findElement(signInButtonLocator).click();
        return this;
    }
}
