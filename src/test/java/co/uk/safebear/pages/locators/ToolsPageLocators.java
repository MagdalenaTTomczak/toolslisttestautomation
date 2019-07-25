package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ToolsPageLocators {

    // messages
    private By successfullLoginMessage = By.xpath(".//body/div[@class='container']/p/b");

    // Locator for the search field
    private By searchFieldLocator = By.id("toolName");

    // Locator for the search button
    private By searchButtonLocator = By.name(".//button[.='Search']");

    // Locator for the name of the tool which is returned - may I use "searchTerm" instead of Selenium ??

    private By returnedToolName = By.xpath(".//tr/td[.='Selenium']");

}
