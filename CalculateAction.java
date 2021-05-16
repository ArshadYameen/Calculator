package com.zoho.pay.merchantonboarding.framework.action;

import java.util.Map;

import org.json.JSONObject;

public class CalculateAction
{
	private String operation;

	private Long operandA;

	private Long operandB;

	public CalculateAction(String operation, Long A, Long B)
	{
		this.operation = operation;
		this.operandA = A;
		this.operandB = B;
	}

	public Map<String, Object> getResult() throws Exception
	{
		JSONObject result = new JSONObject();

		if(operation == "add")
		{
			result.put("Result", operandA + operandB);
		}

		else if(operation == "subtract")
		{
			result.put("Result", operandA - operandB);
		}
		else
		{
			result.put("Error", "Invalid Operation");
		}
		return (Map<String, Object>) result;
	}
}
