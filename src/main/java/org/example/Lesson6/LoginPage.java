package org.example.Lesson6;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static java.sql.DriverManager.getDriver;

public class LoginPage extends AbstractPage {
    @FindBy(id = "user")
    private WebElement login;

    @FindBy(id = "lj_loginwidget_password")
    private WebElement password;


    @FindBy(id = "action:login")
    private WebElement submit;
    private Alert passwordInput;


    public LoginPage(WebDriver driver) {

        super(driver);
    }

    public void loginIn() {
        this.submit.click();
    }

    public LoginPage setLogin(String login) {
        this.login.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password) {
        this.password.click();
        this.passwordInput.sendKeys(password);
        return this;


    }
}
