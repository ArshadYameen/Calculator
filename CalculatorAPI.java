package com.zoho.pay.merchantonboarding.framework.api;

import java.util.Map;

import com.zoho.pay.merchantonboarding.framework.action.CalculateAction;

public class CalculatorAPI
{
	public static Map<String, Object> calculator(String operation, Long first, Long second) throws Exception
	{
		CalculateAction calculateAction = new CalculateAction(operation, first, second);
		return calculateAction.getResult();
	}
}