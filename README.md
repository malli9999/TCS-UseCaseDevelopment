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
