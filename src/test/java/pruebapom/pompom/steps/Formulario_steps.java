package pruebapom.pompom.steps;

import net.thucydides.core.annotations.Step;
import pruebapom.pompom.pageObjects.Formulario_pageObject;
import pruebapom.pompom.pageObjects.Login_pageObject;

public class Formulario_steps {
	Login_pageObject obj;
	Formulario_pageObject formulario_pageobject;
	
	@Step
	public void iniciar_sesion(String usuario, String contrasena) {
		obj.ingresar_usuario(usuario);
		obj.ingresar_contrasena(contrasena);
		obj.click_en_boton_ingresar();
	}
	
	@Step
	public void lista_de_formularios(String required, String sport, String sport2, String nurl, String contra, String number, String ip, String field,String date1, String date2) throws InterruptedException {
		formulario_pageobject.ing_formulario(required,sport,sport2,nurl,contra,number,ip,field,date1,date2);
		//Thread.sleep(2000);
	}
	}
	
	

