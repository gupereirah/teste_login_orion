package teste_login_orion.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    WebDriver driver;

    String EMAIL = "//input[@id='Username']";
    String SENHA = "//input[@id='Password']";
    String ACESSAR = "//span[contains(text(),'Entrar')]";
    String ESQUECISENHA = "//a[contains(text(),'Esqueceu a senha?')]";
    String ENVIARSENHA = "//span[contains(text(),'Enviar Senha')]";

    public HomePage(WebDriver driverParametro) {
        this.driver = driverParametro;
    }

    public void preencherEmail(String email) {
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);
    }

    public void preencherEmailEsqueci(String emailsenha){
        driver.findElement(By.xpath(EMAIL)).sendKeys(emailsenha);
    }

    public void preencherSenha(String senha) {
        driver.findElement(By.xpath(SENHA)).sendKeys(senha);
    }

    public void clicarAcessar() {
        driver.findElement(By.xpath(ACESSAR)).click();
    }

    public void clicarEsqueciSenha() {
        driver.findElement(By.xpath(ESQUECISENHA)).click();
    }
    
    public void clicarEnviarSenha() {
        driver.findElement(By.xpath(ENVIARSENHA)).click();
    }

    public void validarMsgLogin(String msg){
        Assert.assertTrue(driver.getPageSource().contains(msg));
    }
}
