package org.example;

import org.openqa.selenium.By;


public class HomePage extends Utils{
    private By _registerButton=By.className("ico-register");
    private By _CommunityPoll=By.id("pollanswers-2");
    private By _CommunityPollVoteButton =By.id("vote-poll-1");
    private By _EmailAFriend= By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]");
    private By _HtcOneAndroid=By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[2]");
    private By _VirtualGiftCard=By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[4]/div/div[2]/div[3]/div[2]/button[2]");
    private By _ComparisonButton=By.xpath("//div[@id='bar-notification']/div/p/a");
    private By _Electronics=By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");
    private By _LogInButton= By.className("ico-login");

    public void clickOnRegisterButton(){
        clickOnElement(_registerButton);
    }
    public void ClickOnGoodOption(){
        clickOnElement(_CommunityPoll);
    }
    public void ClickOnVoteButton(){
        clickOnElement(_CommunityPollVoteButton);
    }
    public void ClickOnAppleMacbookProProduct(){
        clickOnElement(_EmailAFriend);

    }
    public void ClickOnHtcOneAndroid(){
        clickOnElement(_HtcOneAndroid);
    }
    public void ClickOnVirtualGiftCard(){
        clickOnElement(_VirtualGiftCard);
    }
    public void ClickOnComparisonButton(){
        clickOnElement(_ComparisonButton);
    }
    public void ClickOnElectronics(){
        clickOnElement(_Electronics);
    }
    public void ClockOnElectronics(){
        clickOnElement(_LogInButton);
    }


}
