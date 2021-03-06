package org1.les4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testsait {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDravers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");

        webDriver.navigate().to("http://google.com");

        WebElement str = webDriver.findElement(By.name("q"));

        str.sendKeys("метод исикавы");
        str.submit();

        WebElement elfull = webDriver.findElement(By.cssSelector("#result-stats"));
        Thread.sleep(4000);
        WebElement eltime = webDriver.findElement(By.cssSelector("#result-stats > nobr"));

        String s = elfull.getText();
        String t = eltime.getText();
        s = s.replace(t, "");
        System.out.println(s);
        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());

        Thread.sleep(2000);
        System.out.println("End test");
        webDriver.quit();
    }
}
