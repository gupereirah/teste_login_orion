package teste_login_orion.cenarios.Login;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste_login_orion.pages.HomePage;
import teste_login_orion.pages.PaginaInicial;
import teste_login_orion.pages.PaginaInicialPai;

public class TesteOrionPai {
    WebDriver driver;
    PaginaInicial paginaInicial;
    HomePage homePage;
    PaginaInicialPai paginaInicialPai;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        paginaInicial = new PaginaInicial(driver);
        homePage = new HomePage(driver);
        paginaInicialPai = new PaginaInicialPai(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();//Maximizar Tela
        driver.get("https://orionfebrafar.com.br");

       
    }
    @Test
    public void loginPaiViaOrion()throws InterruptedException{
        String email = "gustavo@febrafar.com.br";
        String senha = "Gustavo.1204";
        homePage.preencherEmail(email);
        homePage.preencherSenha(senha);
        Thread.sleep(10000);
        homePage.clicarAcessar();
        Thread.sleep(5000);
        paginaInicial.clickSolucoes();
        Thread.sleep(5000);
        paginaInicial.clickPai();
        Thread.sleep(5000);
        Object[] janelas = driver.getWindowHandles().toArray(); // Estou mapeando as jenlas que estão abertas
        driver.switchTo().window(janelas[1].toString());// faz a troca de janela
        Thread.sleep(5000);
        paginaInicialPai.preencherLogin("ericnagao");
        paginaInicialPai.preencherSenha("123456");
        Thread.sleep(20000);//Pausa para validar o Captcha
        paginaInicialPai.clicarEntrar();
        Thread.sleep(5000);

    }
    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();

    }


    
}
