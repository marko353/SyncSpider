import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTests {
    public WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;
    public TaskPage taskPage;
    public SourcePage sourcePage;
    public TargetPage targetPage;
    @Before
    public void setup() {

        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\marko\\OneDrive\\Desktop\\SpiderProject\\SpiderProject\\lib\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.quit();
    }

}
