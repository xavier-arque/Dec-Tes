package proves_delete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class test1 {


    public static void main(String[] args) throws Exception

    {
        System.setProperty("webdriver.chrome.driver",  "src" + File.separator + "main" + File.separator + "resources" + File.separator + "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://staging.decidim.codegram.com");
        System.out.println(driver.getTitle());

        Actions actions = new Actions(driver);

        WebElement sigMenu = driver.findElement(By.linkText ("Sign In"));
        actions.moveToElement(sigMenu);
        actions.click().build().perform();

       driver.findElement(By.id("user_email")).sendKeys("user@example.org");
       driver.findElement(By.id("user_password")).sendKeys("decidim123456");
        System.out.println(driver.getTitle());
       driver.findElement(By.name("commit")).click();
        System.out.println(driver.getTitle());

        WebElement languageMenu = driver.findElement(By.linkText ("English"));
        actions.moveToElement(languageMenu);
        actions.click().build().perform();
        System.out.println(driver.getTitle());
        driver.get("http://staging.decidim.codegram.com");


        WebElement mainMenu = driver.findElement(By.xpath("//*[contains(@href,'account')]"));
        actions.moveToElement(mainMenu);
       // WebElement mainsMenu = driver.findElement(By.xpath("//*[contains(@href,'sign_out')]"));
       // actions.moveToElement(mainsMenu);
        actions.click().build().perform();
        Thread.sleep(3000);


       /* WebElement signOutMenu = driver.findElement(By.xpath("//*[contains(@href,'sign_out')]"));
        actions.moveToElement(signOutMenu);
        actions.click().build().perform();
        Thread.sleep(3000);*/

        driver.close();

    }
}
