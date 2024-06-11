package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartPage extends Utility {

    //* Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
    By verifyTextYouAdded = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public String verifyTextYouAddedToCart(){
        return getTextFromElement(verifyTextYouAdded);
    }
    //* Click on ‘shopping cart’ Link into message
    By clickOnShoppingCartLink = By.linkText("shopping cart");
    public void clickOnShoppingCartLink(){
        clickOnElement(clickOnShoppingCartLink);
    }
    //* Verify the text ‘Shopping Cart.’
    By verifyShoppingCart = By.xpath("//*[@id= maincontent']/div[1]/h1/span");
    public String verifyShoppingCart(){
        return getTextFromElement(verifyShoppingCart);
    }
    //* Verify the product name ‘Cronus Yoga Pant’
    By verifyProductNameCronusYogaPant = By.linkText("Cronus Yoga Pant");
    public String verifyProductNameCronusYogaPant(){
        return getTextFromElement(verifyProductNameCronusYogaPant);
    }
    //* Verify the product size ‘32’
    By verifyProductSize32 = By.xpath("//dd[contains(text(),'32')]");
    public String verifyProductSize32(){
        return getTextFromElement(verifyProductSize32);
    }
    //* Verify the product colour ‘Black’
    By verifyProductColourBlack = By.xpath("//dd[contains(text(),'Black')]");
    public String verifyProductColourBlack(){
        return getTextFromElement(verifyProductColourBlack);
    }
    //* Verify the text‘You added Overnight Duffle to your shopping cart.’
    By verifyTextYoAddedToShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public String verifyTextYoAddedToShoppingCart(){
        return getTextFromElement(verifyTextYoAddedToShoppingCart);
    }
    //* Click on ‘shopping cart’ Link into message

    //* Verify the product name ‘Overnight Duffle’
    By verifyProductNameOvernightDuffle = By.xpath("//td[@class='col item']//div[@class='product-item-details']");
    public String verifyProductNameOvernightDuffle(){
        return getTextFromElement(verifyProductNameOvernightDuffle);
    }
    //* Verify the Qty is ‘3’
    By verifyQty3 = By.xpath("//input[@title='Qty']");
    public String getQty() {
        return driver.findElement(verifyQty3).getAttribute("value");
    }
    //* Verify the product price ‘$135.00’
    By verifyPrice$135 = By.cssSelector("td[class='col subtotal'] span[class='price']");
    public String verifyPrice$135(){
        return getTextFromElement(verifyPrice$135);
    }
    //* Change Qty to ‘5’
    public void clearQty() {
        driver.findElement(By.xpath("//input[@title='Qty']")).clear();
    }
    public void changeQty5(){
        sendTextToElement(By.xpath("//input[@title='Qty']"), "5");
    }
    //* Click on ‘Update Shopping Cart’ button
    By refreshCart = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    public void updateShoppingCart(){
        clickOnElement(refreshCart);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("td[class='col subtotal'] span[class='price']"), "$225.00"));
    }
    //* Verify the product price ‘$225.00’
    By verifyProductPrice = By.cssSelector("td[class='col subtotal'] span[class='price']");
    public String verifyPrice$225(){
        return getTextFromElement(verifyProductPrice);
    }
}
