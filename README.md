#Country Currency Converter Application

## Introduction

> We are designing an application (GIU) that takes a certain amount of one country’s currency and display the exchanged amount in another country’s currency in real time.


## Project Requirements

>The following is analysis of a currency exchange application. The objective is for a user to be able to select a given currency and the system to be able to fetch the real time conversion rate from a database and display it to the user. Below are the detailed requirement that the system should achieve:

>>* The application will allow the user to select a country type listed (US Dollars, Euro, Indian Rupee, Australian Dollar, Canadian Dollar, Singapore Dollar, Japanese Yen, Chinese Yuan Renminbi, South African Rand, Brazilian Real) for currency getting exchanged from using a drop down list.
>>* The application will allow the user to select a country type listed (US Dollars, Euro, Indian Rupee, Australian Dollar, Canadian Dollar, Singapore Dollar, Japanese Yen, Chinese Yuan Renminbi, South African Rand, Brazilian Real) for currency getting exchanged to using a drop down list.
>>* The application will allow user to enter the amount of currency they want to exchange.
>>* The application will have a submit button to allow the exchange to happen.
>>* The application will calculate the exchanged currency using the database. 
>>* The database gets the real time information from the rate website https://www.x-rates.com/ (rates come from each individual country for instance https://www.x-rates.com/table/?from=USD&amount=1 ).
>>* The database updates every minute, including after a conversion.
>>* The application displays the amount of exchanged currency rounded to the nearest cent (ex. $1.81)., along with the exchange rate used.
>>* The application will allow the user to type a new amount or change the country and will display the new exchanged currency.
Error will appear if the entered amount of currency is not a positive number i.e., letters, negative numbers, etc.
>>* The application will only allow amount entered to the hundredth decimal. If no decimal is used,“.00” is automatically added.
>>* The application will list the time of the last database update after conversion.
>>* If application does not have Internet connection when first opened an error will display informing the user it is unable to update rates do to connection error. “Error no Internet connection, unable to update rates”.
>>* If unable to update exchange rates, the application will display an error message. “The data is not updated do to connection error, but used the previous data”.
>>* The header text “CURRENCY CONVERTER” color changes after every database real time update


## Additional Information

>>* The jaunt.jar file has to be added in the build configuration to run in IDE
>>* Executables for both Windows and Mac added
>>* Runnable JAR file added
