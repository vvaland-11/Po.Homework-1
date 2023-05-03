package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.testng.Assert;



public class AddToCartProductResult extends Utils {
    String expectedProductComparisonCompletionMessage="User Can able to Add the product to the shopping cart";


    public void AddToCartProductCompletionMessage(){

        String actualMessage=getTextFromElement(By.className("no-data"));
        System.out.println("My Message: "+ actualMessage);
        Assert.assertEquals(actualMessage,expectedProductComparisonCompletionMessage,"User can not able compare the product successfully successfully");
    }
}
