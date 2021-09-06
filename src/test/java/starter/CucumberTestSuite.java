package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","html:target/HtmlReports"},
        monochrome = true,
        features = "src/test/resources/features/login/1_ingresoWeb.feature"

)
public class CucumberTestSuite {}
