package org.example.Lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainPageTest extends AbstractPageTest {
    @Test
    void clickToSport(){
        new MainPage(getWebDriver()).navigateToFace();
        Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToTravel(){
        new MainPage(getWebDriver()).navigateToShorts();
    }

    @Test
    void clickToWork(){
        new MainPage(getWebDriver()).navigateToVideo();
    }
}
