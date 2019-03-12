import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Users/nares/IdeaProjects/arg-pagf-filter-grid-bdd-framwork/src/test/resources/basket.feature"},
plugin = {"json:target/cucumber-parallel/1.json"},
monochrome = false,
 tags = {"~@ignored"}, glue = { "com.vedant2.selenium.traning" })
public class Parallel01IT {
}
