import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class GitHubTest extends  BaseTest{
    @Test
    public void smokeIssuesTab() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("maksimshingelskij@gmail.com", "biDbov-6ceffu-xuhvyp");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm().goToRepositoriesPage();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        repositoriesPage.goToFirstRepository();
        FirstRepositoryPage firstRepositoryPage = new FirstRepositoryPage(driver);
        firstRepositoryPage.goIssuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToNewIssuePage();
        NewIssuePage newIssuePage = new NewIssuePage(driver);
        newIssuePage.createNewIssue("Test title!!!!!!", "Test issue!!!!!!!!!!!!!!");
        CreatedIssuePage createdIssuePage = new CreatedIssuePage(driver);
        createdIssuePage.editIssue("Edit text for issue)))");
        createdIssuePage.closeIssue();
    }
    @DataProvider(name = "repositories")
    public Object[][] repositoriesData() {
       return new Object[][] {
               {1},
               {2},
               {3},
       };
    }
    @Test(dataProvider = "repositories")
    public void testRepository(int index, String name) {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("maksimshingelskij@gmail.com", "biDbov-6ceffu-xuhvyp");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm().goToRepositoriesPage();
        List<WebElement> repositoriesList = new RepositoriesPage(driver).repositoriesList;
        repositoriesList.get(index).click();
    }
}
