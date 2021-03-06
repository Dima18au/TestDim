package org1.les1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class Apples1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDravers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "https://atlasweekend.com/";
        System.out.println("Загружается страница музыкального фестиваля Atlas");
        webDriver.get(url);
        Thread.sleep(1000);
        System.out.println();
        if(url.equals(webDriver.getCurrentUrl())){
            System.out.println("Pass");
        }else {
            System.out.println("Error");
        }
        System.out.println(webDriver.getTitle());
        String title = "Музыкальный фестиваль Atlas";
        if(url.equals(webDriver.getTitle())){
            System.out.println("Pass");
        }else {
            System.out.println("Error");
        }
         String pageSource = webDriver.getPageSource();
        System.out.println("OK");
        webDriver.quit();
    }
}

