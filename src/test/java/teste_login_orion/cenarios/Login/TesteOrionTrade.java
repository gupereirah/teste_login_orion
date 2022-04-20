package teste_login_orion.cenarios.Login;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste_login_orion.pages.HomePage;
import teste_login_orion.pages.PaginaInicial;
import teste_login_orion.pages.PaginaInicialTrade;

public class TesteOrionTrade {
    WebDriver driver;
    PaginaInicial paginaInicial;
    HomePage homePage;
    PaginaInicialTrade paginaInicialTrade;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        paginaInicial = new PaginaInicial(driver);
        homePage = new HomePage(driver);
        paginaInicialTrade = new PaginaInicialTrade(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();//Maximizar Tela
        driver.get("https://orionfebrafar.com.br");

       
    }
    @Test
    public void loginTradeViaOrion()throws InterruptedException{
        String email = "gustavo@febrafar.com.br";
        String senha = "Gustavo.1204";
        homePage.preencherEmail(email);
        homePage.preencherSenha(senha);
        Thread.sleep(10000);
        homePage.clicarAcessar();
        Thread.sleep(5000);
        paginaInicial.clickSolucoes();
        Thread.sleep(5000);
        paginaInicial.clickTrade();
        Thread.sleep(5000);
        Object[] janelas = driver.getWindowHandles().toArray(); // Estou mapeando as jenlas que estão abertas
        driver.switchTo().window(janelas[1].toString());// faz a troca de fato
        Thread.sleep(5000);
        paginaInicialTrade.preencherLogin(email);
        paginaInicialTrade.preencherSenha(senha);
        Thread.sleep(10000);//Pausa para validar o Captcha
        paginaInicialTrade.clicarEntrar();
        Thread.sleep(5000);

    }
    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();

    }


    
}
