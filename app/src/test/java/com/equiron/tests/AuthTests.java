package com.equiron.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 060–079 — регистрация и логин.
 */
@Epic("Demo Web Shop")
@Feature("Регистрация и авторизация")
public class AuthTests extends BasePlaywrightTest {

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_060)
    @Story("USE_CASE_060")
    @Description(DemoWebshopTestPlan.USE_CASE_060)
    void useCase060_successfulRegistration() {
        // TODO: успешная регистрация нового пользователя и проверка входа
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_061)
    @Story("USE_CASE_061")
    @Description(DemoWebshopTestPlan.USE_CASE_061)
    void useCase061_registrationWithExistingEmail() {
        // TODO: регистрация с уже существующим e-mail и проверка ошибки
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_062)
    @Story("USE_CASE_062")
    @Description(DemoWebshopTestPlan.USE_CASE_062)
    void useCase062_successfulLogin() {
        // TODO: успешный логин зарегистрированного пользователя
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_063)
    @Story("USE_CASE_063")
    @Description(DemoWebshopTestPlan.USE_CASE_063)
    void useCase063_loginWithWrongPassword() {
        // TODO: логин с неверным паролем и проверка сообщения об ошибке
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_064)
    @Story("USE_CASE_064")
    @Description(DemoWebshopTestPlan.USE_CASE_064)
    void useCase064_logoutUser() {
        // TODO: логаут и проверка смены ссылок на Register/Log in
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_065)
    @Story("USE_CASE_065")
    @Description(DemoWebshopTestPlan.USE_CASE_065)
    void useCase065_registrationRequiredFieldsValidation() {
        // TODO: проверить обязательные поля формы регистрации и сообщения валидации
        page.navigate(BASE_URL);
    }
}

