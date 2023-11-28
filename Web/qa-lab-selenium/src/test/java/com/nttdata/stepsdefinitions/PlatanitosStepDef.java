package com.nttdata.stepsdefinitions;

import com.nttdata.steps.PlatanitosSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlatanitosStepDef {

    private WebDriver driver;
    private PlatanitosSteps objPlatanitos;
    private Scenario scenario;

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
    @Dado("que me encuentro en la página de Platanitos")
    public void queMeEncuentroEnLaPáginaDePlatanitos() {
        driver.get("https://platanitos.com/");
        screenShot();
    }

    @Y("le doy al boton cuenta")
    public void leDoyAlBotonCuenta() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.butoonCuenta();
        screenShot();
    }

    @Y("inicio sesión con las credenciales usuario: {string} y contraseña: {string} en Platanitos")
    public void inicioSesiónConLasCredencialesUsuarioYContraseñaEnPlatanitos(String arg0, String arg1) {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.tyUser(arg0);
        objPlatanitos.tyPassword(arg1);
        objPlatanitos.login();
        screenShot();
    }

    @Y("verifico que estoy dentro de la cuenta")
    public void verificoQueEstoyDentroDeLaCuenta() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.validar();
        screenShot();
    }

    @Cuando("presiono las ofertas")
    public void presionoLasOfertas() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.ingresarofertas();
        screenShot();
    }

    @Y("seleciono un producto")
    public void selecionoUnProducto() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.seleccionProducto();
        screenShot();
    }

    @Y("agrego al carrito el producto")
    public void agregoAlCarritoElProducto() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.agregarCarrito();
        screenShot();
    }

    @Entonces("doy click al al icono del carrito")
    public void doyClickAlAlIconoDelCarrito() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.irCarrito();
        screenShot();
    }

    @Y("verifico que este mi producto agregado")
    public void verificoQueEsteMiProductoAgregado() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.verificarProduct();
        screenShot();
    }


}
