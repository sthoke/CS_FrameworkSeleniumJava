package Listner;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListnerName implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +"Test Started");
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() +"Test Started Successfully");
	}


		
	}
  

