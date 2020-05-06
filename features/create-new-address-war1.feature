Feature: Create new address

  Scenario Outline: user can add new address to addresses list
    Given an open browser with login page
    When user successfully logged in
    Then user goes to view customer account
    And user goes to addresses page
    And user click create new address link



#    When a keyword <keyword> is entered in input field
#    Then the first one should contain <expectedWord>

    And close browser

    Examples:
    | keyword | expectedWord |
    | karol   | karol        |
#    | jacek   | jacek        |