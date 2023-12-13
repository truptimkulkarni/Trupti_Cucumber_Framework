Feature:Scientific  Calculator Feature


  Scenario Outline:  Verify all Scientific calculation operation
    Given I am on Scientific calculator page
    When I enter "<number1>" "<operator>" "<number2>"
    Then I see result as "<expectedResult>"
  Examples:

    | number1 | operator | number2 | expectedResult |
    | 2       | +        | 1       | 3              |
    | 3       | –        | 1       | 2              |
    | 4       | ×        | 2       | 8              |
    | 6       | ÷        | 2       | 3              |


