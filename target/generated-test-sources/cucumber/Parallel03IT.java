import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Users/nares/IdeaProjects/arg-pagf-filter-grid-bdd-framwork/src/test/resources/search.feature"},
plugin = {"json:target/cucumber-parallel/3.json"},
monochrome = false,
 tags = {"~@ignored"}, glue = { "com.vedant2.selenium.traning" })
public class Parallel03IT {
}
