import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class MtsTest {
static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void pageStartup() {
        driver.get("http://www.mts.by");
        WebElement button = driver.findElement(By.id("cookie-agree"));
        button.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testBlockTitle() {
        WebElement blockTitle = driver.findElement(By.cssSelector(".homepage .pay h2"));
        String expectedTitle = "Онлайн пополнение без комиссии";
        Assert.assertEquals(blockTitle.getText().replaceAll("\n", " "), expectedTitle);
    }

    @Test
    public void testPayLogos() {
        List<WebElement> logos = driver.findElements(By.cssSelector(".homepage .pay__partners li img"));
        Assert.assertFalse(logos.isEmpty());
    }

    @Test
    public void testMoreAboutServiceLink() {
        String mainPage = "http://www.mts.by";
        WebElement moreAboutServiceLink = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        moreAboutServiceLink.click();
        Assert.assertNotEquals(driver.getCurrentUrl(), mainPage);
        driver.get("http://www.mts.by");
    }

    @Test
    public void testContinueButton() {
        WebElement phoneNumberField = driver.findElement(By.id("connection-phone"));
        WebElement sumField = driver.findElement(By.id("connection-sum"));
        WebElement continueButton = driver.findElement(By.cssSelector(".homepage .pay-form button[type=submit]"));
        phoneNumberField.sendKeys("297777777");
        sumField.sendKeys("100");
        continueButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement popup = driver.findElement(By.cssSelector(".bepaid-app__container"));
        boolean displayed = popup.isDisplayed();
        assert (displayed);
        driver.get("http://www.mts.by");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}