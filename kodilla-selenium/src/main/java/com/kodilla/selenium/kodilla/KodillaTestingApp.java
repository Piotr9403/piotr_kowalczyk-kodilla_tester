package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KodillaTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");


        WebElement inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
        inputField.sendKeys("KodillaTester@gmail.com");
        inputField = driver.findElement(By.xpath("//*[@id=\"sign-in\"]/form/fieldset[2]/input"));
        inputField.sendKeys("Haslo");
        //Wywołuje metode symulacji wciśnięcia logowania do portalu
//        inputField = driver.findElement(By.xpath("//*[@id=\"sign-in\"]/form/div[2]/button"));
//        inputField.submit();

    }
}
