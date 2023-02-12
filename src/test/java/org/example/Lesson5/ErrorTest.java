package org.example.Lesson5;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static org.example.Lesson5.AbstractTest.getDriver;

public class ErrorTest {
    @Test
    void test() throws InterruptedException {
        getDriver().get("https://www.livejournal.com/");
        WebElement webElement = getDriver().findElement(By.className("s-header-item__link--login"));
        webElement.click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        Thread.sleep(10000);

        WebElement webElement2 = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("user"));
            }
        });
        webElement2.click();
        webElement2.sendKeys("12345");
        webElement2.submit();
    }

}
