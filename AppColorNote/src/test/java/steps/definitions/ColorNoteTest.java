package steps.definitions;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import app.page.CheckListPage;
import app.page.NotasTextoPage;
import app.page.TelaInicialPage;
 
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ColorNoteTest {

	TelaInicialPage telaInicial = new TelaInicialPage();
	NotasTextoPage texto = new NotasTextoPage();
	CheckListPage checkList = new CheckListPage();
	
	
	@Dado("que eu acesso o aplicativo Notas")
	public void queEuAcessoOAplicativoNotas() throws MalformedURLException, InterruptedException {
		telaInicial.acessarColorNote();

	}

	@Dado("crio uma nota de texto")
	public void crioUmaNotaDeTexto() throws InterruptedException {
		telaInicial.criarNotaTexto();

	}

	@Dado("digito no campo de texto")
	public void digitoNoCampoDeTexto()  {
		texto.escreverTitulo("Titulo");
		texto.escreverTexto("Teste app");
		
	}

	@Dado("clico em salvar")
	public void clicoEmSalvar() throws InterruptedException {
		texto.salvarNota();
	}

	@Entao("o sistema salva a nota")
	public void oSistemaSalvaANota() {
		assertEquals("Titulo", texto.notaSalva());
	}
	
	@Dado("crio um checklist")
	public void crioUmChecklist() throws InterruptedException {
	    telaInicial.criarCheckList();
	 
	}

	@Dado("adiciono o item")
	public void adicionoOItem() throws InterruptedException {
		checkList.tituloDaLista("Lista Titulo");
	    checkList.adcionarItem("item 1");
	    checkList.adcionarItem("item 2");
	    checkList.adcionarItem("item 3");
	 
	}

	@Dado("clico em salvar checklist")
	public void clicoEmSalvarChecklist() {
	    checkList.salvarCheckList();
	 
	}

	@Entao("o sistema salva o checklist")
	public void oSistemaSalvaOChecklist() {
	    assertEquals("Lista Titulo", checkList.listaSalva());
	 
	}

	@Dado("seleciono uma lista")
	public void selecionoUmaLista() {
	   telaInicial.selecionarLista(); 
	   
	}

	@Dado("clico em editar lista")
	public void clicoEmEditarLista() {
	    checkList.editarLista();
	   
	}

	@Dado("Seleciono a cor")
	public void selecionoACor() {
	    checkList.editarCorDaLista();
	    checkList.salvarCheckList();
	   
	}

	@Entao("a cor sera alterada")
	public void aCorSeraAlterada() {
		 assertEquals("Lista Titulo", telaInicial.corAlterada());
	   
	}
	
	@Dado("adiciono um item")
	public void adicionoUmItem() throws InterruptedException {
		checkList.tituloDaLista("Lista Titulo");
	    checkList.adcionarItem("item 1");
	   
	}

	@Dado("clico sobre o item")
	public void clicoSobreOItem() {
	  checkList.itemConcluido();
	   
	}

	@Entao("o item sera concluido")
	public void oItemSeraConcluido() {
		 assertEquals( 1, checkList.checarItensConcluidos());
	   
	}

	@Dado("adiciono um lembrete")
	public void adicionoUmLembrete() throws InterruptedException {
	     checkList.adicionarLembrete();
	     
	}

	@Entao("o lembrete sera adicionado")
	public void oLembreteSeraAdicionado() {
		assertEquals( 1, telaInicial.lembreteDefinido());
	}




}
