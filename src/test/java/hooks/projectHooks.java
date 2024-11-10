package hooks;

import io.cucumber.java.Before;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class projectHooks extends UIInteractions {

    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    private static final Logger logger = LoggerFactory.getLogger(projectHooks.class);

    @Before
    public void setup(){
        logger.info("Setup :: STARTS");
        getDriver().get(EnvironmentSpecificConfiguration.from(variables).getProperty("webdriver.base.url"));
        getDriver().manage().window().maximize();
        logger.info("Setup :: ENDS");
    }
}
