#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Create outbound order

  @sanity
  Scenario Outline: Create an outbound order in QA Envivronment
    Given User login into qa ssense home page "<url>"
    And select any product category
    When User add products to cart
    And User enters all shipping details "<firstname>" "<lastname>" "<address>" "<city>" "<postcode>" "<phonenumber>"
    And User enter payment details "<cardnumber>" "<expdate>" "<cardname>" "<CVC>"
    Then user vallidate customer created with ref number

    Examples: 
      |url| firstname   | lastname | address            | city  | postcode | phonenumber | cardnumber 		 | expdate | cardname 		 | CVC |
      |https://qa.ssense.com/en-ca | Kirupakaran | P        | 2/194,sullipalayam | Erode |   638057 |  9750509191 |5555555555554444 | 0225		 | KIRUPAKARAN P | 456 |
      #|https://qa.ssense.com/en-ca | Eniya       | K        | 2/194,maganakiumiy | Erode |   638052 |  9750509192 |5555555555554444 | 0225		 | KIRUPAKARAN P | 456 |
  #  Examples:
  #    | name  | value | status  |
  #    | name1 |     5 | success |
  #    | name2 |     7 | Fail    |
