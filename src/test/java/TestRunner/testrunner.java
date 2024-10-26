package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "C:\\Users\\hp\\eclipse-workspace\\BDD-Cucumber\\src\\test\\resources\\Features\\FRMlogin.feature",
  glue = {"stepDefinitions"},
  plugin  = {"pretty", "html:target/cucumber-reports.html",
		  "junit:target/Junit-reports/JunitTestReport.xml",
		

			"rerun:target/rerun.txt"},
  monochrome = true,
  dryRun = false
)


public class testrunner {

}
