# TCS-UseCaseDevelopment
## Description
##### In this Use we have three spring boot Application 
1. The First Application is for User Login.
2. The Second Applicationis for Account Inforamtion.
3. The Third Application is for Logoff.

## User Login Apllication
* The user can log in to the Application with the userName and Password.</br>
* The Log in details are validated against details stored in the Database.</br>
* If the user details are corect the user can successfully log in to the system.</br>
* If the user details are incorrect, the user will get an Error Page.</br>
* Whenever the user Login into the application, A session is generated is generated for that user.</br>
* The session ID remains until the user logout from the system or any failue in the system.
![](Images/Login.png)
![](Images/SessionID.png)

## Account Inforamtion
* Once the user successfully loged in into the system.
* we can retrive the Account Information of the user with the use name and session ID generated during the log in.
![](Images/AccountInfo.png)

## Transaction Information
* We can retrive the User Transaction details with sssion ID and Account Number.
![](Images/Transactions.png)

## Rewards Information
* We can retrive the Rewards for particular  user based on the Username.
![](Images/Rewards.png)

## Logoff
* The user can Logout from the System with the session ID and update the session Status to Inactive.
* If the session is not active, will get an error message stating invalid SessionID.
![](Images/LogOff.png)

## Eureka
* We will register all three application in the Eureka
![](Images/Eureka.png)


-------------------------------------
### Instruction to Run the Application
1. Firstly, Download the repository, by cloning or by downlading the zip file.
2. Import the project into you'r workspace by selecting importing existing maven project.
3. Firstly, Run the Discover Application as every other application has registered with Eureka.
4. Secondly, Run the Demo-Account-Information Application, Followed by Demo-Login and Demo-Logoff.
5. Initially, we populated the database with users as follows:

userName          |  Password
-------------     |  -------------
malli@gmail.com   | arjun
arjun @gmail.com  | malli


6. For interacting with Api we can use the Postman application as in Screenshots above.
