# Decidim_Automated_Testing

The folder **Decidim_Automated_Testing** contains the java code created in order to execute the Test Cases tagged as automated and to be used as a regression tool.

Decidim is a very modular project and it may change a lot from one installation to another so in order to easy the maintenance and the customization there is a config file with all the key=values pairs and a configReader class and an excel file and an ExcelReader class to load the values.

## How does it work.
There is a package with all the pages. Each decidim page has its own class.There are different folders for the related Pages so for instance, all the account related pages are inside the account folder.
Another package contains the Test Cases. There are different folders for the related Test Cases so for instance, all the login related Test Cases are inside the Login folder.

A third package contains common tools lie the BaseClass, the configReader and the ExcelReader
So anybody can use the BaseClass and the config.property file to create new classes for different pages and Test Cases for those pages.

## Contributing
This is an open project and every contribution is welcome. You may create, modify or extend any page class or create new Test Cases for the class pages.

## Built With

* [TestLink](http://testlink.org/) - Open Source Test Management
* [Selenium Webdriver](https://www.seleniumhq.org/projects/webdriver/) - Java framework used
* [TestNG](http://testng.org/doc/) - Java framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - Java IDE

## This is a work in progress
