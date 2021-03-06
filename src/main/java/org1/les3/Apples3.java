package org1.les3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Apples3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDravers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "C:\\Users\\HP\\IdeaProjects\\Ddvmaven\\index2.html";

        System.out.println("Start test");
        webDriver.get(url);

        List<WebElement> td = webDriver.findElements(By.tagName("td"));

        for (WebElement t : td) {
            System.out.println("text = " + t.getText());
            System.out.println("tagName = " + t.getTagName());
            System.out.println("display = " + t.isDisplayed());
            System.out.println(" ========== ");
        }
        WebElement Link = webDriver.findElement(By.linkText("deteils"));
        Link.click();
        String exurl = webDriver.getCurrentUrl();
        if(exurl.equals("https://ru.wikipedia.org/wiki/%D0%91%D1%83%D1%80%D0%B4%D0%B6-%D0%A5%D0%B0%D0%BB%D0%B8%D1%84%D0%B0"))
        {
            System.out.println("Pass");
        }else {
            System.out.println("Error");
        }
        webDriver.quit();
        System.out.println("End test");
    }
}
