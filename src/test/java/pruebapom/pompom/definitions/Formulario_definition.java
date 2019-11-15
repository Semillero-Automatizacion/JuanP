package pruebapom.pompom.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pruebapom.pompom.steps.Formulario_steps;

public class Formulario_definition {
	@Steps
	Formulario_steps logeo;
	
	
	@Given("^Ingresar sesion \"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_sesion(String usuario, String contrasena) throws Exception {
		logeo.iniciar_sesion(usuario, contrasena);
		

	}

	@When("^diligencio formulario \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void diligencio_formulario(String required, String sport, String sport2, String nurl, String contra, String number, String ip, String field, String date1, String date2) throws Exception {
		logeo.lista_de_formularios(required,sport,sport2,nurl,contra,number,ip,field,date1,date2);
		
		

	}

}
