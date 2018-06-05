package pages;

/***
 * @author Xavier Arque
 *
 *
 * This Class will store all the locators and methods of login page
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigReader;

public class LoginPage_v1
{
    WebDriver driver;
    ConfigReader configura = new ConfigReader(); // instance the object with all the config data

    By passwordUser = By.id(configura.getWebElement_Login("passwordUser"));
    By emailUser = By.id(configura.getWebElement_Login("emailUser"));
    By loginButton = By.name(configura.getWebElement_Login("loginButton"));
    By checkButton = By.id(configura.getWebElement_checkButton());
    By signUpButton = By.linkText(configura.getWebElement_Login("signUpButton"));
    By createAnAccountButton = By.partialLinkText(configura.getWebElement_Login("createAnAccountButton"));
    By forgotYourPasswordButton = By.partialLinkText(configura.getWebElement_Login("forgotYourPasswordButton"));
    By confirmationInstructionsButton = By.partialLinkText(configura.getWebElement_Login("confirmationInstructionsButton"));

    // I do not use the config file for the xpaths

    By cookieWarning = By.xpath("//*[@class='cookie-warning']");
    By agreeCookieButton = By.xpath("//*[@class='cookie-warning__action']");
    By signInFlashMessage = By.xpath("//div[contains(@class,'flash callout')]");

    /**
     * Methods for this page
     */

   public LoginPage_v1(WebDriver driver)
    {
        this.driver=driver;
    }

    public void enterEmail(String user)
    {
        driver.findElement(emailUser).sendKeys(configura.getUser());
    }

    public void enterPassword(String password)
    {
        driver.findElement(passwordUser).sendKeys(configura.getPassword());
    }

    public void clickButtonLogin()
    {
        try {
            driver.findElement(loginButton).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error message while loading after click: " + e.getMessage());
        }
    }

    public void clickButtonRemember()
    {
        driver.findElement(checkButton).click();
        System.out.println("Checkbox is Toggled On");
    }

    public void clickButtonSignUp() {
        try {
            driver.findElement(signUpButton).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error message while going to sing Up page after click: " + e.getMessage());
        }
    }

    public void clickforgotYourPasswordButton()
    {
        try {
            driver.findElement(forgotYourPasswordButton).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error message while going to create account page after click: " + e.getMessage());
        }

    }

    public void clickCreateAnAccountButton()
    {
        try {
            driver.findElement(createAnAccountButton).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error message while going to create account page after click: " + e.getMessage());
        }

    }

    public void clickconfirmationInstructionsButton()
    {
        try {
            driver.findElement(confirmationInstructionsButton).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error message while going to confirmation instructions page after click: " + e.getMessage());
        }
    }

    public void clickagreeCookieButton()  // uncomment if need it, but be sure you have no cookies
    {
        try {
            driver.findElement(agreeCookieButton).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error message while going to confirmation instructions page after click: " + e.getMessage());
        }
    }

    public void loginPageDecidim(String user, String password) // to be used to check out the whole page
    {
        String actualTitle = driver.getTitle(); // get the actual value of the title and print it
        System.out.println("the page-title is : " + actualTitle );

        // Have to create an if + assert for this
        // System.out.println("The Flash message says: " + driver.findElement(cookieWarning).getText());
        // clickagreeCookieButton();

        clickButtonSignUp();
        System.out.println("the page-title is : " + driver.getTitle());// get the actual value of the title and print it to check out that you are out
        driver.get(configura.getApplicationUrl_Login());

        clickCreateAnAccountButton();
        System.out.println("the page-title is : " + driver.getTitle());// get the actual value of the title and print it to check out that you are out
        driver.get(configura.getApplicationUrl_Login());

        clickforgotYourPasswordButton();
        System.out.println("the page-title is : " + driver.getTitle());// get the actual value of the title and print it to check out that you are out
        driver.get(configura.getApplicationUrl_Login());

        clickconfirmationInstructionsButton();
        System.out.println("the page-title is : " + driver.getTitle());// get the actual value of the title and print it to check out that you are out
        driver.get(configura.getApplicationUrl_Login());

        enterEmail(user);
        enterPassword(password);
        clickButtonRemember();
        clickButtonLogin();
        System.out.println("The Flash message says: " + driver.findElement(signInFlashMessage).getText());//I don't know why it adds an \n * at the end
        System.out.println("after login the actual page-title is: " + driver.getTitle());// get the actual value of the title and print it to check out that you are out
    }

    /*
    public void loginPageDecidim(String user, String password)
    {
        String actualTitle = driver.getTitle(); // get the actual value of the title and print it
        System.out.println("the page-title is : " + actualTitle );
        driver.findElement(emailUser).sendKeys(user);
        driver.findElement(passwordUser).sendKeys(password);
        clickButtonLogin();
        System.out.println("after login the actual page-title is: " + driver.getTitle());
    }*/

    public void loginPageDecidim_Fast(String user, String password) // to be used for simple login
    {
        String actualTitle = driver.getTitle(); // get the actual value of the title and print it
        System.out.println("the page-title is : " + actualTitle );
        enterEmail(user);
        enterPassword(password);
        clickButtonLogin();
        System.out.println("The Flash message says: " + driver.findElement(signInFlashMessage).getText());//I don't know why it adds an \n * at the end
        System.out.println("after login the actual page-title is: " + driver.getTitle());// get the actual value of the title and print it to check out that you are out
    }


    public void loginPageDecidim_Short(String user, String password) // to be used for data driven logins
    {
        System.out.println("the page-title is : " + driver.getTitle());// get the actual value of the title and print it
        driver.findElement(emailUser).sendKeys(user);
        driver.findElement(passwordUser).sendKeys(password);
        clickButtonLogin();

        System.out.println("after login the actual page-title is: " + driver.getTitle());// get the actual value of the title and print it to check out that you are out

        // Assert.assertTrue(driver.findElement(signInFlashMessage).getText().contains("successfully"),"User is not able to login" ); // to be used just in case you need and assert
        System.out.println("user as: "+ user + " and password: " + password);
        System.out.println("The Flash message says: " + driver.findElement(signInFlashMessage).getText());//I don't know why it adds an \n * at the end

    }
}
