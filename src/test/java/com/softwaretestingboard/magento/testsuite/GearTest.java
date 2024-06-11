package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    //userShouldAddProductSuccessFullyTo
    public void userShouldAddProductSuccessFullyToShoppinCart() {
    //*1 Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearMenu();
    //*2 Click on Bags
        homePage.clickOnBags();
    //*3 Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffle();
    //*4 Verify the text ‘Overnight Duffle’
        Assert.assertEquals(gearPage.verifyTextOvernightDuffle(),"Overnight Duffle","Text not found");
    //*5 Change Qty 3
        gearPage.clearQty();
        gearPage.changeQty3();
    //*6 Click on ‘Add to Cart’ Button.
        gearPage.clickOnAddToCart();
    //*6 Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(shoppingCartPage.verifyTextYouAddedToCart(),"You added Overnight Duffle to your shopping cart.","Text not found");
    //*7 Click on ‘shopping cart’ Link into message
        shoppingCartPage.clickOnShoppingCartLink();
    //*8 Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(shoppingCartPage.verifyProductNameOvernightDuffle(),"Overnight Duffle","Text not found");
    //*9 Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCartPage.getQty(),"3","Qty not match");
    //*10 Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCartPage.verifyPrice$135(),"$135.00","Text not match");
    //*11 Change Qty to ‘5’
        shoppingCartPage.clearQty();
        shoppingCartPage.changeQty5();
    //*12 Click on ‘Update Shopping Cart’ button
        shoppingCartPage.updateShoppingCart();
    //*13 Verify the product price ‘$225.00’
        shoppingCartPage.verifyPrice$225();
}
}
