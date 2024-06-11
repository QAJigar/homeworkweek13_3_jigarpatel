package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    //1. verifyTheSortByProductNameFilter
    public void verifyTheSortByProductNameFilter() {
        //* Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //* Mouse Hover on Tops
        homePage.mouseHoverOnTop();
        //* Click on Jackets
        homePage.clickOnJackets();
        //* Select Sort By filter “Product Name”
        homePage.setSelectByProductName();
        //* Verify the products name display in alphabetical order

    }

    @Test
    //2. verifyTheSortByPriceFilter
    public void verifyTheSortByPriceFilter() {
        //* Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();
        //* Mouse Hover on Tops
        homePage.mouseHoverOnTop();
        //* Click on Jackets
        homePage.clickOnJackets();
        //* Select Sort By filter “Price”

        //* Verify the products price display in Low to High
    }

}
