Feature: Search Used Cars For Sale
  As a customer
  I want the ability to search fo used cars for sale
  so that I can know more about the car before buy

  Scenario Outline: Customer can search for used cars on sale

    Given I navigate to motors homepage
    And I click on accept all button
    When I enter "<post code>" in post code text field
    And I select "<Make>" from the Make dropdown
    And I select "<Model>" from the Model dropdown
    And I select "<Min Price>" from the Min Price dropdown
    And I select "<Max Price>" from the Max Price dropdown
    And I click on Search button
    Then A list of cars within that "<post code>" post code is displayed

    Examples:

      |post code |Make         |Model   |Min Price|Max Price|
      |B23 7RX   |Mercedes-Benz|C Class |£2,000   |£5,000   |
   #   |B10 0US   |Audi         |A6 Avant|£1       |£1000,000|
#       |B25 8AT   |Vauxhall     |Corsa   |£2,000   |£75,000   |
   #  |B7 5RL   |Mercedes-Benz|C Class |£2,000   |£5,000   |
##      #|London    |
#      ##|Coventry  |

