package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Xavier Arque
 *
 * This class reads the config.property filew where each user must
 * define the pairs keys=value for her/his particular web site
 *
 */

public class ConfigReader
{
    Properties pro;

    public ConfigReader() // loads the config file
    {
        try
        {
            File src = new File("./Configuration/Config.property");
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        }
        catch (Exception e)
        {
            System.out.println("There is a problem accessing the Config file. Exception is == " + e.getMessage());
        }

    }

    // PATHS

    public String getDriver(){ return pro.getProperty("driver");}
    public String getChromePath()
    {
        return pro.getProperty("ChromeDriver");
    }
    public String getFirefoxPath()

    {
        return pro.getProperty("FirefoxDriver");
    }
    public String getChromeLinuxPath()
    {
        return pro.getProperty("ChromeDriver_linux");
    }
    public String getFirefoxLinuxPath()

    {
        return pro.getProperty("FirefoxDriver_linux");
    }
    public String getExcelPath()
    {
        return pro.getProperty("ExcelPath");
    }

    // USERS

    public String getUser()
    {
        return pro.getProperty("user");
    }
    public String getUser1()
    {
        return pro.getProperty("user1");
    }
    public String getUser2()
    {
        return pro.getProperty("user2");
    }
    public String getAdmin()
    {
        return pro.getProperty("admin");
    }
    public String getPassword()
    {
        return pro.getProperty("password");
    }
    public String getPassword1()
    {
        return pro.getProperty("password1");
    }
    public String getPassword2()
    {
        return pro.getProperty("password2");
    }
    public String getDecidimLoginsExcelSheet()
    {
        return pro.getProperty("DecidimLoginsExcelSheet");
    }
    public String getDecidimLoginsExcelSheet2()
    {
        return pro.getProperty("DecidimLoginsExcelSheet2");
    }

    // URLS

    public String getApplicationUrl_Login()
    {
        return pro.getProperty("URL_LOGIN");
    }
    public String getApplicationUrl_Home()
    {
        return pro.getProperty("URL_HOME");
    }
    public String getApplicationUrl_SignUp()
    {
        return pro.getProperty("URL_SIGNUP");
    }
    public String getApplicationUrl_Processess()
    {
        return pro.getProperty("URL_PROCESSESS");
    }
    public String getApplicationUrl_Assemblies()
    {
        return pro.getProperty("URL_ASSEMBLIES");
    }
    public String getApplicationUrl_MoreInformation()
    {
        return pro.getProperty("URL_MORE_INFORMATION");
    }

    //WEBELEMENTS LOGIN PAGE

    public String getWebElement_emailUser()
    {
        return pro.getProperty("emailUser");
    }

    public String getWebElement_passwordUser()
    {
        return pro.getProperty("passwordUser");
    }

    public String getWebElement_loginButton()
    {
        return pro.getProperty("loginButton");
    }

    public String getWebElement_checkButton()
    {
        return pro.getProperty("checkButton");
    }

    public String getWebElement_signUpButton()
    {
        return pro.getProperty("signUpButton");
    }

    public String getWebElement_createAnAccountButton()
    {
        return pro.getProperty("createAnAccountButton");
    }

    public String getWebElement_forgotYourPasswordButton()
    {
        return pro.getProperty("forgotYourPasswordButton");
    }

    public String getWebElement_confirmationInstructionsButton()
    {
        return pro.getProperty("confirmationInstructionsButton");
    }

    // the xpath is to tricky for the config. file so it will be read from the page class
    public String getWebElement_signInFlashMessage()
    {
        return pro.getProperty("signInFlashMessage");
    }

    //WEBELEMENTS LOGIN PAGE



    // it will be much better to use switch instead of if but it may give errors with Strings

    public String getWebElement_Login(String element)
    {
        if(element.equals("emailUser"))
        {
            return pro.getProperty("emailUser");
        }
        else if (element.equals("passwordUser"))
        {
            return pro.getProperty("passwordUser");
        }
        else if (element.equals("signUpButton"))
        {
            return pro.getProperty("signUpButton");
        }
        else if (element.equals("createAnAccountButton"))
        {
            return pro.getProperty("createAnAccountButton");
        }
        else if (element.equals("forgotYourPasswordButton"))
        {
            return pro.getProperty("forgotYourPasswordButton");
        }
        else if (element.equals("confirmationInstructionsButton"))
        {
            return pro.getProperty("confirmationInstructionsButton");
        }
        else
        {
            return pro.getProperty("loginButton");
        }
    }

  /*  public String getWebElement_Login_Switch(String element) {
        String webelement;
        switch (element) {
            case "emailUser":
                webelement = pro.getProperty("emailUser");
                break;
            case "passwordUser":
                webelement = pro.getProperty("passwordUser");
                break;
            case "loginButton":
                webelement = pro.getProperty("loginButton");
                break;
            default:
                throw new IllegalArgumentException("Invalid element : " + webelement);
        }
        return webelement;
    }*/

}
