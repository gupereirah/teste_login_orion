package teste_login_orion.cenarios.Login;

import java.util.concurrent.TimeUnit;

import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste_login_orion.pages.HomePage;

public class TesteOrionTrade {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();//Maximizar Tela
        driver.get("https://orionfebrafar.com.br");

    }

    @Test
    public void testePositivoCadastro() {
        String email = "gustavo@febrafar.com.br";
        String senha = "Gustavo.1204";
        homePage.preencherEmail(email);
        homePage.preencherSenha(senha);
        homePage.clicarAcessar();
    //    Assert.assertTrue(driver.getPageSource().contains("Bem-vindo(a),"));

    }

    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}
