import java.util.UUID;

import org.junit.Test;

public class TaskTests  extends BaseTests{
    String mailName = "test123c123@gmail.com";
    String mailPassword = "Helena1!"; 
    String projectName = "QA PROJECT";
    String randomProject= UUID.randomUUID().toString();
    
    @Test
 public void addTaskField(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    TaskPage taskPage = new TaskPage(driver);

    loginPage.basePage();
    loginPage.loginButton();
    loginPage.loginF(mailName, mailPassword);
    homePage.addNewButton();
    homePage.addNewProject(projectName);
    taskPage.createTask();
  

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

 }

}
