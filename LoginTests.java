import org.junit.Test;

public class LoginTests  extends BaseTests {
   
    String mailName = "test123c123@gmail.com";
    String mailPassword = "Helena1!";
    @Test
    public void verifySuccesflllogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.loginButton();
        loginPage.loginF(mailName,mailPassword); 

        try {
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
           

        }

    }
    

