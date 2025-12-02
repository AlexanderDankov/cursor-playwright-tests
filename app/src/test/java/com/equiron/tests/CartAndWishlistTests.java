package com.equiron.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 040–059 — корзина и wishlist.
 */
@Epic("Demo Web Shop")
@Feature("Корзина и Wishlist")
public class CartAndWishlistTests extends BasePlaywrightTest {

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_040)
    @Story("USE_CASE_040")
    @Description(DemoWebshopTestPlan.USE_CASE_040)
    void useCase040_addProductToCartFromHome() {
        // TODO: добавить товар в корзину с главной и проверить счётчик Shopping cart (1)
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_041)
    @Story("USE_CASE_041")
    @Description(DemoWebshopTestPlan.USE_CASE_041)
    void useCase041_addMultipleProductsToCart() {
        // TODO: добавить несколько товаров и проверить количество и сумму
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_042)
    @Story("USE_CASE_042")
    @Description(DemoWebshopTestPlan.USE_CASE_042)
    void useCase042_changeQuantityInCart() {
        // TODO: изменить количество товара в корзине и проверить пересчёт суммы
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_043)
    @Story("USE_CASE_043")
    @Description(DemoWebshopTestPlan.USE_CASE_043)
    void useCase043_removeProductFromCart() {
        // TODO: удалить товар из корзины и проверить сообщение о пустой корзине
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_044)
    @Story("USE_CASE_044")
    @Description(DemoWebshopTestPlan.USE_CASE_044)
    void useCase044_addProductToWishlist() {
        // TODO: добавить товар в wishlist и проверить счётчик Wishlist
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_045)
    @Story("USE_CASE_045")
    @Description(DemoWebshopTestPlan.USE_CASE_045)
    void useCase045_moveFromWishlistToCart() {
        // TODO: перенести товар из wishlist в корзину
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_046)
    @Story("USE_CASE_046")
    @Description(DemoWebshopTestPlan.USE_CASE_046)
    void useCase046_openEmptyCart() {
        // TODO: открыть корзину, когда она пуста, и проверить сообщение
        page.navigate(BASE_URL);
    }
}

