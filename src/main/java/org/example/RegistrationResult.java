package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResult extends Utils{
    String expectedRegistrationCompletionMessage = "Your registration completed";

    public void RegistrationCompletionMessage(){

        String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));

        System.out.println("My Message:" + actualMessage);
        Assert.assertEquals(actualMessage,expectedRegistrationCompletionMessage,"Registration not completed successfully");

    }
}
