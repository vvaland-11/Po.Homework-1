package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{
    By _Email=By.id("Email");
    By _Password=By.id("Password");
    By _LoginButton=By.xpath("//div[@class=\"buttons\"]//button[@class=\"button-1 login-button\"]");

    public void LoginDetails(){
        typeText(_Email,"TestMail1234@gmail.com");
        typeText(_Password,"Test1234");
        clickOnElement(_LoginButton);
    }

}
