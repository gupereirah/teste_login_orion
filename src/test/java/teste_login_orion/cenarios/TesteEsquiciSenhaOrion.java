package teste_login_orion.cenarios;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste_login_orion.pages.HomePage;

public class TesteEsquiciSenhaOrion {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://homologa.orionfebrafar.com.br");
    }

    @Test
    public void esqueciSenha(){
        String emailSenha = "gustavo@febrafar.com.br";
        homePage.clicarEsqueciSenha();
        homePage.preencherEmailEsqueci(emailSenha);
        homePage.clicarEnviarSenha();
        //Assert.assertTrue(driver.getPageSource().contains("Bem-vindo(a),"));
    }
    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}
