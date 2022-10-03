import java.util.UUID;

import org.junit.Test;

public class SourceTests extends BaseTests {
    String mailName = "test123c123@gmail.com";
    String mailPassword = "Helena1!";
    String projectName = "QA PROJECT";
    String taskName = "First Task";
    String sourceName = "CSV";
    String integrationName = "itegration souce";
    String discriptionField = "Cvs source integration";
    String randomProject = UUID.randomUUID().toString();
    String discription = "create source integration";
    @Test
    public void addCsvField() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        TaskPage taskPage = new TaskPage(driver);
        SourcePage sourcePage = new SourcePage(driver);
        loginPage.basePage();
        loginPage.loginButton();
        loginPage.loginF(mailName, mailPassword);
        homePage.addNewButton();
        homePage.addNewProject(projectName);
        taskPage.createTask();
        sourcePage.inputSource(sourceName);
        sourcePage.integratiField(integrationName);
        sourcePage.integratiButton();
        sourcePage.discripionFieldBy(discription );
        
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
