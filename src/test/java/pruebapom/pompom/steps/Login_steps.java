package pruebapom.pompom.steps;

import net.thucydides.core.annotations.Step;
import pruebapom.pompom.pageObjects.Login_pageObject;


public class Login_steps {
	
	
	Login_pageObject login_pageObject;

	@Step
	public void ingreso_a_navegador() {
		login_pageObject.open();
	}
	
	@Step
	public void ingresar_usuario(String usuario) {
		login_pageObject.ingresar_usuario(usuario);

	}
	@Step
	public void ingresar_contrasena(String contrasena) {
		login_pageObject.ingresar_contrasena(contrasena);

	}
	
	@Step
	public void click_en_boton_ingresar() {
		login_pageObject.click_en_boton_ingresar();

	}
	
	@Step
	public void se_valida_el_ingreso_correcto() {
		login_pageObject.se_valida_el_ingreso_correcto();

	}
}
