package com.qa.testrunner;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/NaveenKhunteta/Documents/workspace/FreeCrmBDDFramework/src/main/java/Features/taggedhooks.feature", //the path of the feature files
		glue={"D:\\eclipse\\runeclipse\\cocumber_ram1\\src\\main\\java\\com\\qa\\stepdefination\\Stepdefination.java"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)

public class Testrunner {

}
