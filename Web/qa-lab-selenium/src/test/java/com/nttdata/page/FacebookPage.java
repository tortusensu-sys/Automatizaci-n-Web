package com.nttdata.page;
import org.openqa.selenium.By;

public class FacebookPage {
    //Localizadores de elementos
    public static  By labelUser = By.xpath("//input[@id='user[email]']");
    public static  By labelPassword = By.xpath("//input[@id='user[password]']");
    public static By buttonSesion = By.xpath("//button[contains(text(),'Iniciar sesión')]");
    public static  By buttoniniciarSesion = By.xpath("//a[contains(text(),'Iniciar sesión')]");
    public static By verification = By.xpath("//h3[contains(text(),'Mis cursos')]");
}
