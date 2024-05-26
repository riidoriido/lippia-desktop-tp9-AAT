package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {}

	public static void plus() {
    	ActionManager.click(CalculatorConstants.SEVEN);
    	ActionManager.click(CalculatorConstants.PLUS);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void minus() {
        ActionManager.click(CalculatorConstants.NINE);
        ActionManager.click(CalculatorConstants.MINUS);
        ActionManager.click(CalculatorConstants.FIVE);
        ActionManager.click(CalculatorConstants.EQUAL);
    }
    public static void multiply() {
        ActionManager.click(CalculatorConstants.SEVEN);
        ActionManager.click(CalculatorConstants.MULTIPLY);
        ActionManager.click(CalculatorConstants.THREE);
        ActionManager.click(CalculatorConstants.EQUAL);
    }
    public static void divide() {
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.DIVIDE);
        ActionManager.click(CalculatorConstants.THREE);
        ActionManager.click(CalculatorConstants.EQUAL);
    }


    public static void resultAdd() {
    	Assert.assertEquals(getResult(),"15");
    }
    public static void resultSubstract() {
        Assert.assertEquals(getResult(),"4");
    }
    public static void resultMultiply() {
        Assert.assertEquals(getResult(),"21");
    }
    public static void resultDivide() {
        Assert.assertEquals(getResult(),"2");
    }

    
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("\\D+", "").trim();
    }

}
