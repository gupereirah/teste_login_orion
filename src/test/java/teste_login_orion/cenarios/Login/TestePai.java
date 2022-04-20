package teste_login_orion.cenarios.Login;

import java.util.concurrent.TimeUnit;

import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste_login_orion.pages.PaginaInicialPai;

public class TestePai {
    WebDriver driver;
    PaginaInicialPai paginaInicialPai;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        paginaInicialPai = new PaginaInicialPai(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();//Maximizar Tela
        driver.get("https://paifebrafar.com.br");

    }

    @Test
    public void testePositivoPai()throws InterruptedException {
        String login = "ericnagao";
        String senha = "123456";
        paginaInicialPai.preencherLogin(login);
        paginaInicialPai.preencherSenha(senha);
        Thread.sleep(10000);
        paginaInicialPai.clicarEntrar();
        Thread.sleep(5000);
        //Assert.assertTrue(driver.getPageSource().contains("Seja bem-vindo ao Sistema PAI."));
       }

    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}
