package teste_login_orion.cenarios.Login;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste_login_orion.pages.HomePage;
import teste_login_orion.pages.PaginaInicial;
import teste_login_orion.pages.PaginaInicialSIC;

public class TesteOrionSIC {
    WebDriver driver;
    PaginaInicial paginaInicial;
    HomePage homePage;
    PaginaInicialSIC paginaInicialSIC;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        paginaInicial = new PaginaInicial(driver);
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();//Maximizar Tela
        driver.get("https://orionfebrafar.com.br");

       
    }
    @Test
    public void loginSicViaOrion()throws InterruptedException{
        String email = "gustavo@febrafar.com.br";
        String senha = "Gustavo.1204";
        homePage.preencherEmail(email);
        homePage.preencherSenha(senha);
        Thread.sleep(10000);
        homePage.clicarAcessar();
        Thread.sleep(5000);//ESPERA 5 SEGUNDOS
        paginaInicial.clickSolucoes();
        Thread.sleep(5000);//ESPERA 3 SEGUNDOS
        paginaInicial.clickSic();
        Thread.sleep(5000);//ESPERA 5 SEGUNDOS

    //    System.out.println(driver.getCurrentUrl());
    //    Object[] janelas = driver.getWindowHandles().toArray();
    //    driver.switchTo().window(janelas[1].toString());
    //    System.out.println(driver.getCurrentUrl());
    //    Object[] janelas = driver.getWindowHandles().toArray(); // Estou mapeando as jenlas que estão abertas
    //    driver.switchTo().window(janelas[1].toString());// faz a troca de fato
       
    //    Object[] janelas = driver.get
    //    paginaInicialSIC.clickPerfil();
    //    paginaInicialSIC.clickOrganizacao();
    //    paginaInicialSIC.preencherOrganizacao();
    //    paginaInicialSIC.clickAcessarOrg();
    //    System.out.println(driver.getCurrentUrl());
    //    Assert.assertTrue(driver.getCurrentUrl().equals("http://sicfebrafar.com.br/DashboardFebrafar.aspx"));
    }
    @After
    public void finalizar() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();

    }


    
}
