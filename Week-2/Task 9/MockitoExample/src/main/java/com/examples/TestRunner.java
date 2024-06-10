package com.examples;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

public class TestRunner {
	
	public static void main(String args[]) //throws Exception
	{
		Result res=JUnitCore.runClasses(AddRunner.class);
		for(Failure f:res.getFailures())
		{
			//System.out.println(f);
			System.out.println(f.toString());
		}
		System.out.println(res.wasSuccessful());
	}

}
