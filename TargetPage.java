import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TargetPage extends BasePage {

    public TargetPage(WebDriver driver) {
        super(driver);

    }

    By nextButtonBy = By.xpath("/html/body/ui-view/div/div[2]/div/div/ui-view/div/div[3]/div[2]/div[2]/div[1]/span");
    By interFieldBy = By.cssSelector(".item-0");
    By imgMailChimpBy = By.xpath("/html/body/ui-view/div/div[2]/div/div/ui-view/div/div[2]/div/div/div/div/div[3]/div[2]/div/div[1]/img");
    By chimpFieldBy = By.cssSelector("input.ng-pristine:nth-child(2)");
    By chimpDiscriFieldBy = By.cssSelector("#description");
    By nextButtonCBy = By.cssSelector("div.btn:nth-child(2)");
    By apiChimpFieldBy = By.cssSelector("#api-key");
    By apiButtonBy = By.cssSelector("div.btn:nth-child(1)");
    By newxtBattonBy = By.xpath("/html/body/ui-view/div/div[2]/div/div/ui-view/div/div[3]/div[2]/div[2]/div[1]/span");

    public TargetPage buttonNext() {
        click(nextButtonBy);
        return this;
    }

    public TargetPage integrationTarget(String integration) {
        writeText(nextButtonBy, integration);
        click(imgMailChimpBy);
        return this;
    }

    public TargetPage fieldTarget(String target) {
        writeText(chimpFieldBy, target);
        writeText(chimpDiscriFieldBy, target);
        click(nextButtonCBy);
        return this;
    }
    public TargetPage mailChampApi(String name){
        writeText(apiChimpFieldBy, name);
        click(apiButtonBy);
        click(newxtBattonBy);
        return this;
    }

}
