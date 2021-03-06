package org1.les2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apples2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDravers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        System.out.println("Start test");

        webDriver.navigate().to("https://itstep.dp.ua/about-academy/");
        System.out.println("Loaded itstep.dp.ua/about-academy/" + webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());
        String title = "О КА ШАГ";
        Thread.sleep(1000);

        webDriver.navigate().to("https://itstep.dp.ua/formy-obucheniya/");
        System.out.println("Loaded itstep.dp.ua/formy-obucheniya/" + webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());
        String title1 = "Об обучении в КА ШАГ";
        Thread.sleep(1000);

        webDriver.navigate().to("https://itstep.dp.ua/testirovanie-pz-qa/");
        System.out.println("Loaded itstep.dp.ua/testirovanie" + webDriver.getCurrentUrl());
        String title2 = "О курсах тестирования ПО в КА ШАГ";
        Thread.sleep(1000);

        webDriver.quit();
        System.out.println("End test");

    }
}



