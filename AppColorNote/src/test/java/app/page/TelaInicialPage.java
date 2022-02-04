package app.page;

import java.net.MalformedURLException;

import app.core.BasePage;

public class TelaInicialPage extends BasePage{

	public void acessarColorNote() throws MalformedURLException, InterruptedException {
		acessarAppNotas();
		Thread.sleep(2000);
		clicarBotao("com.android.permissioncontroller:id/permission_allow_button");
		
	}
	public void criarNotaTexto() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab");
		clicarBotaoXpath("//*[@text='Texto']");
	}
	
	public void criarCheckList() throws InterruptedException  {
		Thread.sleep(2000);
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab");
		clicarBotaoXpath("//*[@text='Lista']");
	}
	
	public void selecionarLista() {
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/title");
	}
	
	public void filtrarPorCor(String valor) {
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/main_btn1");
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/count_button");
		selecionarCombo("com.socialnmobile.dictapps.notepad.color.note:id/count", valor);
	}
	
	public String corAlterada() {
		return obterTexto("com.socialnmobile.dictapps.notepad.color.note:id/title");
	}
	
	public int lembreteDefinido() {
		return obterTamanho("com.socialnmobile.dictapps.notepad.color.note:id/type_image");
	}
}
