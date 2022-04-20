package teste_login_orion.cenarios.Login;

import java.util.concurrent.TimeUnit;

import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste_login_orion.pages.HomePage;
import teste_login_orion.pages.PaginaInicial;

public class TesteOrionCadastro {
    WebDriver driver;
    PaginaInicial paginaInicial;
    HomePage homePage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        paginaInicial = new PaginaInicial(driver);
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://orionfebrafar.com.br");

       
    }
    @Test
    public void loginCadastroViaOrion()throws InterruptedException{
        String email = "gustavo@febrafar.com.br";
        String senha = "Gustavo.1204";
        homePage.preencherEmail(email);
        homePage.preencherSenha(senha);
        Thread.sleep(10000);
        homePage.clicarAcessar();
        Thread.sleep(5000);
        paginaInicial.clickSolucoes();
        Thread.sleep(5000);
        paginaInicial.clickCadastro();
        //Object[] janelas = driver.getWindowHandles().toArray(); // Estou mapeando as jenlas que estão abertas
        //driver.switchTo().window(janelas[1].toString());// faz a troca de fato
        //Thread.sleep(10000);
        //System.out.println(driver.getCurrentUrl());
        //Assert.assertTrue(driver.getCurrentUrl().equals("https://cadastrofebrafar.com.br/#/"));
    }
    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(20000);
        driver.quit();

    }


    
}
