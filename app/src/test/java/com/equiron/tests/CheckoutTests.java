package com.equiron.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 080–099 — checkout (оформление заказа).
 */
@Epic("Demo Web Shop")
@Feature("Оформление заказа (Checkout)")
public class CheckoutTests extends BasePlaywrightTest {

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_080)
    @Story("USE_CASE_080")
    @Description(DemoWebshopTestPlan.USE_CASE_080)
    void useCase080_fullCheckoutFlow() {
        // TODO: полный сценарий покупки авторизованным пользователем до подтверждения заказа
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_081)
    @Story("USE_CASE_081")
    @Description(DemoWebshopTestPlan.USE_CASE_081)
    void useCase081_checkoutWithEmptyCart() {
        // TODO: проверить невозможность перейти к оплате с пустой корзиной
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_082)
    @Story("USE_CASE_082")
    @Description(DemoWebshopTestPlan.USE_CASE_082)
    void useCase082_shippingAddressValidation() {
        // TODO: проверить валидацию адреса доставки при оформлении заказа
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_083)
    @Story("USE_CASE_083")
    @Description(DemoWebshopTestPlan.USE_CASE_083)
    void useCase083_shippingAndPaymentMethods() {
        // TODO: проверить выбор способов доставки и оплаты и итоговую сумму
        page.navigate(BASE_URL);
    }
}

