package org.example;

import org.openqa.selenium.By;

public class PhotoCameraPage extends Utils{

    By _AddToCartLeicaCamera=By.xpath("//div[@class='products-wrapper']/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]");
    By _ClickOnAddToCartButton=By.className("cart-label");

    public void AddToCartLeicaCameraProdcut(){

        clickOnElement(_AddToCartLeicaCamera);
        clickOnElement(_ClickOnAddToCartButton);
    }
}
