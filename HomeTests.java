import java.util.UUID;

import org.junit.Test;

public class HomeTests extends BaseTests {
  
    String projectName = "QA PROJECT";
    String mailName = "test123c123@gmail.com";
    String randomProject = UUID.randomUUID().toString();
    String mailPassword = "Helena1!";
    @Test
    public void addFieldProject() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.loginButton();
        loginPage.loginF(mailName, mailPassword);
        homePage.addNewButton();
        homePage.addNewProject(projectName);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
