import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By loginButtonBy=By.id("menu-item-2509");
    By mailBy = By.id("email");
    By passwordBy = By.id("password") ;   
    By signinButtonBy = By.id("button-submit");
   
    
    public LoginPage loginButton(){
        click(loginButtonBy);
        return this;
    } 
    public LoginPage loginF(String username,String password){
      writeText(mailBy,username) ;
      writeText(passwordBy,password);
      click(signinButtonBy);
      return this;  


    }
    
    
}
