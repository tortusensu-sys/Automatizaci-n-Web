package com.nttdata.page;

import org.openqa.selenium.By;

public class HomePage {

    //Localizadores de elementos
    public static By userInput = By.id("user-name");
    public static By passInput = By.id("password");
    public static By loginButton = By.id("login-button");

    public static  By butonCategorias = By.xpath("//a[contains(text(),'Categorías')]");
    public static  By butonCatBelleza = By.xpath("//a[contains(text(),'Belleza y Cuidado personal')]");
    public static  By label = By.xpath("//h3[contains(text(),'CUIDADO DEL CABELLO')]");

}
