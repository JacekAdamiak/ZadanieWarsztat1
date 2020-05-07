Feature: Create new address

  Scenario Outline: user can add new address to addresses list
    Given an open browser with login page
    When user successfully logged in
    Then user goes to view customer account
    And user goes to addresses page
    And user click create new address link
    And user put a alias <alias> in alias input field
    And user put a address <address> in address input field
    And user put a city <city> in city input field
    And user put a zipcode <zipcode> in zipcode input field
    And user put a phone <phone> in phone input field
    And user save new address
    And user sees information of new address successfully added


#    When a keyword <keyword> is entered in input field
#    Then the first one should contain <expectedWord>

    And close browser

    Examples:
      | alias         | address     | city      | zipcode | phone       |
      | Biurowy Janka | Przemysłowa | Wodzisław | 00-223  | 551-223-123 |

#    Examples:
#    | keyword | expectedWord |
#    | karol   | karol        |
#    | jacek   | jacek        |