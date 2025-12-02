package com.equiron.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 140–159 — негативные сценарии и валидация доступа.
 */
@Epic("Demo Web Shop")
@Feature("Негативные сценарии и валидация")
public class NegativeValidationTests extends BasePlaywrightTest {

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_140)
    @Story("USE_CASE_140")
    @Description(DemoWebshopTestPlan.USE_CASE_140)
    void useCase140_myAccountWithoutAuth() {
        // TODO: попытка зайти в My account без авторизации и проверка редиректа/ошибки
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_141)
    @Story("USE_CASE_141")
    @Description(DemoWebshopTestPlan.USE_CASE_141)
    void useCase141_checkoutAsGuestIfSupported() {
        // TODO: попытка начать checkout как гость и проверка доступных опций
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_142)
    @Story("USE_CASE_142")
    @Description(DemoWebshopTestPlan.USE_CASE_142)
    void useCase142_invalidEmailFormatOnLogin() {
        // TODO: ввод некорректного e-mail при логине и проверка сообщения валидации
        page.navigate(BASE_URL);
    }
}

