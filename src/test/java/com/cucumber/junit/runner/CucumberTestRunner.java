package com.cucumber.junit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:cucumber-reports.html",
                "json:cucumber-reports.json",
                "junit:cucumber-reports.xml"},
        monochrome = true,
        tags = "@Smoke",
        glue = "com.cucumber.junit",
        features = "classpath:com.cucumber.junit.features")
public class CucumberTestRunner {

}
