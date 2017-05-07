package StepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Selenium\\Copy of Copy of PlantView-1\\src\\test\\resources\\FeatureFiles\\Loga_in1.feature",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {}
		)
public class RunCukesTest{
	
}