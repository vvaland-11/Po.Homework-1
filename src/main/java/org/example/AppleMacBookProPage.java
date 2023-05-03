package org.example;

import org.openqa.selenium.By;

public class AppleMacBookProPage extends Utils{
    By _EmailButton=By.className("email-a-friend");
    By _FriendEmailId=By.className("friend-email");
    By _YourEmailId=By.className("your-email");
    By _SendMailButton=By.name("send-email");


    public void EnterEmailDetails(){

        clickOnElement(_EmailButton);
        typeText(_FriendEmailId,"testemail1234+"+timestamp()+"@gmail.com");
        typeText(_YourEmailId,"testemail4321+"+timestamp()+"@gamil.com");
        clickOnElement(_SendMailButton);
    }

}
