package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CommunityVoteResult extends Utils{
    String expectedUserVoteCompletionMessage = "Only registered users can vote.";
    String expectedAbleToVoteSuccessfullMessage="register user should able to vote successfully";


    public void VoteCompletionMessage() {

        String actualMessage = getTextFromElement(By.xpath("//div[@id='block-poll-vote-error-1']"));
        System.out.println("My message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedUserVoteCompletionMessage, "Only registered users can vote.");
    }
    public void registeredUserOnlyCanVoteSuccessfully(){


        String actualMessage = getTextFromElement(By.xpath("//span[@class=\"poll-total-votes\"]"));
        System.out.println("My Message:"+actualMessage);
        // Expected message
        Assert.assertEquals(actualMessage,expectedAbleToVoteSuccessfullMessage, "registerd user not be able to vote successfully");
    }
}
