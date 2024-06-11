package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {

    //* Click on Product Name ‘Overnight Duffle’
    By clickOnOvernightDuffle = By.xpath("//a[contains(text(),'Overnight Duffle')]");
    public void clickOnOvernightDuffle(){
        clickOnElement(clickOnOvernightDuffle);
    }
    //* Verify the text ‘Overnight Duffle’
    By verifyTextOvernightDuffle = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    public String verifyTextOvernightDuffle(){
        return getTextFromElement(verifyTextOvernightDuffle);
    }
    //* Change Qty 3
    public void clearQty() {
        driver.findElement(By.id("qty")).clear();
    }
    public void changeQty3(){
        sendTextToElement(By.id("qty"), "3");
    }
    //* Click on ‘Add to Cart’ Button.
    By clickOnAddToCart = By.id("product-addtocart-button");
    public void clickOnAddToCart(){
        clickOnElement(clickOnAddToCart);
    }

}
