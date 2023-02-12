package org.example.Lesson6;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class LoginInTest extends AbstractPageTest{
    @Test
    void loginIn(){
        new MainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(getWebDriver().getTitle().equals("Sign in"), "страница входа недоступна");
        new LoginPage(getWebDriver())
                .setLogin("123Evgeniy12345")
                .setPassword("123Qwerty12345")
                .loginIn();
        Assertions.assertTrue(getWebDriver().findElement(By.id("user")).getText().equals("Your account"));

    }


    @AfterEach
    void logout(){
        new MainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(getWebDriver().getTitle().equals("account overview"), "страница аккаунта не доступна");
        new AccountPage(getWebDriver()).logOut();
        new WebDriverWait(getWebDriver(),Duration.ofSeconds(5));
        Assertions.assertTrue(getWebDriver().findElement(By.id("user")).getText().equals("Sign in"));
    }


}
