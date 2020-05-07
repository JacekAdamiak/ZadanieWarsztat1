Feature: Create new address

  Scenario Outline: user can add new address to addresses list
    Given an open browser with login page
    When user successfully logged in
    Then user goes to view customer account
    And user goes to addresses page
    And user click create new address link
    And user put a alias <alias> in alias input field
    And user put a address <address> in address input field
    And user put a city Wodzisław in city input field
    And user put a zipcode 00-223 in zipcode input field
    And user put a phone 551-223-123 in phone input field
    And user save new address
    And user sees information of new address successfully added


#    When a keyword <keyword> is entered in input field
#    Then the first one should contain <expectedWord>

    And close browser

    Examples:
      | alias         | address     |
      | Biurowy Janka | Przemysłowa |

#    Examples:
#    | keyword | expectedWord |
#    | karol   | karol        |
#    | jacek   | jacek        |