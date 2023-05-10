package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    By _firstname= By.id("FirstName");
    By _Lastname = By.id("LastName");
    By _DayOfBirth=By.name("DateOfBirthDay");
    By _MonthOfBirth=By.name("DateOfBirthMonth");
    By _YearOfBirth=By.name("DateOfBirthYear");
    By _Email = By.name("Email");
    By _Password = By.id("Password");
    By _reenterPassword = By.id("ConfirmPassword");
    By _RegisterButton =(By.id("register-button"));


    public void enterRegistrationDetails(){
        typeText(_firstname,"TestfirstName");
        //type LastName
        typeText(_Lastname,"TestLastName");
        //enter date of birth
        selectOptionByValue(_DayOfBirth,"11");
        selectOptionByIndex(_MonthOfBirth,7);
        selectOptionByText(_YearOfBirth,"1996");
        //type email id
        typeText(_Email,"TestMail+"+ timestamp()+"@gmail.com");
        //type password
        typeText(_Password,"Test1234");
        //re-enter password
        typeText(_reenterPassword,"Test1234");
        clickOnElement(_RegisterButton);

    }

}


