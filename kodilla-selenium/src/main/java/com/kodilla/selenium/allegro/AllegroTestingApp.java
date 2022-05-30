package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        //pauza programu na 10000 ms po to by ręcznie zaakceptować cookies
        Thread.sleep(10000);

        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement inputField = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/div/div/div[3]/header/div/div/div/div/form/input"));
        inputField.sendKeys("mavic mini");

        WebElement yearCombo = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/div/div/div[3]/header/div/div/div/div/form/div[3]/div/select"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(3);

        inputField = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/div/div/div[3]/header/div/div/div/div/form/button"));
        inputField.submit();

    }
}
