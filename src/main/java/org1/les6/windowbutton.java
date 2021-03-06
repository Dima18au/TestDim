package org1.les6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowbutton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDravers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\HP\\IdeaProjects\\Ddvmaven\\src\\main\\resources\\windows.html");
        String text = new String();//Как задать что только число в строке?

//        WebElement button = null;
//        try {
//            button = webDriver.findElement(By.cssSelector("#alert > button"));
//            button.click();
//        } catch (NotFoundException e) {
//            System.out.println("Элемент не найден");
//
//            WebDriver.TargetLocator targetLocator = webDriver.switchTo();//TargetLocator позволяет переключаться между окнами
//            Alert alert = targetLocator.alert();//вызываем метод alert() чтоб получить обьект Alert
//
//            String expectedText = "It is simple alert";
//            String actualText = alert.getText();
//
//            if (expectedText.equals(actualText)) {
//                System.out.println("Passed");
//            } else {
//                System.out.println("Модальное окно содержит текст " + actualText);
//            }
//            alert.accept();
//
//            System.out.println("Все прошло хорошо");
//
//            //confirm
//            WebElement button1 = null;
//            boolean shouAccept;
//            try {
//                button1 = webDriver.findElement(By.cssSelector("#confirm > button"));
//                button1.click();
//                //         } catch (NotFoundException e) {
//                //             System.out.println("Элемент не найден");
//
//                Alert confirm = webDriver.switchTo().alert();
//
//                //           handleBrowserAlert(confirm, shouAccept); //не определяется handleBrowserAlert
//
//                if (shouAccept) {
//                    System.out.println("Yes");
//                } else {
//                    System.out.println("No");
//                }
//            }
////            prompt
//                WebElement button2 = null;
//                try {
//                    button2 = webDriver.findElement(By.cssSelector("#prompt > button"));
//                    button2.click();
//                    //            } catch (NotFoundException e) {
//                    //                System.out.println("Элемент не найден");
//                    //           }
//                    WebDriver.TargetLocator targetLocator = webDriver.switchTo();
//                    Alert prompt = targetLocator.alert();
//
//                    prompt.sendKeys(text);
//
////            handleBrowserAlert(confirm, shouAccept); //не определяется handleBrowserAlert
//
//                    if (shouAccept) {
//                        System.out.println("Yes");
//                    } else {
//                        System.out.println("No");
//                    }
//                }
////
//                WebElement iframe = null;
//                try {
//                    iframe = webDriver.findElement(By.cssSelector("#iframe > iframe"));
//                } catch (NotFoundException e) {
//                    System.out.println("Элемент не найден");
//                }
//
//                WebDriver frame = webDriver.switchTo().frame(iframe); //дальше ошибка 404
//
//                WebElement select = frame.findElement(By.cssSelector("#selectable > li:nth-child(1)"));
//
//                select.click();
//
//                Thread.sleep(2000);
//                webDriver.quit();
////// всвязи с выше перечисленным нужны консультации
//                System.out.println("End test");
            }
        }



