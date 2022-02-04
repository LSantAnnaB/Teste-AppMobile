package app.page;

import app.core.BasePage;

public class CheckListPage extends BasePage {
	public void tituloDaLista(String titulo) throws InterruptedException {
		Thread.sleep(2000);
		escrever("com.socialnmobile.dictapps.notepad.color.note:id/edit_title", titulo);
	}

	public void adcionarItem(String texto) {

		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/text");
		escrever("com.socialnmobile.dictapps.notepad.color.note:id/edit", texto);
		clicarBotao("android:id/button1");
		
	}
	
	public void salvarCheckList() {
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/back_btn");
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/back_btn");
	}
	
	public String listaSalva() {
		return obterTexto("com.socialnmobile.dictapps.notepad.color.note:id/title");
	}
	
	public void editarLista() {
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/edit_btn");
		
	}
	public void editarCorDaLista() {
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/color_btn");
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/btn7");
	}
	
	public void itemConcluido() {
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/text");
	}
	
	public int checarItensConcluidos() {
		 return obterTamanho("com.socialnmobile.dictapps.notepad.color.note:id/image");
		 
	}
	
	public void adicionarLembrete() throws InterruptedException {
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/menu_btn");
		Thread.sleep(2000);
		clicarBotaoXpath("//*[@text='Lembrete']");
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/quick_setting_15min");
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/button1");
		Thread.sleep(2000);
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/back_btn");
		
	}
}
