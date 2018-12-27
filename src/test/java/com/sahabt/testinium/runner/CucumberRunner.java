package com.sahabt.testinium.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features"
        , glue = "com.sahabt.testinium.tests")
public class CucumberRunner {
}


