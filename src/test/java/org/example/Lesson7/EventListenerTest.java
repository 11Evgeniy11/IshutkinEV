package org.example.Lesson7;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class EventListenerTest extends AbstractTest{
    @Test
    void test(){
        try {
            getWebDriver().findElement(By.id("нет такого"));
        } catch (NoSuchElementException e){
            MyUtils.makeScreenshot(getWebDriver(),
                    "failure- org.example.EventListenerTest.test" + System.currentTimeMillis() + ".png");
        }

    }


    @Test
    void test2(){
        WebElement webElement = getWebDriver().findElement(By.className("s-header-item__link--login"));
        webElement.click();

    }
}
