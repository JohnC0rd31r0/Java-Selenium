package testes;

import org.junit.Assert;
import org.junit.Test;

import core.BaseTest;
import pages.ContasPage;
import pages.MenuPage;

public class ContaTeste extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	@Test
	public void testInserirConta() {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("Conta do Teste");
		contasPage.salvar();
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	@Test
	public void testAlterarConta() {
		menuPage.acessarTelaListagemContas();
		contasPage.clicarAlterarConta("Conta do Teste");
		contasPage.setNome("Conta do Teste Edit");
		contasPage.salvar();
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());

	}
}
