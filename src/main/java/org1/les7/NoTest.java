package org1.les7;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDravers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
        WebElement iframe = null;
        try {
            iframe =  webDriver.findElement(By.cssSelector("#iframe > iframe"));
        }catch (NotFoundException e){
            System.out.println("Элемент не найден");
        }
//я не понимаю как сделать домашку нужны консультации
        WebDriver frame = webDriver.switchTo().frame(iframe);
        System.out.println(webDriver.getTitle());
       //frame.sendKeys("W3Schools Free Online Web Tutorials");



        Thread.sleep(2000);
        webDriver.quit();
    }
}
