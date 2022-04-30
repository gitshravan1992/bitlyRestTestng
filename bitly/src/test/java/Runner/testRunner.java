package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
   //path of feature file
   features = "src/test/java/features/bitlyapi.feature",
   glue = "stepDefination",
   //plugin = { "pretty", "html:target/cucumber-reports" },
   //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports1/report.html"},

   monochrome = true,
	strict = true,
	publish=true
   )
public class testRunner extends AbstractTestNGCucumberTests{
	 

}
