package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResult extends Utils{
    String expectedEmailAFriendCompletionMessage="Only registered customers can use email a friend feature";
    String expectedReferProductMessage="user should be able to send a friend successfully";

    public void EmaailaFriendCompletionMessage(){

        String actualMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        System.out.println("My message:"+ actualMessage);
        Assert.assertEquals(actualMessage,expectedEmailAFriendCompletionMessage,"User can not able to email a friend successfully");
    }

    public void RegisteredUserIsAbleToEmailFriendComplete(){
        String actualMessage = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        System.out.println("My Message:"+actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage,expectedReferProductMessage, "Successfully message send");


    }
}
