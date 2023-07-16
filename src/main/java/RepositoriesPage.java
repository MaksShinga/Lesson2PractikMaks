import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RepositoriesPage extends BasePage {

    List<WebElement> repositoriesList = driver.findElements(By.xpath("//a[@itemprop=\"name codeRepository\"]"));
    public final static String TITLE = "Repositories Page";

    public RepositoriesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public FirstRepositoryPage goToFirstRepository() {
        WebElement firstRepository = repositoriesList.get(0);
        firstRepository.click();
        return new FirstRepositoryPage(driver);
    }
}
