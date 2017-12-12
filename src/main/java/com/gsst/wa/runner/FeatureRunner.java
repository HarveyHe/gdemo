package com.gsst.wa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty","html:target/cucumber","json:target/cucumber.json"}
, features = {"classpath:features/"}
, glue = {"classpath:com.gsst.wa.learning"})
public class FeatureRunner {}
