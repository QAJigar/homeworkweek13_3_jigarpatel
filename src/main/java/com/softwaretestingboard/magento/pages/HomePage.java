package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By mouseHoverOnWomenMenu = By.xpath("//span[text()='Women']");
    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(mouseHoverOnWomenMenu);
    }
    By mouseHoverOnTop = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    public void mouseHoverOnTop() {
        mouseHoverToElement(mouseHoverOnTop);
    }
    By clickOnJackets = By.id("ui-id-11");
    public void clickOnJackets() {
        clickOnElement(clickOnJackets);
    }
    By selectByProductName = By.xpath("//*[@id=\"sorter\"]");
    public void setSelectByProductName(){
        mouseHoverToElementAndClick(selectByProductName);
    }
    By mouseHoverOnMenMenu = By.id("ui-id-5");
    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(mouseHoverOnMenMenu);
    }
    By mouseHoverOnBottoms = By.id("ui-id-18");
    public void mouseHoverOnBottoms() {
        mouseHoverToElement(mouseHoverOnBottoms);
    }
    By clickOnPant = By.id("ui-id-23");
    public void clickOnCronusYogaPant() {
        clickOnElement(clickOnPant);
    }
    //* Mouse Hover on Gear Menu
    By mouseHoverOnGearMenu = By.xpath("//span[text()='Gear']");
    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(mouseHoverOnGearMenu);
    }
    //* Click on Bags
    By clickOnBags = By.id("ui-id-25");
    public void clickOnBags(){
        clickOnElement(clickOnBags);
    }

}
