package pruebapom.pompom.pageObjects;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.By;

import com.ibm.icu.impl.Assert;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("https://colorlib.com/polygon/metis/index.html?")
public class Formulario_pageObject extends PageObject{

	String sel_lista="//li[contains(@class,'dropdown')]";
	String sel_valida="//ul[@class='dropdown-menu']//a[contains(text(),'Validation')]";
	String txt_required="//input[@id='req']";
	String sel_sports="//select[@id='sport']";
	String cho_sports="//select[@id='sport2']";
	String txt_url="//input[@id='url1']";
	String txt_email="//input[@id='email1']";
	String txt_contra="//input[@id='pass1']";
	String txt_recontra="//input[@id='pass2']";
	String txt_number="//input[@id='number2']";
	String txt_ip="//input[@id='ip']";
	String txt_date1="//input[@id='date3']";
	String txt_date2="//input[@id='past']";
	String txt_field1="//input[@id='minsize1']";
	String btn_valida="//form[@id='popup-validation']//input[contains(@class,'btn btn-primary')]";
	String pop_error="//div [@class='formErrorContent']";
	
	
	
	public void ing_formulario(String required, String sport, String sport2, String nurl, String contra, String number, String ip,String field, String date1, String date2) throws InterruptedException {
		find(By.xpath(sel_lista)).click();
		find(By.xpath(sel_valida)).click();
		Thread.sleep(1000);
		find(By.xpath(txt_required)).sendKeys(required);
		Thread.sleep(1000);
		find(By.xpath(sel_sports)).selectByVisibleText(sport);
		Thread.sleep(1000);
		find(By.xpath(cho_sports)).selectByVisibleText(sport2);
		Thread.sleep(1000);
		find(By.xpath(txt_url)).sendKeys(nurl);
		Thread.sleep(1000);
		find(By.xpath(txt_email)).sendKeys("correofalso123@gmail.com");
		Thread.sleep(1000);
		find(By.xpath(txt_contra)).sendKeys(contra);
		Thread.sleep(1000);
		find(By.xpath(txt_recontra)).sendKeys(contra);
		Thread.sleep(1000);
		find(By.xpath(txt_number)).clear();
		find(By.xpath(txt_number)).sendKeys(number);
		Thread.sleep(1000);
		find(By.xpath(txt_ip)).sendKeys(ip);
		Thread.sleep(1000);
		find(By.xpath(txt_field1)).clear();
		find(By.xpath(txt_field1)).sendKeys(field);
		Thread.sleep(1000);
		find(By.xpath(txt_date1)).clear();
		find(By.xpath(txt_date1)).sendKeys(date1);
		Thread.sleep(1000);
		find(By.xpath(txt_date2)).clear();
		find(By.xpath(txt_date2)).sendKeys(date2);
		Thread.sleep(1000);
		find(By.xpath(btn_valida)).click();

		
		assertEquals(true, find(By.xpath(pop_error)).isVisible());
		
		//String coleo=Integer.parseInt(Math.random());
		//find(By.xpath(txt_email)).sendKeys();
	}


}
