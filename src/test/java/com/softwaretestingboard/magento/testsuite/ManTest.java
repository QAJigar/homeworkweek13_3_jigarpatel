package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ManProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTest extends BaseTest {
    HomePage homePage = new HomePage();
    ManProductPage manProductPage = new ManProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Test
    //userShouldAddProductSuccessFullyToShoppingCart()
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        //* Mouse Hover on Men Menu
        homePage.mouseHoverOnMenMenu();
        //* Mouse Hover on Bottoms
        homePage.mouseHoverOnBottoms();
        //* Click on Pants
        homePage.clickOnCronusYogaPant();
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
        manProductPage.mouseHoverOnCronusYogaPant();
        manProductPage.selectOnSize32();
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
        manProductPage.mouseHoverOnCronusYogaPant();
        manProductPage.selectColourBlack();
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        manProductPage.mouseHoverOnCronusYogaPant();
        manProductPage.addToCart();
        //* Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(shoppingCartPage.verifyTextYouAddedToCart(),"You added Cronus Yoga Pant to your shopping cart.","Text Not Match");
        //* Click on ‘shopping cart’ Link into message
        shoppingCartPage.clickOnShoppingCartLink();
        //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCartPage.verifyShoppingCart(),"Shopping Cart","Text Not Match");
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCartPage.verifyProductNameCronusYogaPant(),"Cronus Yoga Pant","Text Not Match");
        //* Verify the product size ‘32’
        Assert.assertEquals(shoppingCartPage.verifyProductSize32(),"32","Text Not Match");
        //* Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCartPage.verifyProductColourBlack(),"Black","Text Not Match");
    }
}