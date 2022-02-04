package app.page;

import app.core.BasePage;

public class NotasTextoPage extends BasePage {
	
	public void escreverTexto(String texto) {
		escrever("com.socialnmobile.dictapps.notepad.color.note:id/edit_note", texto);
	}
	
	public void escreverTitulo(String texto) {
		escrever("com.socialnmobile.dictapps.notepad.color.note:id/edit_title", texto);
	}
	 
	public void salvarNota() throws InterruptedException {
		Thread.sleep(2000);
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/back_btn");
		clicarBotao("com.socialnmobile.dictapps.notepad.color.note:id/back_btn");
	}
	public String notaSalva() {
		return obterTexto("com.socialnmobile.dictapps.notepad.color.note:id/title");
	}
}
