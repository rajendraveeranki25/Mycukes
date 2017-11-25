package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@LandingPageTile", features = "feature", glue = { "com.cucumber.scripts" }, plugin = {
		"pretty", "html:target/cucumber" })

public class RunCukesTest {

}
