package com.equiron.tests;

import com.equiron.pages.DemoWebshopLocators;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 001–019 — навигация и главная страница.
 */
@Epic("Demo Web Shop")
@Feature("Навигация и главная страница")
public class NavigationTests extends BasePlaywrightTest {

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_001)
    @Story("USE_CASE_001")
    @Description(DemoWebshopTestPlan.USE_CASE_001)
    void useCase001_homePageOpens() {
        page.navigate(BASE_URL);

        // Проверка заголовка "Welcome to our store"
        boolean titleVisible = page
                .locator(DemoWebshopLocators.HOME_WELCOME_TITLE)
                .first()
                .isVisible();
        assertThat(titleVisible)
                .as("Заголовок \"Welcome to our store\" должен быть видим на главной странице")
                .isTrue();

        // Проверка наличия блока "Featured products"
        boolean featuredProductsVisible = page
                .getByText(DemoWebshopLocators.HOME_FEATURED_PRODUCTS_BLOCK_TEXT)
                .first()
                .isVisible();
        assertThat(featuredProductsVisible)
                .as("Блок \"Featured products\" должен быть видим на главной странице")
                .isTrue();
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_002)
    @Story("USE_CASE_002")
    @Description(DemoWebshopTestPlan.USE_CASE_002)
    void useCase002_mainCategoriesVisibleOnHome() {
        // TODO: реализовать проверки видимости основных категорий на главной странице
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_003)
    @Story("USE_CASE_003")
    @Description(DemoWebshopTestPlan.USE_CASE_003)
    void useCase003_navigateToBooksCategory() {
        // TODO: перейти в раздел Books и проверить, что отображается список книг
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_004)
    @Story("USE_CASE_004")
    @Description(DemoWebshopTestPlan.USE_CASE_004)
    void useCase004_navigateToComputersSubcategories() {
        // TODO: перейти в Computers и его подкатегории (Desktops, Notebooks, Accessories)
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_005)
    @Story("USE_CASE_005")
    @Description(DemoWebshopTestPlan.USE_CASE_005)
    void useCase005_navigateToElectronicsSubcategories() {
        // TODO: перейти в Electronics и подкатегории (Camera, photo; Cell phones)
        page.navigate(BASE_URL);
    }
}

