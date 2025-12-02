package com.equiron.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 120–139 — контентные и вспомогательные блоки.
 */
@Epic("Demo Web Shop")
@Feature("Контентные и вспомогательные блоки")
public class ContentBlocksTests extends BasePlaywrightTest {

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_120)
    @Story("USE_CASE_120")
    @Description(DemoWebshopTestPlan.USE_CASE_120)
    void useCase120_newsletterSubscriptionValidEmail() {
        // TODO: подписка на newsletter с корректным e-mail и проверка успешного сообщения
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_121)
    @Story("USE_CASE_121")
    @Description(DemoWebshopTestPlan.USE_CASE_121)
    void useCase121_newsletterSubscriptionInvalidEmail() {
        // TODO: подписка на newsletter с некорректным e-mail и проверка ошибки
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_122)
    @Story("USE_CASE_122")
    @Description(DemoWebshopTestPlan.USE_CASE_122)
    void useCase122_voteInCommunityPoll() {
        // TODO: голосование в community poll и проверка результата
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_123)
    @Story("USE_CASE_123")
    @Description(DemoWebshopTestPlan.USE_CASE_123)
    void useCase123_myAccountSectionsForAuthorizedUser() {
        // TODO: переход в разделы My account (Orders, Addresses, Shopping cart, Wishlist)
        page.navigate(BASE_URL);
    }
}

