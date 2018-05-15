# Dec-Tes
## A repo for Decidim QA. (work in progress)

**Decidim** (https://decidim.org/) is a common's free and open project and infrastructure involving code, documentation, design, training courses, a legal framework, collaborative interfaces, user and facilitation communities, and a common vision. You may find everything related with decidim here:
https://github.com/decidim

This repository holds information about the QA work that I am doing for the **decidim.org** project. This QA work does not substitute in any case the T2T developed by codegram (https://www.codegram.com/), it just complements it.

## My Goal: 
To foster a good, documented, clear and open QA workframe that helps people running dedidim sites to easily implement the QA process. 

## So how does it work? 
You have a decidim site up and running but you want to be sure that everything goes fine even if you change some code. Here you have the requierements file that explains what every part of your site is supossed to do, the Test Cases to be executed for this requierements and XML files ready to be imported to TestLink (http://testlink.org/) to organize all the testing process. Besides, most of the Test Cases have java code if you want to automate the Tests

## Test Plan
The Test Plan provides the master test plan and the strategy for testing of the decidim.org platform. It is used to document all aspects of the testing process and to obtain official input and approvals from the different people and teams involved in the project. 

## Requirements
Theis contains documents related with the requirements of the project. 

The requirements file has an index with links to each requirement. Each requirement has a  description, its status, its relations and the Test Cases created for this requirement as well as other information like coverage, links to the test and code created by codegram in github or other relevant information. Thus you can easily go to a requirement and to know if it has Test Cases and which ones. If you upload the file to Testlink then you can review the requirements access the execution history, remove the Test Case or go to the Test Cases and edit them all from the requieremt.

## Test-Cases
The folder Test-Cases contains an .html document with the Test Cases for the project and an .xml file. The html file has an index with links to each TC. Each TC  has a  description, its execution type, importance and the Requirements that covers as well as other information like keywords. The .xml file allows you to import the Test Cases to Testlink so you can update or modify the project in Testlink.

## Decidim_Automated_Testing
The folder Decidim_Automated_Testing contains the java code created in order to execute the Test Cases tagged as automated and to be used as a regression tool.

## Built With

* [TestLink](http://testlink.org/) - Open Source Test Management
* [Selenium Webdriver](https://www.seleniumhq.org/projects/webdriver/) - Java framework used
* [TestNG](http://testng.org/doc/) - Java framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - Java IDE

## Contributing

## Versioning

## Authors

## License

## Acknowledgments

This is a work in progress
