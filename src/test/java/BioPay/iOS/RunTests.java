package BioPay.iOS;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/"},format={

"html:target/cucumber-html-report",

"junit:target/cucumber-junit-report/allcukes.xml"},

tags = {"@Registration"})
public class RunTests {

}
