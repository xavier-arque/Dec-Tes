# Dec-Tes
## A repository for Decidim QA. (work in progress)

**Decidim** (https://decidim.org/) is a common's free and open project and infrastructure involving code, documentation, design, training courses, a legal framework, collaborative interfaces, user and facilitation communities, and a common vision. You may find everything related with decidim here:
https://github.com/decidim

This repository holds information about the QA work that I am doing for the **decidim.org** project. This QA work does not substitute in any case the T2T developed by codegram (https://www.codegram.com/), it just complements it.

## My Goal: 
To foster a good, documented, clear and open QA work-frame that may help people running dedidim sites to easily implement a QA process and to launch regressions 

## So how does it work? 
Let's suppose that you have and scenario like this:
- You have launched a decidim site
- You have up and running a decidim site that you did not install
- You have changed some code from your decidim site
- You want to use a part of decidim that you have never used,

In all this cases and many more you certainly want to be sure that everything runs fine and if not, you want to know what has to be fixed. But a decidim site may be huge and you may not have the knowledge or time to check out that every part of it is doing what it's supposed to do.

So most of the time you just need an Ariadne yarn that goes over the parts that have to be checked and a tool to check them out. That is to say, you need a document that tells you what this parts are supposed to do or hold, what Test Cases you may follow to assert that everything goes as expected and what code you may used to automate the testing of this parts. So you need a guide to:

- Get Informed. 
- Check out. Execute the Test Cases (manual or automated)
- Validate. Does it work fine? 

The requirements file is the document that explains what every part of your site is supposed to do and each requirement is linked to the Test Cases to be executed for this requirements. Thus you have the information and the tools to check out that this part does what its supposed to do. Even if you knew nothing about this part of your decidim site.

Regressions. Sometimes you may want to go all the other way around. You want to validate that after some changes everything works fine. Run the Test Cases and if something goes wrong, get informed about what it doesn't work. 

In those scenarios you need to run the code for all the Test Cases that you have in the [Decidim_Automated_Testing](https://github.com/xavier-arque/Dec-Tes/tree/master/Decidim_Automated_Testing/src/test/java) folder, identify if a Test Case goes red to which requirement it belongs -this information is in the Test-Cases folder-, and get informed about the requirement, looking at the requirements document.

To do all this you have html documents and XML files ready to be imported to TestLink (http://testlink.org/) to organize all the testing process. 

## Test Plan
The Test Plan provides the master test plan and the strategy for testing of the decidim.org platform. It is used to document all aspects of the testing process and to obtain official input and approvals from the different people and teams involved in the project. 

## Requirements
This contains documents related with the requirements of the project. 

The requirements file has an index with links to each requirement. Each requirement has a description, its status, its relations and the Test Cases created for this requirement as well as other information like coverage, links to the test and code created by codegram in github or other relevant information. Thus you can easily go to a requirement and to know if it has Test Cases and which ones. If you upload the file to Testlink then you can review the requirements access the execution history, remove the Test Case or go to the Test Cases and edit them all from the requirement.
New Requirements release here [Decidim’s Functions and Features] https://decidim.org/docs/features-and-roadmap/) - 2018-05-16.
´´´
Barandiaran, X.E. & Romero, C. (2017) Decidim’s Functions and Features. V1.0.  Barcelona City Council and the authors of the text, under a Creative Commons Attribution-ShareAlike 4.0 International (CC BY-SA 4.0) licence and the GNU Free Documentation licence (GFDL)
´´´
## Test-Cases
The folder Test-Cases contains an .html document with the Test Cases for the project and an.xml file. The html file has an index with links to each TC. Each TC has a description, its execution type, importance and the Requirements that covers as well as other information like keywords. The .xml file allows you to import the Test Cases to Testlink so you can update or modify the project in Testlink.

## Decidim_Automated_Testing
The folder Decidim_Automated_Testing contains the java code created in order to execute the Test Cases tagged as automated and to be used as a regression tool.

## Built With

* [TestLink](http://testlink.org/) - Open Source Test Management
* [Selenium Webdriver](https://www.seleniumhq.org/projects/webdriver/) - Java framework used
* [TestNG](http://testng.org/doc/) - Java framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - Java IDE

## Contributing
This is an open project and every contribution is welcome. You can contribute in three different ways:

- Document a requirement. [Here you'll find more information](https://github.com/xavier-arque/Dec-Tes/tree/master/Requierements)
- Edit or create Test Cases. [Here you'll find more information](https://github.com/xavier-arque/Dec-Tes/tree/master/Test-Cases)
- Edit or create java code for the automated Test Cases. [Here you'll find more information](https://github.com/xavier-arque/Dec-Tes/tree/master/Decidim_Automated_Testing)

## Versioning. 
Current version: 1

## Authors

## License
GFDL: GNU Free Documentation Licence
You are permitted to copy, distribute and/or modify this document under the terms of the GNU Free Documentation Licence, version 1.3 or any other version subsequently published by the Free Software Foundation; without Invariant Sections or Front-Cover Texts, or Back-Cover Texts either. You can find a copy of the licence on http://www.gnu.org/copyleft/fdl.html.

## Acknowledgments

This is a work in progress
