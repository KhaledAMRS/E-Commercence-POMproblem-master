package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.Hooks;

public class LoginPage {
    public LoginPage()
    {

        PageFactory.initElements(Hooks.driver, this);
    }
    @FindBy(id = "username")
    WebElement usernamePF;

    public WebElement usernamePOM ()
    {
        By username = By.id("username");
        WebElement usernameEle = Hooks.driver.findElement(username);
        return usernameEle;
    }
    public WebElement passwordPOM ()

    {
        return  Hooks.driver.findElement(By.name("password"));
    }
    public By flashPOM ()
    {
        return  (By.id("flash"));
    }

    public By logoutPOM ()

    {
        return  By.cssSelector("a[href=\"/logout\"]");
    }
    public void LoginSteps ( String username, String password)
    {
        usernamePF.clear();
        usernamePOM().sendKeys(username);
        passwordPOM().sendKeys(password);
    }

}
