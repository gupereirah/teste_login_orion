package teste_login_orion.cenarios.Login;

import java.util.concurrent.TimeUnit;

import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste_login_orion.pages.PaginaInicialTrade;

public class TesteTrade {
    WebDriver driver;
    PaginaInicialTrade paginaInicialTrade;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        paginaInicialTrade = new PaginaInicialTrade(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();//Maximizar Tela
        driver.get("https://trademktfebrafar.com.br");

    }

    @Test
    public void testePositivoCadastro()throws InterruptedException {
        String login = "gustavo@febrafar.com.br";
        String senha = "Gustavo.1204";
        paginaInicialTrade.preencherLogin(login);
        paginaInicialTrade.preencherSenha(senha);
        Thread.sleep(10000);
        paginaInicialTrade.clicarEntrar();
        Thread.sleep(5000);
        //Assert.assertTrue(driver.getPageSource().contains("Seja bem-vindo ao Sistema PAI."));
       }

    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}
