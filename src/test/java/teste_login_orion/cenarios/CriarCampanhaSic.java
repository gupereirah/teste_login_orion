package teste_login_orion.cenarios;

import java.util.concurrent.TimeUnit;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import teste_login_orion.pages.HomePage;
import teste_login_orion.pages.PaginaInicial;

public class CriarCampanhaSic {
    WebDriver driver;
    PaginaInicial paginaInicial;
    HomePage homePage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        paginaInicial = new PaginaInicial(driver);
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://homologa.orionfebrafar.com.br");

       
    }
    @Test
    public void loginCadastroViaOrion(){
        String email = "gustavo@febrafar.com.br";
        String senha = "Gustavo.1204";
        homePage.preencherEmail(email);
        homePage.preencherSenha(senha);
        homePage.clicarAcessar();
        paginaInicial.clickSolucoes();
        paginaInicial.clickSic();
    
    }


    
}
