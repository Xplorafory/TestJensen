package com.it.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.it.steps",
        plugin = {"pretty", "json:target/Cucumber.json",
                "junit:target/Cucumber.xml",
                "html:target/cucumber-reports"},
        monochrome = false)


public class testRunner {

}