package pruebapom.pompom.definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pruebapom.pompom.steps.Login_steps;

public class Login_definition {
	
	@Steps
	Login_steps login_steps;//instancia del objeto
	
	
	@Given("^Ingreso al navegador$")
	public void ingreso_al_navegador() throws Exception {
		login_steps.ingreso_a_navegador();

	}

	@When("^Ingresar usuario \"([^\"]*)\"$")
	public void ingresar_usuario(String usuario) throws Exception {
		login_steps.ingresar_usuario(usuario);

	}

	@When("^Ingresar contraseña \"([^\"]*)\"$")
	public void ingresar_contraseña(String contrasena) throws Exception {
		login_steps.ingresar_contrasena(contrasena);

	}

	@When("^Click en boton ingresar$")
	public void click_en_boton_ingresar() throws Exception {
		login_steps.click_en_boton_ingresar();

	}

	@Then("^se valida el ingreso correcto$")
	public void se_valida_el_ingreso_correcto() throws Exception {
		login_steps.se_valida_el_ingreso_correcto();

	}


}
