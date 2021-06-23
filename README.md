# Design Pattern Course Project

- An application has been created that contains certain features of the e-government application.

# Design Patterns Used
## Observer
- In Observer patten, we try to read data from HES service for creation new HES codes. Then, display HES codes at FamilyMember's system, E Nabiz System, or save it on their database. 
- Whenever any data is changed, subject will notify all the observers which are FamilyMember and ENabiz Observer classes.
- There is no inheritance here. In observer pattern, we prefer composition and program to interfaces not implementations.
- we obtain a loosely coupled design here for this pattern. Observers know very few information about subjects. we can say they are independent from each other.

## Singleton
- For this part of the project what database connections and DAO obejcts we  used SINGELTON DESIGN PATTERN. For connect to database we have a DatabaseConnectionClass. In this class we are creating databse connection object.which is a  static object. So we have a static method getDatabaseConnection method for get the instance.
- In UserDao and HESDao class we are usign this static instance. this 2 class is also have static bjects and so getIncstances method for get this static objects.
- In the DatabaseHelper class we are we are usign HESDao and UseDao static objects.This class also have static object and static get instance method.
- For where we need to connect to database we are usign Database helper object.

## Strategy
- Users can log in to the Egovernment application in different ways. In our project, it is possible to log in with an e-signature or standard identification number and password.
- Since the input process is the same but the methods are different, we decided to use the Strategy Design Pattern here. In this way, the user can log in with the method he wants and the program calls the same function according to the method he chooses.

## Decorator
- We have 2 services in our program. With these services, we can create hes code and student certificate.
- Sometimes these created services need to have a validity period. That's why we used Decorator Design Pattern here. According to the user's choice, he can decorate the hes class and produce it together with its validity date.
- At the same time, the same situation applies to the student certificate. According to the user's request, the validity date can be added to the student certificate.



# UML Diagram

![](https://github.com/cskadir/EGovernment/blob/master/E-Government.png)

# Contributors
### Emre KÖRÜS - 16050111041
### Kadir KORKMAZ - 16050111033
### Mehmet Ali CABİOĞLU - 16050111044
