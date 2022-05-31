package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage{

    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;
    private static GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }


//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fryde\\OneDrive\\Pulpit\\Kodilla-course\\kodilla-google-selenium\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        driver.navigate().to("http://www.google.com");
//        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
//        Thread.sleep(1000);
//        PageFactory.initElements(driver, GoogleSearch.class);
//        inputField.sendKeys("Kodilla");
//        //wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
//        googleResults = loadResults(driver);                          // [2]
//        googleResults.iSeeResults();
//        driver.close();
//    }

    public void searchResults() throws InterruptedException {
        Thread.sleep(1000);
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
        googleResults.clickRandomResult();
    }

    public static GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;

    }
}