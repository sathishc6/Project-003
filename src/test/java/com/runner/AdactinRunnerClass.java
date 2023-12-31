package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactinbase.AdactinBaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
	   (features = {"src\\test\\java\\com\\feature\\Adactin.feature"},
		glue = "com.steps",
		snippets = SnippetType.CAMELCASE,
		dryRun = !true
		)

public class AdactinRunnerClass {

	public static WebDriver driver;
	
@BeforeClass
	public static void setup() {
		driver = AdactinBaseClass.setUp("webdriver.chrome.driver", 
				"C:\\Users\\skal\\eclipse-workspace\\CucumberProject\\driver\\chromedriver.exe");
	}
	
	
@AfterClass
	public static void quit() {
		
	AdactinBaseClass.quit();

	}
	
	
}
