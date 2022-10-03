import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SourcePage  extends BasePage{

    public SourcePage(WebDriver driver) {
        super(driver);
       }
       By csvFieldBy = By.xpath("/html/body/ui-view/div/div[2]/div/div/ui-view/div/div[2]/div/div/div/div/div[3]/div[1]/input");
       By csvSourceBy = By.xpath("/html/body/ui-view/div/div[2]/div/div/ui-view/div/div[2]/div/div/div/div/div[3]/div[2]/div[1]/div[1]/img");
       By nextButtonBy = By.cssSelector("div.btn:nth-child(2)");
       By integrationNameBy = By.cssSelector("input.ng-pristine:nth-child(2)");
       By discriptionFieldBy = By.id("description");
       By nexButtonBy = By.cssSelector("div.btn:nth-child(2)");
       By finishButtonBy = By.xpath("/html/body/div[4]/div[2]/div/div[3]/div[1]");
       By discripionFieldBy = By.cssSelector("#description");
       By spamBBy = By.xpath("/html/body/div[5]/div[2]/div/div[1]/div/div/div/div[1]/div/a/span[3]");
       By localButtonBy = By.xpath("/html/body/div[5]/div[2]/div/div[1]/div/div/div/div[1]/div/div/ul/li/ul/li[1]/div/div");

       public SourcePage inputSource(String source){
        writeText(csvFieldBy, source);
        click(csvSourceBy);
        return this;
       }
       public SourcePage integratiField(String source){
        writeText(integrationNameBy, source);
        writeText(discripionFieldBy, source);
        click(nexButtonBy);
        return this;
       }
       public SourcePage integratiButton(){
       
        click(finishButtonBy);
        
        return this;
       
      
   
    }
    public void discripionFieldBy(String discription) {
    }
}
    
    
