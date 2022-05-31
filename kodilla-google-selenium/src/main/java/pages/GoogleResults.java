package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")
    private List<WebElement> results;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());

    }

    public void clickRandomResult() throws InterruptedException {
        Random random = new Random();
        int n = random.nextInt(results.size());
        WebDriverWait wait = new WebDriverWait(driver, 10);
        System.out.println(results.get(n));
        wait.until(ExpectedConditions.elementToBeClickable(results.get(n))).click();
        Thread.sleep(2000);
        //GoogleResults googleResults = new GoogleResults(driver);

    }
}
