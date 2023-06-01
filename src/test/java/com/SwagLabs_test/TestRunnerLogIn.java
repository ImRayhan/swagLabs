package com.SwagLabs_test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.SwagLabs_stepdefination",
		monochrome = true,
		tags = "@smoke",
		plugin = {
		"pretty", "html:target//cucumber-reports//cucumber-html-report.html" })
public class TestRunnerLogIn {

}
