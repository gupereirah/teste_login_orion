package qaacademy_automacao_pom.cenarios;

import java.util.concurrent.TimeUnit;

import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qaacademy_automacao_pom.pages.HomePage;

public class TesteLogin {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://homologa.orionfebrafar.com.br");

    }

    @Test
    public void testePositivoCadastro() {
    //    homePage.clicarCadastrar();
        homePage.preencherEmail();
    //    homePage.preencherNome();
        homePage.preencherSenha();
    //    homePage.preencherConfirmacaoSenha();
    //    homePage.clicarEmCriarComSaldo();
        homePage.clicarAcessar();
    //    Assert.assertTrue(driver.getPageSource().contains("foi criada com sucesso"));

    }

    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}
