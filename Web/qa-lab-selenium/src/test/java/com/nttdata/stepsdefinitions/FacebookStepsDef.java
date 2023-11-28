package com.nttdata.stepsdefinitions;

import com.nttdata.steps.FaacebookSteps;
import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookStepsDef {

    private WebDriver driver;
    private FaacebookSteps objFacebook;
    private Scenario scenario;
    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }
/*
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

    @Dado("que me encuentro en la pagina login de facebook")
    public void queMeEncuentroEnLaPaginaLoginDeFacebook() {
        driver.get("https://cursos.devtalles.com/");
        screenShot();
    }
    */
    @Y("presiono el boton iniciar sesión")
    public void presionoElBotonIniciarSesión() {
        objFacebook = new FaacebookSteps(driver);
        objFacebook.butoonIniciarSesion();
    }

    @Cuando("inicio sesión con las credenciales {string} y contraseña {string}")
    public void inicioSesiónConLasCredencialesYContraseña(String arg0, String arg1) {
        objFacebook = new FaacebookSteps(driver);
        objFacebook.tyUser(arg0);
        objFacebook.tyPassword(arg1);
        objFacebook.login();
    }

    @Entonces("valido qie deberia aparecer un apartad de {string}")
    public void validoQieDeberiaAparecerUnApartadDe(String arg0) {

    }


    @Entonces("valido que deberia estar dentro de la pagina")
    public void validoQueDeberiaEstarDentroDeLaPagina() {
        objFacebook = new FaacebookSteps(driver);
        objFacebook.verificar();
    }

    @Y("verificar que de la bienvenida al usuario {string}")
    public void verificarQueDeLaBienvenidaAlUsuario(String arg0) {
        objFacebook = new FaacebookSteps(driver);
        objFacebook.verificarname(arg0);

    }
}
