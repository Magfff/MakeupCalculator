# MakeupCalculator

## About

This application asks the user to enter basePrice, numPerson, and numeric material code of a product and then returns total cost of a makeup product. The application runs on the terminal and keeps running unless the user force to exit(^Z). 
This application has been tested under java version "1.8.0_121".

## Download and Run

### Option One:

Clone entire repo into your local machine. Open your terminal, run 

>**mvn compile**

>**mvn package**

>**java -jar target/MakeupCalculator-0.0.1-SNAPSHOT-jar-with-dependencies.jar**

You should be able to see JUnit test results when running *mvn package*.

### Option Two:

Download the MakeupCalculator.jar on your local machine. Open your terminal

>**java -jar MakeupCalculator.jar**

This application does not have GUIs .**It runs on the terminal and keeps running unless the user force to exit(^Z)**.

## Reusability

Considering there will be another system to calculate the base price depending on how many products need to be repackaged, an instance variable named totalCost of Product Class can be passed into the system. 

## Reflection

I was thinking to have two classes, one for Calculator and one for Product. But I have no idea what instance variables should be put into the Calculator Class. Should I pass a Product object into a Calculator to calculate the makeup cost for the product and store the value back to the Product? If a Calculator does have a behavior like that, but still what instance variable should it has.  I cannot come up an idea to that design. 

In my current design, I tend to have only one Class named Product which has behavior to calculate its own makeup cost and store the cost into an instance variable. For the Class Calculator,  it has nothing but a main class for the entire application. 

An enum type is used to implement Material which contains a set of predefined constants. 
I have a little bit problem when converting an Eclipse java project into a Maven project. Eclipse does not do it well for me, so I decided to do it manually. Since at first, I put all files in the same folder, when I move the files into different folders following  Maven's convention,  I forgot to import the package name. 

## More info

This application is an implementation of a coding exercise on http://bit.ly/Link-Apprenticeship-Exercise
