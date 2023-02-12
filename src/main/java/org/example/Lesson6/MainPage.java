package org.example.Lesson6;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class MainPage extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[1]/a")
    private WebElement face;

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[2]/a")
    private WebElement news;

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[5]/a")
    private WebElement shorts;

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[6]/a")
    private WebElement video;

    @FindBy(id = "idcta-username")
    private WebElement signIn;

    public MainPage(WebDriver driver){
        super(driver);

    }

    public void goToAccountPage(){
        signIn.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("account.livejournal.com/"));

    }

    public void navigateToFace(){
        this.face.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("face"));
    }

    public void navigateToVideo(){
        this.video.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("video"));
    }

    public void navigateToShorts(){
        this.shorts.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("shorts"));
    }

    public void navigateToNews(){
        this.news.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("news"));
    }
}
