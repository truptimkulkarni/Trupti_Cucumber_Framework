Feature: CalculatorFeature
  As a math enthusiast
  I would like to do basic operations of calculator

  Scenario: Verify addition of two numbers
    Given I am on basic calculator page
    When I enter number "2" "+" "3"
    Then I see the result as "5"

  @smoke
  Scenario: Verify subtraction of two numbers
    Given I am on basic calculator page
    When I enter number "3" "–" "1"
    Then I see result as "2"
  @ui
  Scenario: Verify multiplication of two numbers
    Given I am on basic calculator page
    When I enter number "2" "×" "4"
    Then I see result as "8"

  Scenario Outline: Verify all calculation operation
    Given I am on basic calculator page
    When I enter "<number1>" "<operator>" "<number2>"
    Then I see result as "<expectedResult>"
    Examples:
      | number1 | operator | number2 | expectedResult |
      | 2       | +        | 1       | 3              |
      | 3       | –        | 1       | 2              |
      | 4       | ×        | 2       | 8              |
      | 6       | /        | 2       | 3              |



