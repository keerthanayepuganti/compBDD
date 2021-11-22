package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\keert\\eclipse-workspace\\CucumberCompAssessment\\src\\test\\java\\Features",
		glue="StepDefinations",
		dryRun=false
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	
}
