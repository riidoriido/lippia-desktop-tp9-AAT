Feature: As a potential client i need to open a calculator and do math operations

  @Smoke @Plus
  Scenario: Plus operation
    When Seven Plus Eight
    Then Result is Fifteen


