package pruebapom.pompom.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")

public class Login_pageObject extends PageObject {
	
	String txt_usuario="//input[@placeholder='Username']";
	String txt_contrasena="//input[@placeholder='Password']";
	String btn_ingresar="//button[@class='btn btn-lg btn-primary btn-block']";
	String title_ingreso="//h1[@id='bootstrap-admin-template']";
	
	public void ingresar_usuario(String usuario) {
		find(By.xpath(txt_usuario)).sendKeys(usuario);
	}
	
	public void ingresar_contrasena(String contrasena) {
		find(By.xpath(txt_contrasena)).sendKeys(contrasena);
	}
	
	public void click_en_boton_ingresar() {
		find(By.xpath(btn_ingresar)).click();
	}
	
	public void se_valida_el_ingreso_correcto() {
	
	assertEquals("Bootstrap-Admin-Template", find(By.xpath(title_ingreso)).getText());
	}

	
}
