Feature: As a potential client i need to open a calculator and do math operations

  @Smoke @Plus
  Scenario: Plus operation
    When Seven Plus Eight
    Then Result is Fifteen

  @Smoke @Substract
  Scenario: Substract operation
    When Nine Minus Five
    Then Result is Four

  @Smoke @Multiply
  Scenario: Multiply operation
    When Seven Times Three
    Then Result is Twenty-one

  @Smoke @Divide
  Scenario: Divide operation
    When Eight Divided by Two
    Then Result is Four