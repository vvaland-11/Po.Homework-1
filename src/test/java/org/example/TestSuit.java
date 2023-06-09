package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

 HomePage homePage=new HomePage();
 RegisterPage registerPage=new RegisterPage();
 RegistrationResult registrationResult= new RegistrationResult();
 CommunityVoteResult communityVoteResult=new CommunityVoteResult();
 AppleMacBookProPage appleMacBookProPage=new AppleMacBookProPage();
 EmailAFriendResult emailFriendResult=new EmailAFriendResult();
 ProductComparisonPage productComparisonPage=new ProductComparisonPage();
 ProductComparisonResult productComparisonResult=new ProductComparisonResult();
 ElectronicsPage electronicsPage=new ElectronicsPage();
 PhotoCameraPage photoCameraPage=new PhotoCameraPage();
 AddToCartPage addToCartPage=new AddToCartPage();
 AddToCartProductResult addToCartProductResult=new AddToCartProductResult();
 LoginPage loginPage=new LoginPage();
 BuildYourOwnProductPage buildYourOwnProductPage=new BuildYourOwnProductPage();
 CheckOutPage checkOutPage=new CheckOutPage();
FaceBookPage faceBookPage=new FaceBookPage();



 @Test

    public void toVerifyUserShouldBeAbleToRegisterSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //Enter Registration details
        registerPage.enterRegistrationDetails();
        registrationResult.RegistrationCompletionMessage();
    }

    @Test
    public void toVerifyUserShouldAbleToVoteToCommunityPole(){
        //click on good button
        homePage.ClickOnGoodOption();
        //click on vote button
        homePage.ClickOnVoteButton();
        communityVoteResult.VoteCompletionMessage();
    }

    @Test
    public void toVerifyUserShouldBeAbleToEmailAFriendSuccessfully(){
        //apple macbook pro product
        homePage.ClickOnAppleMacbookProProduct();
        //click on email button
        appleMacBookProPage.EnterEmailDetails();
        emailFriendResult.EmaailaFriendCompletionMessage();
    }

    @Test
    public void toVerifyUserShouldBeAbleToCompareTheProductSuccessfully(){
      //click on HtcOne android comparison option
        homePage.ClickOnHtcOneAndroid();
        //click on virtual gift card comparison option
        homePage.ClickOnVirtualGiftCard();
        //click on comparison button
        homePage.ClickOnComparisonButton();
        productComparisonPage.ClearedComparisonProduct();
        productComparisonResult.ProductComparisonCompletionMessage();


    }

    @Test
    public void  toVerifyUserShouldBeAblToAddProductToTheAddToCartSuccessfully(){
        //click electronics
        homePage.ClickOnElectronics();
        //click on photo camera products
        electronicsPage.ElectronicsProduct();
        //click on leicaCamera product
        photoCameraPage.AddToCartLeicaCameraProdcut();
        //click on add to cart button
        addToCartPage.LeicaCameraIsInTheCart();
        //add to cart completion message
        addToCartProductResult.AddToCartProductCompletionMessage();
    }

    @Test
    public void toVerifyRegisterUserShouldBeAbleToReferToAFriendSuccessfully(){
        // Open register page and fill all mandatory details in register form
        registerPage.enterRegistrationDetails();
        // Open Login Page and enter the details
        loginPage.LoginDetails();
        appleMacBookProPage.EnterEmailDetails();
        emailFriendResult.RegisteredUserIsAbleToEmailFriendComplete();

    }

    @Test
    public void toVerifyRegisterUserShouldBeAbleToVote(){
        // Open register page and fill all mandatory details in register form
        registerPage.enterRegistrationDetails();
        // Open Login Page
        loginPage.LoginDetails();
        // Choose polling option
        homePage.ClickOnGoodOption();
        homePage.ClickOnVoteButton();
        communityVoteResult.registeredUserOnlyCanVoteSuccessfully();
    }

    @Test
    public void toVerifyPrintoutProductTitle(){
        homePage.PrintoutProductTitle();
    }

    @Test
    public void toVerifyUserCanClickOnSearchButtonAndSeetheErrorMessage(){
        homePage.SearchButton();
    }


    @Test
    public void toVerifyUserShouldAbleToSelectAndVerifyCurrencyAccordingly(){
         homePage.CurrencySelector();
    }


    @Test
    public void toVerifyUserShouldBeAbleToSearchForTheGivenProductSuccessfully(){
        homePage.EnterTextInSearchButton();
    }

    @Test
    public void toVerifyUserShouldBeAbleToEnterCommentsOnNopCommerceNewReleaseSuccessfully(){
       homePage.EnterCommentsOnNopCommerceNewRelease();
    }
    @Test
    public void toVerifyUserShouldBeAbleToCustomiseTheProductAndAddToCartSuccessfully(){
     buildYourOwnProductPage.customisedItem();
    }

    @Test
    public void toVerifyUserShouldBeAbleToCheckOutSuccessfully(){
      checkOutPage.UserCanAbleToCheckOutSuccessfully();

    }

    @Test
    public void toVerifyUserShouldBeAbleToClickOnVoteButtonAndSeeTheErrorMessage(){
     homePage.CommunityPoleVoteButton();

    }
    @Test
    public void toVerifyUSerShouldBeAbleToOPrnTheNewTabSuccessfully(){
      homePage.FaceBookTab();
      faceBookPage.facebook();
    }


}
