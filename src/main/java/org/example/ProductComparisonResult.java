package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductComparisonResult extends Utils{

    String expectedProductComparisonCompletionMessage="user can able to compare the product successfully";

    public void ProductComparisonCompletionMessage(){

        String actualMessage=getTextFromElement(By.className("no-data"));
        System.out.println("My Message: "+ actualMessage);
        Assert.assertEquals(actualMessage,expectedProductComparisonCompletionMessage,"User can  able compare the product successfully successfully");


    }
}
