# Decidim_Automated_Testing

The folder **Decidim_Automated_Testing** contains the java code created in order to execute the Test Cases tagged as automated and to be used as a regression tool.

Decidim is a very modular project and it may change a lot from one installation to another so in order to easy the maintenance and the customization there is a config file with all the key=values pairs and a configReader class to load the values.

Each page must have its own class and there is a test folder an a BaseClass for all the tests.
So anybody can use the BaseClass and the config.property file to create new classes for different pages and Test Cases for those pages.


## Built With

* [TestLink](http://testlink.org/) - Open Source Test Management
* [Selenium Webdriver](https://www.seleniumhq.org/projects/webdriver/) - Java framework used
* [TestNG](http://testng.org/doc/) - Java framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - Java IDE

## This is a work in progress
