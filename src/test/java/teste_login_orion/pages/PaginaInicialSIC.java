package teste_login_orion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicialSIC {
    
    WebDriver driver;

    String PERFIL = "//span[@id='lblPatrocinadorTopo']";
    String PERFILORGANIZACAO = "//input[@id='cboOrganizacao_I']";
    String SELECIONARORG = "//button[@id='btnDefineAcessoOrganizacao']";

public PaginaInicialSIC(WebDriver driverParametro){
    this.driver = driverParametro;
}
public void clickPerfil(){
    driver.findElement(By.xpath(PERFIL)).click();
}
public void clickOrganizacao(){
    driver.findElement(By.xpath(PERFILORGANIZACAO)).click();
}
public void preencherOrganizacao(){
    driver.findElement(By.xpath(PERFILORGANIZACAO)).sendKeys("FEBRAFAR");
}
public void clickAcessarOrg(){
    driver.findElement(By.xpath(SELECIONARORG)).click();
}    
}
