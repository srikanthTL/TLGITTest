package week6.day02testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import week6.day2.MyHomePage;

public class TC002_CreateLead_Neg extends Annotations{
	
	@BeforeTest
	public void SetValues() 
	{
		excelFileName="CreateLeadNeg";
		testName="Create Lead";
		testDesc="Lead Creation";
		category="smoke";
		author="Srikanth";
		moduleName="Leads";
	}
	
	@Test(/*groups= {"smoke"},*//*invocationCount=2,*/dataProvider = "fetchData")
	public void CreateLead(String cName, String fName, String lName, String errMsg) throws InterruptedException
	{
		new MyHomePage()
		.Leads()
		.clickLeads()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLeadForFailure()
		//.clickCreateLead()
	//	.verifyfName(fName);
		.verifyErrorMessage(errMsg);
		
	}
	

}
