package utilities;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ToolsBox extends BaseClass
{
   // private static WebDriver driver = null;

    WebDriver driver;

    public ToolsBox(WebDriver driver){
        this.driver=driver;
    }

    public void BrokenLinks(String PageUrl) {

        // ConfigReader configura = new ConfigReader();

        // TODO Auto-generated method stub

         String url = "";

        // HttpURLConnection class has methods to send HTTP request and capture HTTP response code

        HttpURLConnection huc = null;

        int respCode = 200;

        driver.manage().window().maximize();

        driver.get(PageUrl);

        List<WebElement> links = driver.findElements(By.tagName("a")); // Collect all links in the decidim page

        Iterator<WebElement> it = links.iterator();

        while(it.hasNext()){

            url = it.next().getAttribute("href"); // Identifying and Validating URL

            System.out.println(url);

            //if(url == null || url.isEmpty())
            if(url == null)
            {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            if(!url.startsWith(PageUrl)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }

            // Send http request

            try {

                // openConnection() method (URLConnection) is type casted to HttpURLConnection.

                huc = (HttpURLConnection)(new URL(url).openConnection());

                huc.setRequestMethod("HEAD");

                // connection to url is established and HEAD request is made
                huc.connect();

                respCode = huc.getResponseCode();

                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

      //  driver.quit();

    }

    // https://stackoverflow.com/questions/43389340/how-to-find-broken-images-for-an-entire-web-site-in-selenium-webdriver-using-jav
    // http://www.seleniumeasy.com/selenium-tutorials/find-broken-images-in-a-webpage-using-webdriver-java
    // https://www.quora.com/Explain-how-you-can-find-broken-images-in-a-page-using-Selenium-Web-driver

       /*

    public class program {

        public static List findAllLinks(WebDriver driver)

        {

            List elementList = new ArrayList();

            elementList = driver.findElements(By.tagName("a"));

            elementList.addAll(driver.findElements(By.tagName("img")));

            List finalList = new ArrayList(); ;

            for (WebElement element : elementList)

            {

                if(element.getAttribute("href") != null)

                {

                    finalList.add(element);

                }

            }

            return finalList;

        }

        public static String isLinkBroken(URL url) throws Exception

        {

            //url = new URL("http://yahoo.com");

            String response = "";

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            try

            {

                connection.connect();

                response = connection.getResponseMessage();

                connection.disconnect();

                return response;

            }

            catch(Exception exp)

            {

                return exp.getMessage();

            }

        }

        public static void main(String[] args) throws Exception {

            // TODO Auto-generated method stub

            FirefoxDriver ff = new FirefoxDriver();

            ff.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

            //ff.get("http://www.yahoo.com/");

            List allImages = findAllLinks(ff);

            System.out.println("Total number of elements found " + allImages.size());

            for( WebElement element : allImages){

                try

                {

                    System.out.println("URL: " + element.getAttribute("href")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));

                    //System.out.println("URL: " + element.getAttribute("outerhtml")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));

                }

                catch(Exception exp)

                {

                    System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + exp.getMessage());

                }

            }

        }

        public void imageTest() throws IOException{
            driver.get("pageURL");
            List<WebElement> allImages= driver.findElements(By.tagName("img"));
            for (int iElement=0;iElement<allImages.size();iElement++) {
                String url = allImages.get(iElement).getAttribute("href");
                URL obj = new URL(url);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("GET");
                if (String.valueOf(con.getResponseCode()).equals("200")){
                    System.out.println("Image @ url " + url + "exists at server");
                }
                else
                    System.out.println("Image @ url " + url + " does not exists at server");
            }
        }

        */
    }





}
