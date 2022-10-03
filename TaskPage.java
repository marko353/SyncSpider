import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskPage  extends BasePage{

    public TaskPage(WebDriver driver) {
        super(driver);
        }

        By createFirstTaskBy = By.cssSelector("#empty-task-list-button");
        
        
       

        public TaskPage createTask(){
           
            click(createFirstTaskBy);
            return this;
        }

    
}
