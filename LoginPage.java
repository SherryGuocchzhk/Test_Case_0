package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By userId = By.id(app_package_name + "at_username");
    By password = By.id(app_package_name + "et_password");
    By showPassword = By.id(app_package_name + "cb_show_password");
    By login_Button = By.id(app_package_name + "bt_sign");
    By signout_Button = By.id(app_package_name + "bt_sign_out");
    By yesSignout_Button = By.id("android:id/button1");
    By noSignout_Button = By.id("android:id/button2");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage nullEmail() {
        waitForClickabilityOf(login_Button);
        driver.findElement(login_Button).click();
        driver.findElement(yesSignout_Button).click();
        return new LoginPage(driver);
    }

    public LoginPage nullPassword() {
        waitForVisibilityOf(userId);
        driver.findElement(userId).sendKeys("srry.guo@nwstor.com");
        driver.findElement(password).sendKeys("");
        driver.findElement(showPassword).click();
        driver.findElement(login_Button).click();
        driver.findElement(yesSignout_Button).click();
        return new LoginPage(driver);
    }

    public LoginPage invalidLogin() {
        waitForVisibilityOf(userId);
        driver.findElement(userId).sendKeys("srry.guo@nwstor.com");
        driver.findElement(password).sendKeys("Shey19950706");
        driver.findElement(showPassword).click();
        driver.findElement(login_Button).click();
        return new LoginPage(driver);
    }

    public LoginPage wrongPasswordLogin() {
        waitForVisibilityOf(userId);
        driver.findElement(userId).sendKeys("sherry.guo@nwstor.com");
        driver.findElement(password).sendKeys("Shey19950706");
        driver.findElement(showPassword).click();
        driver.findElement(login_Button).click();
        return new LoginPage(driver);
    }

    public LoginPage validLogin() {
        waitForVisibilityOf(userId);
        driver.findElement(userId).sendKeys("sherry.guo@nwstor.com");
        driver.findElement(password).sendKeys("Sherry19950706");
        driver.findElement(showPassword).click();
        driver.findElement(login_Button).click();
        return new LoginPage(driver);
    }

    public LoginPage logOut() {
        waitForClickabilityOf(signout_Button);
        driver.findElement(signout_Button).click();
        waitForClickabilityOf(noSignout_Button);
        driver.findElement(noSignout_Button).click();
        waitForClickabilityOf(signout_Button);
        driver.findElement(signout_Button).click();
        waitForClickabilityOf(yesSignout_Button);
        driver.findElement(yesSignout_Button).click();
        return new LoginPage(driver);
    }
}
