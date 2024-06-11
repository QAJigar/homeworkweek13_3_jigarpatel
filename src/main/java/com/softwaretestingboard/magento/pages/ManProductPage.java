package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ManProductPage extends Utility {
    //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
    By mouseHoverOnCronusYogaPant = By.xpath("(//div[@class='product-item-info'])[1]");
    public void mouseHoverOnCronusYogaPant(){
        mouseHoverToElement(mouseHoverOnCronusYogaPant);
    }
    By selectOnSize32 = By.id("option-label-size-143-item-175");
    public void selectOnSize32(){
        clickOnElement(selectOnSize32);
    }
    //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
    By selectColourBlack = By.id("option-label-color-93-item-49");
    public void selectColourBlack(){
        clickOnElement(selectColourBlack);}
    //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    public void addToCart(){
        clickOnElement(addToCart);
    }

}
