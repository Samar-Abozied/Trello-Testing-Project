import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Home {

    public static void waitforsecs(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    // setup driver
    static WebDriver driver;

    // @before test  and pre con
    @BeforeTest
    public void beforetest() {
        driver = new FirefoxDriver(); // call the driver
        driver.get("https://trello.com");
        driver.manage().window().maximize();
        //assert login button
        driver.findElement(By.cssSelector("a.Buttonsstyles__Button-sc-1jwidxo-0:nth-child(1)")).click();
        waitforsecs(1); // to give website time to load
        driver.findElement(By.id("username")).sendKeys("depitest0@gmail.com");
        driver.findElement(By.id("login-submit")).click();
        waitforsecs(2);
        driver.findElement(By.id("password")).sendKeys("DEPIproject");
        driver.findElement(By.id("login-submit")).click();
    }


    //creat new board
    @Test
    public void anewboard() {
        waitforsecs(5);
        driver.findElement(By.className("kpv7OitsgQTIxo")).click(); // open workspaces
        waitforsecs(3);
        driver.findElement(By.className("ttcGgLZyrVNTum")).click(); // go to mohamed  W.S
        waitforsecs(1);
        driver.findElement(By.cssSelector(".yHNJHUiQwHcogt")).click();
        waitforsecs(1);
        driver.findElement(By.xpath("/html/body/div[2]/div/section/div/form/div[1]/label/input")).sendKeys("newboard");
        waitforsecs(1);
        driver.findElement(By.cssSelector(".ijFumaLuInvBrL")).click();
    }


    // add newlist
    @Test
    public void bnewlist() {
        waitforsecs(3);
        driver.findElement(By.className("kpv7OitsgQTIxo")).click(); // open workspaces
        waitforsecs(2);
        driver.findElement(By.className("ttcGgLZyrVNTum")).click(); // go to mohamed  W.S
        waitforsecs(1);
        driver.findElement(By.cssSelector("[title='testboard']")).click(); // go to testboard
        waitforsecs(1);
        driver.findElement(By.cssSelector(".CSwccJ0PrMROzz")).click(); // click add another list
        waitforsecs(1);
        driver.findElement(By.className("oe8RymzptORQ7h")).sendKeys("newlist");
        waitforsecs(1);
        driver.findElement(By.cssSelector(".zqgdmniUdb1ZQ7 > button:nth-child(1)")).click();
    }

    @Test
    public void carchivelist() {
        waitforsecs(3);
        driver.findElement(By.className("kpv7OitsgQTIxo")).click(); // open workspaces
        waitforsecs(2);
        driver.findElement(By.className("ttcGgLZyrVNTum")).click(); // go to mohamed  W.S
        waitforsecs(1);
        driver.findElement(By.cssSelector("[title='testboard']")).click(); // go to testboard
        waitforsecs(2);
        driver.findElement(By.cssSelector("[type=button]")).click();
        waitforsecs(2);
        driver.findElement(By.className("gJDsPins_eYkBM")).click();
    }


    @Test
    public void deleteboard() {
        waitforsecs(2);
        driver.findElement(By.className("nNP_5Djh_w6vsG r1qqiIjlUDS6sp")).click();
        waitforsecs(2);
        driver.findElement(By.cssSelector("button.mWC2xT8NP_mW2g:nth-child(1)")).click(); // open workspaces
        waitforsecs(2);
        driver.findElement(By.className("ttcGgLZyrVNTum")).click(); // go to mohamed  W.S
        waitforsecs(2);
        driver.findElement(By.className("css-snhnyn")).click();
    }

    @AfterTest
    public void aftertest() {
        waitforsecs(10);
        driver.close();

    }


}