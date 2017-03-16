# MakeupCalculator

About:
This application asks the user to enter basePrice, numPerson, and numeric material code of a product and then returns total cost of a makeup product. The application runs on the terminal and keeps running unless the user force to exit(^Z). 

Download and Run:
This application has been tested under java version "1.8.0_121".
You should be able to see JUnit test results by running mvn compile on the terminal after you clone the entire repo on your local machine.
You can also download the MakeupCalculator.jar on your local machine and then run it by entering java -jar MakeupCalculator.jar on your terminal. This application does not have GUIs.

Design:
Considering there will be another system to calculate the base price depending on how many products need to be repackaged, Product Class has an instance variable named totalCost which will be helpful.


More info:
This application is an implementation for a code exercise on http://bit.ly/Link-Apprenticeship-Exercise
