package org.example;

import org.openqa.selenium.By;

public class ProductComparisonPage extends Utils{

    By _ClearButton=By.className("clear-list");



    public void ClearedComparisonProduct(){
        clickOnElement(_ClearButton);
    }
}


