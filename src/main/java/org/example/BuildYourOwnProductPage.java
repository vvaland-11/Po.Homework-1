package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class BuildYourOwnProductPage extends Utils{
    private By _ClickOnProduct=By.xpath("//div[contains(@class,'product-grid')]/div[2]/div[1]");
    private By _Processor=By.name("product_attribute_1");
    private By _Ram=By.name("product_attribute_2");
    private By _HDD=By.id("product_attribute_3_6");
    private By _OS=By.id("product_attribute_4_9");
    private By _Microsoft=By.xpath("//label[@for='product_attribute_5_10']");
    private By _AcrobatReader=By.cssSelector("input#product_attribute_5_11");
    private By _TotalCommander=By.cssSelector("input#product_attribute_5_12");
    private By _AddToCartButton=By.cssSelector("button#add-to-cart-button-1");
    private By _ShoppingCart=By.xpath("//div[contains(@id,'bar')]//a");
    private By _ClickOnTermAndCondition=By.cssSelector("input#termsofservice");
    private By _ClickOnCheckOut=By.cssSelector("button#checkout");
//    private By _CheckoutGuest= By.xpath("//button[contains(@class,'button-1 checkout')]");




    public void customisedItem(){
        clickOnElement(_ClickOnProduct);
        selectOptionByValue(_Processor,"1");
        selectOptionByIndex(_Ram,3);
        clickOnElement(_HDD);
        clickOnElement(_OS);
        clickOnElement(_Microsoft);
        clickOnElement(_AcrobatReader);
        clickOnElement(_TotalCommander);
        clickOnElement(_AddToCartButton);
        clickOnElement(_ShoppingCart);
//         String actualMessage = getTextFromElement(By.cssSelector("div.order-summary-content"));
//        System.out.println("My Message:" + actualMessage);
//        Assert.assertEquals(actualMessage,"Product is in AddToCart Successfully");
        clickOnElement(_ClickOnTermAndCondition);
        clickOnElement(_ClickOnCheckOut);
//        clickOnElement(_CheckoutGuest);


        }



    }


