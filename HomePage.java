import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    By newProjectButtonBy = By.className("menu-button");
    By projectNameFieldBy = By.className("project-name");
    By doneButtonBy =By.cssSelector("div.ng-binding:nth-child(1)");

    public HomePage addNewButton(){
        click(newProjectButtonBy);

         return this;
    
    }
    public HomePage addNewProject(String projectName){
        writeText(projectNameFieldBy, projectName);
        click(doneButtonBy);
        
        return this;
    }

    
    
}
