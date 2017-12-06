package io.cucumber.samples.dw;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"}
, features = {"features/cucumberJava.feature"}
, glue = {"io.cucumber.samples.dw.steps"}) 
public class RunTest {

}
