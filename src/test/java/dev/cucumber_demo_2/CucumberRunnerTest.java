package dev.cucumber_demo_2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json"},
        features = "classpath:features",
        glue = {"dev.cucumber_demo_2.steps","dev.cucumber_demo_2"})
public class CucumberRunnerTest {


}