package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data

public class LoginPageLocators {

    //fields
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.name("psw");

    //buttons
    private By loginButtonLocator = By.xpath(".//button[.='Login']");

    //messages
    private By failedLoginMessage = By.xpath(".//p[@id='rejectLogin']/b");


}
