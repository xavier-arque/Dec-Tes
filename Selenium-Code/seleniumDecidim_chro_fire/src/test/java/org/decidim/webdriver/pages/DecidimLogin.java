package org.decidim.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * Created by xavier arque on 18/04/18.
 * This class checks out that the user can sig in in the log-in page
 * due to problems with chrome driver I used the actions and thus can not use the By
 *
 */

public class DecidimLogin {

    private WebDriver driver;
    private Actions act;

    /**
     * Identify page locators
     */

   /* By userDecidim = By.name("user[email]");
    By passwordDecidim = By.name("user[password]");
    By login = By.name("commit");*/
    By titleText1 = By.xpath("//*[@class='heading1']");
    By sigIn1 = By.xpath("//*[@class='flash callout success']");

    By loginButton = By.name("commit");

    String buttonSingIn = "a.sign-in-link";
    String buttonElementNameRemember = "user_remember_me";
    String buttonLogIn = "button.expanded";


    WebElement sigIn = driver.findElement(By.cssSelector(buttonSingIn));
    WebElement passwordDecidim = driver.findElement(By.name("user[password]"));
    WebElement userDecidim = driver.findElement(By.name("user[email]"));
    WebElement logIn = driver.findElement(By.cssSelector(buttonLogIn));
    WebElement chekButo = driver.findElement(By.id(buttonElementNameRemember));

    public DecidimLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void signInToDecidim() throws InterruptedException
    {
        act= new Actions(driver); // I don't get it why I can not get rid of this act=
        act.moveToElement(sigIn)
                .click()
                .build()
                .perform();
        Thread.sleep(1000);
    }

        // Enter the user name with a prior clear any text as a user
    public void enterName(String text) throws InterruptedException
    {
        //act = new Actions(driver);
        act.moveToElement(userDecidim)
                .click() // hover and click
                .sendKeys(Keys.END) // goes to the end of the text field
                .keyDown(Keys.SHIFT)
                .sendKeys(Keys.HOME)// goes to the begining of the text field
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.BACK_SPACE) // clears all the selected text
                .sendKeys(text) // enters user name
                .build()
                .perform();
    }

    public void enterPass(String text) throws InterruptedException
    {
        act.moveToElement(passwordDecidim)
                .click() // hover and click
                .sendKeys(Keys.END) // goes to the end
                .keyDown(Keys.SHIFT)
                .sendKeys(Keys.HOME)// goes to the begining of the text field
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.BACK_SPACE) // clears all the selected text
                .sendKeys(text)
                .build()
                .perform();
    }

    //  Click check mark and login button
    public void clickButtonLogin() throws InterruptedException
    {
      // act = new Actions(driver);
       chekButo.click();
       if (chekButo.isSelected()) {System.out.println("Checkbox is Toggled On");
        }
        else {System.out.println("Checkbox is Toggled Off");
        }
       Thread.sleep(1000);
       act.moveToElement(logIn) // hover and click
                .click()
                .build()
                .perform();

        System.out.println("Login Done");
        Thread.sleep(1000);

        String signInOK = driver.findElement(sigIn1).getText(); // use the By signIn
        System.out.println("The Flash message says: " + signInOK); // I don't know why it adds an \n * at the end
    }

           //Get the title of the page you are after the login process
    public String getLoginTitle() {
        String titulo = driver.findElement(titleText1).getText(); // use the By titletext
        System.out.println("This page title is: " + titulo);
        return driver.findElement(titleText1).getText();
    }

    /**
     * This POM method will be exposed in test case to login in the website
     * @param strUserName
     * @param strPassword
     * @return
     */


}
