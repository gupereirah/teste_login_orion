package teste_login_orion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaginaInicialPai{

    WebDriver driver;

    String LOGIN = "//input[@id='Username']";
    String SENHA = "//input[@id='Password']";
    String ENTRAR = "//button[contains(text(),'Entrar')]";

    public PaginaInicialPai(WebDriver driverParametro){
        this.driver = driverParametro;
    }

    public void preencherLogin(String email) {
        driver.findElement(By.xpath(LOGIN)).sendKeys(email);
    }
    public void preencherSenha(String senha) {
        driver.findElement(By.xpath(SENHA)).sendKeys(senha);
    }
    public void clicarEntrar() {
        driver.findElement(By.xpath(ENTRAR)).click();
    }
}