package org.example.Lesson6;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AccountPage extends AbstractPage {
    @FindBy(className = "\n" +
            "                                    s-header-item\n" +
            "                                    s-nav-item__name\n" +
            "                                    ")
    private WebElement exit;

    public AccountPage(WebDriver driver) {
        super(driver);

    }


    public void logOut() {
        this.exit.click();
    }
}
