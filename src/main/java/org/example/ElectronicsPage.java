package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{
    By _PhotoCameraProducts=By.xpath("//div[@class='page category-page']/div[2]/div[1]/div/div[1]/div/h2");



    public void ElectronicsProduct(){

        clickOnElement(_PhotoCameraProducts);
    }
}
