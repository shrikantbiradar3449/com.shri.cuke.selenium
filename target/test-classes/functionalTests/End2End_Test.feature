Feature: Automated E2E Tests
  Description: To test E2E integration






Scenario Outline: Customer place an order by purchasing an item from search	
	Given user is on Home Page
	When he search for "dress"
	And choose to buy the first item
	And moves to checkout from mini cart
	And enter "<customer>" personal details on checkout page
	And select same delivery address
	And select payment method as "check" payment
	And place the order
	Then verify the order details
Examples:
	|customer|
	|Lakshay|



  #Scenario: Customer place an order by purchasing an item from search
    #Given user is on Home Page
    #When he search for "dress"
    #And choose to buy the first item
    #And moves to checkout from mini cart
    #And enter personal details on checkout page
    #And select same delivery address
    #And select payment method as "check" payment
    #And place the order
