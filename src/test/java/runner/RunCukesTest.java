package runner;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:features"},
		//		plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","html:target/site/cucumber-pretty"},
		//		plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
		//		plugin = {"html:target/site/cucumber-pretty","json:target/cucumber.json"},
		plugin = {"pretty","json:target/cucumber.json","html:target/cucumber-reports", "summary"},
		//		tags = {"@currentTest,@ReportSanity"},
//				tags = {"@viewDealsForResort"},
		tags = {"@requirement2"},
		glue={"helpers","stepDefinitions"},
//				dryRun = true,
		monochrome = true //if you want console output from Cucumber in a readable format, you can specify it like this, 
		)

public class RunCukesTest
{
	

}