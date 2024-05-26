package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {

    @When("Seven Plus Eight")
    public void plus() {
    	CalculatorService.plus();
    }
    
    @Then("Result is Fifteen")
    public void result() {
    	CalculatorService.resultAdd();
    }

    @When("Nine Minus Five")
    public void nineMinusFive() {
        CalculatorService.minus();
    }

    @Then("Result is Four")
    public void resultIsFour() {
        CalculatorService.resultSubstract();
    }

    @When("Seven Times Three")
    public void sevenTimesThree() {
        CalculatorService.multiply();
    }

    @Then("Result is Twenty-one")
    public void resultIsTwentyOne() {
        CalculatorService.resultMultiply();
    }

    @When("Eight Divided by Two")
    public void eightDividedByThree() {
        CalculatorService.divide();
    }

    @Then("Result is Four")
    public void resultIsTwo() {
        CalculatorService.resultDivide();
    }
}