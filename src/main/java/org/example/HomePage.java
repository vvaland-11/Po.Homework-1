package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class HomePage extends Utils {
    private By _registerButton = By.className("ico-register");
    private By _CommunityPoll = By.id("pollanswers-2");
    private By _CommunityPollVoteButton = By.id("vote-poll-1");
    private By _EmailAFriend = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]");
    private By _HtcOneAndroid = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[2]");
    private By _VirtualGiftCard = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[4]/div/div[2]/div[3]/div[2]/button[2]");
    private By _ComparisonButton = By.xpath("//div[@id='bar-notification']/div/p/a");
    private By _Electronics = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");
    private By _LogInButton = By.className("ico-login");
    private By _SearchButton = By.xpath("//button[@type='submit']");
    private By _CurrencySelector = By.xpath("//select[contains(@id,'customerCurrency')]");
    private By _SearchBar=By.xpath("//input[@type='text']");
    private By _NopcommerceNewRelease=By.xpath("//div[@class='news-items']/div[2]/div[3]");
    private By _CommentTitle=By.xpath("//input[contains(@class,'enter-comment')]");
    private By _Comments=By.xpath("//textarea[contains(@class,'enter-comment')]");
    private By _NewCommentButton=By.cssSelector("div.buttons");
    private By _FaceBookButton=By.className("facebook");






    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);
    }

    public void ClickOnGoodOption() {
        clickOnElement(_CommunityPoll);
    }

    public void ClickOnVoteButton() {
        clickOnElement(_CommunityPollVoteButton);
    }

    public void ClickOnAppleMacbookProProduct() {
        clickOnElement(_EmailAFriend);

    }

    public void ClickOnHtcOneAndroid() {
        clickOnElement(_HtcOneAndroid);
    }

    public void ClickOnVirtualGiftCard() {
        clickOnElement(_VirtualGiftCard);
    }

    public void ClickOnComparisonButton() {
        clickOnElement(_ComparisonButton);
    }

    public void ClickOnElectronics() {
        clickOnElement(_Electronics);
    }

    public void ClockOnElectronics() {
        clickOnElement(_LogInButton);
    }

    public void PrintoutProductTitle() {
        List<WebElement> productlist = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//h2"));
        for (WebElement element : productlist) {
            System.out.println(element.getText());
        }
    }

    public void SearchButton() {

        clickOnElement(_SearchButton);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please enter some search keyword");
        alert.accept();

    }

    public void CurrencySelector() {
        selectOptionByText(_CurrencySelector, "US Dollar");
        List<WebElement> productcurrencylist = driver.findElements(By.xpath("//div[contains(@class,'prices')]"));
        for (WebElement element : productcurrencylist) {
            System.out.println(element.getText());
        }
    }
    public void EnterTextInSearchButton () {
        typeText(_SearchBar,"Nike");
        clickOnElement(_SearchButton);
        List<WebElement> productlist = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//h2"));
        for (WebElement element : productlist) {
            System.out.println(element.getText());
        }
    }
    public void EnterCommentsOnNopCommerceNewRelease(){
        //click on nopcommerce new release
        clickOnElement(_NopcommerceNewRelease);
        //enter the given details
        typeText(_CommentTitle,"New");
        typeText(_Comments,"My First Comments");
        //click on new comments button
        clickOnElement(_NewCommentButton);
        //get a result text of comment completion message
        String actualMessage = getTextFromElement(By.cssSelector("div.result"));
        System.out.println("My Message:" + actualMessage);
        Assert.assertEquals(actualMessage,"News comment is successfully added.");
        //given comments message
        actualMessage = getTextFromElement(By.xpath("//div[@class='comments']/div[8]/div[2]/div[3]/p"));
        System.out.println("My Message:" + actualMessage);
        Assert.assertEquals(actualMessage,"My First Comments");
    }

    public void CommunityPoleVoteButton(){
        clickOnElement(_CommunityPollVoteButton);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please select an answer");
        alert.accept();
    }
    public void FaceBookTab(){
        String MainWindow = driver.getWindowHandle();
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
    }


    }










