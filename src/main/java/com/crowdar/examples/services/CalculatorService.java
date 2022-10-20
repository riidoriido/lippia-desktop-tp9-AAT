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
    
    public static void result() {
    	Assert.assertEquals(getResult(),"15");
    }
    
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("\\D+", "").trim();
    }

}
