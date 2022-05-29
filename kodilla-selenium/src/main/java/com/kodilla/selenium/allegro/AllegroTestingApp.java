package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div[1]/div/div[2]/div[2]/button[1]")));
        WebElement inputField = driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div[2]/div[2]/button[1]"));
        inputField.click();

        WebElement category = driver.findElement(By.xpath("//*[@aria-label=\"Kategoria i opcje wyszukiwania\"]"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        WebElement drone = driver.findElement(By.xpath("//*[@placeholder=\"czego szukasz?\"]"));
        drone.sendKeys("Mavic mini");
        drone.submit();
    }
}
