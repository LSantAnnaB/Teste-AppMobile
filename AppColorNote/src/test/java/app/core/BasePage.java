package app.core;

import static app.core.DriverFactory.driver;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
 
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BasePage {
	
	
	/********* TextField e TextArea ************/

	public void escrever(By by, String texto) {
	driver.findElement(by).clear();
	driver.findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}

	public String obterValorCampo(String id_campo) {
		return driver.findElement(By.id(id_campo)).getAttribute("value");
	}

	/********* Botao ************/

	public void clicarBotao(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void clicarBotaoXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
/********* Textos ************/
	
	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}
	
	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}
	
	public String obterTextoXpath(By by) {
		return driver.findElement(by).getText();
	}
	public String obterTextoXpath(String xpath) {
		return obterTexto(By.xpath(xpath));
	}
	
	public int obterTamanho(By by) {
		return driver.findElements(by).size();
	}
	public int obterTamanho(String id) {
		return obterTamanho(By.id(id));
	}
	
	public void selecionarCombo(String id, String valor) {
		MobileElement element = (MobileElement) driver.findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	public void acessarAppNotas() throws MalformedURLException {

		File apk = new File("src/main/resources/ColorNote.apk");
		DesiredCapabilities configuracoes = new DesiredCapabilities();
		configuracoes.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
		configuracoes.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		configuracoes.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

		URL urlConexao = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<>(urlConexao, configuracoes);
		
	}
	
	
}
