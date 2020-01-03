Feature:User can only login with valid credentials

  Scenario: User should login with valid credentials
    Given User is on the login page
    When Enter credentials
    Then "HomePage" should be displayed

  Scenario Outline: User shouldn't be able to login with credentials  user :"<username>", password: "<password>"
    Given User is on the login page
    When Entered "<username>" "<password>" credentials
    Then "Message" should be displayed
    Examples:
      | username  | password      |
      | WrongUser | password      |
      | userName  | WrongPassword |
      |           | password      |
      | username  |               |
