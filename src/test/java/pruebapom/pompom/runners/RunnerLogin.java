package pruebapom.pompom.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features="src/test/resources/features/llenarFormulario.feature",glue= {"pruebapom.pompom"})

public class RunnerLogin {
	

	
}
