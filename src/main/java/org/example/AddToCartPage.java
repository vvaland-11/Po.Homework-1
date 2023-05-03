package org.example;

import org.openqa.selenium.By;

public class AddToCartPage extends Utils {
       By _ProductInTheCart=By.className("cart");


       public void LeicaCameraIsInTheCart(){

           clickOnElement(_ProductInTheCart);
       }

}
