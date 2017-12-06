package io.cucumber.samples.dw;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}
@Cucumber.Options(format = {"json:target/cucumber.json"}
, features = {"features/cucumberJava.feature"}
, glue = {"io.cucumber.samples.dw.steps"}) 
public class RunTest {

}
