package com.nttdata.steps;


import com.nttdata.page.PlabtanitosPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlatanitosSteps {
    private WebDriver driver;

    //constructor
    public PlatanitosSteps(WebDriver driver){
        this.driver = driver;
    }


    public  void time (By by){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void butoonCuenta() {
        time(PlabtanitosPage.butoonCuenta);
        WebElement loginButtonElement = driver.findElement(PlabtanitosPage.butoonCuenta);

        loginButtonElement.click();
    }

    public void tyUser(String user) {
        WebElement userInputElement = driver.findElement(PlabtanitosPage.labelUser);
        userInputElement.sendKeys(user);
    }

    public void tyPassword(String password) {
        WebElement userInputElement = driver.findElement(PlabtanitosPage.labelPassword);
        userInputElement.sendKeys(password);
    }

    public void login() {
        try {
            WebElement loginButtonElement = driver.findElement(PlabtanitosPage.buttoniniciarSesion);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
            wait.until(ExpectedConditions.elementToBeClickable(loginButtonElement));

            loginButtonElement.click();
        } catch (TimeoutException e) {
            throw new RuntimeException("El botón de inicio de sesión no fue clickeable después de esperar.", e);
        }
    }

    public void validar() {
        time(PlabtanitosPage.verifictSesion);
        WebElement elemento = driver.findElement(PlabtanitosPage.verifictSesion);
    }

    /*public void ingresarComida() {
        time(PlabtanitosPage.butoonComida);
        WebElement comidaButtonElement = driver.findElement(PlabtanitosPage.butoonComida);

        comidaButtonElement.click();

    }*/
    public void ingresarofertas() {
        time(PlabtanitosPage.buttoonOfertas);
        WebElement ofertasButtonElement = driver.findElement(PlabtanitosPage.buttoonOfertas);

        ofertasButtonElement.click();
    }

    public void seleccionProducto() {
        time(PlabtanitosPage.itemProducto);
        WebElement itemButtonElement = driver.findElement(PlabtanitosPage.itemProducto);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", itemButtonElement);
    }

    public void agregarCarrito() {
        time(PlabtanitosPage.butoonAgregarCarrito);
        WebElement agregarButtonElement = driver.findElement(PlabtanitosPage.butoonAgregarCarrito);

        agregarButtonElement.click();
    }

    public void irCarrito() {
        time(PlabtanitosPage.butoonCarrito);
        WebElement carritoButtonElement = driver.findElement(PlabtanitosPage.butoonCarrito);

        carritoButtonElement.click();
    }

    public void verificarProduct() {
        time(PlabtanitosPage.vericationCard);
        WebElement elemento = driver.findElement(PlabtanitosPage.vericationCard);
    }


}
