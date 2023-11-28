package com.nttdata.page;
import org.openqa.selenium.By;
public class PlabtanitosPage {
    public static  By butoonCuenta = By.xpath("//a[@id='IconAccount']");
    public static  By labelUser = By.xpath("//input[@id='email']");
    public static  By labelPassword = By.xpath("//input[@id='password']");
    public static  By buttoniniciarSesion = By.xpath("//button[@id='btn_submit']");
    public static  By verifictSesion = By.xpath("//h1[contains(text(),'Cuenta')]");
    public static  By butoonComida = By.xpath("(//a[@class='top_links_a'])[1]");
    public static  By itemProducto = By.xpath("(//div[@class='base-carousel-section__item text-center']/a[@class='items'])[1]");
    public static  By butoonAgregarCarrito = By.xpath("//button[@id='btn_add_cart_full']");
    public static  By butoonCarrito = By.xpath("//a[@id='IconCar']");
    public static  By vericationCard = By.xpath("//p[contains(text(),'Total')]");
}
