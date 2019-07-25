package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.LoginPageLocators;
import co.uk.safebear.pages.locators.ToolsPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor

public class ToolsPage {
    ToolsPageLocators locators = new ToolsPageLocators();

    @NonNull
    WebDriver driver;

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String checkForSuccessfulMessage() {
        return driver.findElement(locators.getSuccessfullLoginMessage()).getText();
    }

    // Method to enter text into the Search field
    public void enterSearchTerm(String toolName) {
        driver.findElement(locators.getSearchFieldLocator()).sendKeys(toolName);

    }

    // Method to click on the Search button
    public void clickSearchButton() {
        driver.findElement(locators.getSearchFieldLocator()).click();
    }

    // Method to return the text in the tool name
    public String getNameOfTheTool() {
        return driver.findElement(locators.getReturnedToolName()).getText();


    }

}
