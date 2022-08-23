package pages;

import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class LoginPage extends BasePage {
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me");
	}

	public void setEmail(String email) {
		escrever("email", email);
	}

	public void setSenha(String senha) {
		escrever("senha", senha);
	}

	public void clickButtonEntrar() {
		clicarBotao(By.xpath("/html/body/div[2]/form/button"));
	}

	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		clickButtonEntrar();
	}
}
