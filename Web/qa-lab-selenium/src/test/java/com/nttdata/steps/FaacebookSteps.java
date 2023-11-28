package com.nttdata.steps;

import com.nttdata.page.FacebookPage;
import com.nttdata.page.FacebookPage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.By;
import static org.junit.Assert.assertNotNull;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class FaacebookSteps {
    private WebDriver driver;

    //constructor
    public FaacebookSteps(WebDriver driver){
        this.driver = driver;
    }

    public  void time (By by){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void butoonIniciarSesion() {
        time(FacebookPage.buttoniniciarSesion);
            WebElement loginButtonElement = driver.findElement(FacebookPage.buttoniniciarSesion);

            loginButtonElement.click();
    }
    public void tyUser(String user) {
        WebElement userInputElement = driver.findElement(FacebookPage.labelUser);
        userInputElement.sendKeys(user);
    }

    public void tyPassword(String password) {
        WebElement userInputElement = driver.findElement(FacebookPage.labelPassword);
        userInputElement.sendKeys(password);
    }

    public void login() {
        try {
            WebElement loginButtonElement = driver.findElement(FacebookPage.buttonSesion);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

            wait.until(ExpectedConditions.elementToBeClickable(loginButtonElement));

            loginButtonElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verificar() {
        WebElement elemento = driver.findElement(FacebookPage.verification);
    }

    public void verificarname(String name) {

        WebElement elemento = driver.findElement(By.xpath("//h2[contains(text(),'Tu Portal de Estudiante, "+name+"')]"));

        assertNotNull("Elemento no encontrado. La prueba ha fallado.", elemento);
    }
}
