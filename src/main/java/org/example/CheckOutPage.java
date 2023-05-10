package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PrintsPage;
import org.testng.Assert;

public class CheckOutPage extends Utils {
    BuildYourOwnProductPage buildYourOwnProductPage=new BuildYourOwnProductPage();
    private By _CheckoutGuest= By.xpath("//button[contains(@class,'button-1 checkout')]");
    private By _FirstName=By.cssSelector("input#BillingNewAddress_FirstName");
    private By _LastName=By.cssSelector("input#BillingNewAddress_LastName");
    private By _Email=By.cssSelector("input#BillingNewAddress_Email");
    private By _Company=By.id("BillingNewAddress_Company");
    private By _Country=By.cssSelector("select#BillingNewAddress_CountryId");
    private By _City=By.cssSelector("input#BillingNewAddress_City");
    private By _Address1=By.cssSelector("input#BillingNewAddress_Address1");
    private By _Address2=By.cssSelector("input#BillingNewAddress_Address2");
    private By _PostalCode=By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    private By _PhoneNumber=By.cssSelector("input#BillingNewAddress_PhoneNumber");
    private By _FaxNumber=By.cssSelector("input#BillingNewAddress_FaxNumber");
    private By _ClickContinue=By.xpath("//div[@id='billing-buttons-container']/button[4]");
    private By _ShippingMethod=By.xpath("//div[@class='section shipping-method']/ul/li[2]/div[1]");
    private By _ShippingNextButton=By.xpath("//button[contains(@class,' shipping-method-next-step-button')]");
    private By _PaymentMethod=By.cssSelector("input#paymentmethod_1");
    private By _PaymentNextButton=By.xpath("//button[contains(@class,'payment-method-next-step-button')]");
    private By _CreditCardType=By.cssSelector("select#CreditCardType");
    private By _CardHolderName=By.id("CardholderName");
    private By _CardNumber=By.id("CardNumber");
    private By _ExpirationMonth=By.cssSelector("select#ExpireMonth");
    private By _ExpirationYear=By.cssSelector("select#ExpireYear");
    private By _CardCode=By.id("CardCode");
    private By _PaymentDoneContinue=By.xpath("//button[contains(@class,'payment-info-next-step-button')]");
    private By _ConfirmPayment=By.xpath("//button[contains(@class,'confirm-order-next-step-button')]");
   String expectedCheckoutCompletionMessage="Your order has been successfully processed!";






    public void UserCanAbleToCheckOutSuccessfully(){
        buildYourOwnProductPage.customisedItem();
        clickOnElement(_CheckoutGuest);
        typeText(_FirstName,"Test");
        typeText(_LastName,"Last Test");
        typeText(_Email,"TestMail+"+ timestamp()+"@gmail.com");
        typeText(_Company,"TestSuit");
        selectOptionByText(_Country,"United Kingdom");
        typeText(_City,"ABCD");
        typeText(_Address1,"1");
        typeText(_Address2,"XYZ");
        typeText(_PostalCode,"sa1 3os");
        typeText(_PhoneNumber,"1234567890");
        typeText(_FaxNumber,"12345");
        clickOnElement(_ClickContinue);
        clickOnElement(_ShippingMethod);
        clickOnElement(_ShippingNextButton);
        clickOnElement(_PaymentMethod);
        clickOnElement(_PaymentNextButton);
        selectOptionByValue(_CreditCardType,"MasterCard");
        typeText(_CardHolderName,"Test Last Test");
        typeText(_CardNumber,"5272170862266013");
        selectOptionByValue(_ExpirationMonth,"6");
        selectOptionByText(_ExpirationYear,"2028");
        typeText(_CardCode,"787");
        clickOnElement(_PaymentDoneContinue);
        clickOnElement(_ConfirmPayment);
        String actualMessage = getTextFromElement(By.xpath("//div[contains(@class,'checkout-page order-completed')]"));

        System.out.println("My Message:" + actualMessage);
        Assert.assertEquals(actualMessage,expectedCheckoutCompletionMessage,"Thank you\n" +
                "Your order has been successfully processed!\n" +
                "ORDER NUMBER: 1033\n" +
                "Click here for order details.\n" +
                "CONTINUE");

    }












    }



