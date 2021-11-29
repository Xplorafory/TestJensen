Feature: LoginFeature
  Check addition in Google calculator

  Scenario Outline: Addition
    Given I open google
    When I enter "<calculation>" in search textbox
    Then I should get result as "<result>"

    Examples:
      | calculation |result|
      | 3+3	     | 6	|
      | 2+5	     | 7	|