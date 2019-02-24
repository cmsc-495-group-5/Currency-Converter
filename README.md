# Currency Converter

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
>>* If application does not have internet connection when first opened an error will display informing the user it is unable to update rates do to connection error. “Error no internet connection, unable to update rates”.
>>* If unable to update exchange rates, the application will display an error message. “The data is not updated do to connection error, but used the previous data”.


## Additional Information

> The jaunt.jar file has been added as a maven dependency and therefore you should not have to modify the build configuration.

## Revisions Table
| Revision Number 	|      Date/Time     	|      Name      	|                        Description of Modification                        	|
|:---------------:	|:------------------:	|:--------------:	|:-------------------------------------------------------------------------:	|
|        1        	| 02/20/2019 12:30am 	| Sykes, Zachary 	|                 Conversion Class Label Formatting Changed                 	|
|        2        	| 02/20/2019 12:30am 	| Sykes, Zachary 	|                  Converter Class Label Formatting Changed                 	|
|        3        	| 02/20/2019 12:30am 	| Sykes, Zachary 	|                Databasefetch Class Label Formatting Changed               	|
|        4        	|  02/20/2019 1:30am 	| Sykes, Zachary 	|                     GUI Class Label Formatting Changed                    	|
|        5        	|  02/20/2019 1:30am 	| Sykes, Zachary 	| Added Introduction, Requirements, and Additional Information to README.md 	|
|        6        	|  02/20/2019 1:30am 	| Sykes, Zachary 	|           Minor GUI Class Changes, Changing Header Font in GUI Class       	|
|        7        	|  02/20/2019 1:30am		| Sykes, Zachary		|			Conversion Class Label Formating Changed							|
|        8        	|  02/20/2019 2:30am 	| Sykes, Zachary 	|         Added GUI Initial and GUI After Submit PNG files to GitHub        	|
|        9        	|  02/20/2019 2:30am 	| Sykes, Zachary 	|                       Formatting Update to README.md                      	|
|        10        	|  02/20/2019 2:30am 	| Sykes, Zachary 	|            Formatting Changes to README.md (Issues with GitHub)           	|
|        11       	|  02/20/2019 2:30am 	| Sykes, Zachary 	|            Formatting Changes to README.md (Issues with GitHub)           	|
|        12       	|  02/20/2019 2:30am 	| Sykes, Zachary 	|                        Merge branch 'Sykes-Branch'                        	|
|        13       	|  02/20/2019 2:30am 	| Sykes, Zachary 	|            Formatting Changes to README.md (Issues with GitHub)           	|
|        14       	|  02/20/2019 2:30am 	| Sykes, Zachary 	|         Formatting Changes to README.md (Issues with GitHub Fixed)        	|
|        15       	|  02/20/2019 2:30am 	| Sykes, Zachary 	|     Minor GUI Color Changes to Conversion, Converter, and GUI Classes     	|
|        16       	|  02/20/2019 2:30am 	| Sykes, Zachary 	|                Delete GUI After Submit PNG from GitHub                  	|
|        17       	|  02/20/2019 2:30am 	| Sykes, Zachary 	|            Added GUI After Submit PNG to GitHub (new file)              	|
|        18       	|  02/20/2019 2:30am 	| Sykes, Zachary 	|                        README.md Grammar Check                          	|
|        19       	| 02/20/2019 10:30am 	| Sykes, Zachary 	|     Edited Conversion Class to add.00 to amount if user does not        	|
|        20       	| 02/20/2019 11:30am 	| Sykes, Zachary 	|    Edited Conversion Class, fixed issue with amount and adding .00			|
|        21       	| 02/20/2019 11:30pm 	| Sykes, Zachary 	|           Added REVISIONS.md to GitHub to test Table Layout					|
|        22       	| 02/20/2019 11:30am 	| Sykes, Zachary 	| Removed REVISIONS.md from GitHub, Added Revisions Table to README.md		|
|        23       	| 02/20/2019 20:30pm 	| Sykes, Zachary 	| 			 Added Revisions History to Table in README.md					|
|        24       	| 02/20/2019 20:30pm 	| Sykes, Zachary 	| 				Update to Revision Table in README.md						|
|        25      	| 02/22/2019 15:00pm 	| Sykes, Zachary 	| 					Added Java Files to GitHub								|



# currencyconverter
