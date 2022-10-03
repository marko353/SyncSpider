import java.util.UUID;

import org.junit.Test;

public class TargetTests extends BaseTests {
    String mailName = "test123c123@gmail.com";
    String mailPassword = "Helena1!";
    String projectName = "QA PROJECT";
    String taskName = "First Task";
    String sourceName = "CSV";
    String integrationName = "itegration souce";
    String discriptionField = "Cvs source integration";
    String randomProject = UUID.randomUUID().toString();
    String mailChimp = "mailchimp";
    String integrationNameBy = "CHimp";
    String discriptionChimpBy = "Cvs document integrated to mailChimp";
    String apiKey = "18f7993e47906e235ad3217960a448b5-us14";

    @Test
    public void targetIntegration() {
        
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        TaskPage taskPage = new TaskPage(driver);
        SourcePage sourcePage = new SourcePage(driver);
        TargetPage targetPage = new TargetPage(driver);
        
        loginPage.basePage();
        loginPage.loginButton();
        loginPage.loginF(mailName, mailPassword);
        homePage.addNewButton();
        homePage.addNewProject(projectName);
        taskPage.createTask();
        sourcePage.inputSource(sourceName);
        sourcePage.integratiField(integrationName);
        sourcePage.integratiField(discriptionField);
        targetPage.buttonNext();
        targetPage.integrationTarget(mailChimp);
        targetPage.fieldTarget(integrationNameBy);
        targetPage.fieldTarget(discriptionChimpBy);
        targetPage.mailChampApi(apiKey);


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
