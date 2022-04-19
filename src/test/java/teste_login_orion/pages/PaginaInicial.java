package teste_login_orion.pages;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicial {

    WebDriver driver;

    String SOLUCOES = "//span[contains(text(),'SOLUÇÕES')]";
    String BOTAOCADASTRO = "//body/app-root[1]/app-main[1]/div[1]/app-topbar[1]/div[1]/ul[1]/li[2]/app-config[1]/p-sidebar[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/img[1]";
    String BOTAOSIC = "//body/app-root[1]/app-main[1]/div[1]/app-topbar[1]/div[1]/ul[1]/li[2]/app-config[1]/p-sidebar[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]";

    public PaginaInicial(WebDriver driverParametro){
        this.driver = driverParametro;
    }
    public void clickSolucoes(){
        driver.findElement(By.xpath(SOLUCOES)).click();
    }
    public void clickCadastro(){
        driver.findElement(By.xpath(BOTAOCADASTRO)).click();
    }
    public void clickSic(){
        driver.findElement(By.xpath(BOTAOSIC)).click();
    }

}

