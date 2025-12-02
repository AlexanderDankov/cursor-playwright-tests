package com.equiron.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 020–039 — каталог и карточка товара.
 */
@Epic("Demo Web Shop")
@Feature("Каталог и карточка товара")
public class CatalogTests extends BasePlaywrightTest {

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_020)
    @Story("USE_CASE_020")
    @Description(DemoWebshopTestPlan.USE_CASE_020)
    void useCase020_openFeaturedProductFromHome() {
        // TODO: открыть featured продукт с главной страницы и проверить цену и описание
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_021)
    @Story("USE_CASE_021")
    @Description(DemoWebshopTestPlan.USE_CASE_021)
    void useCase021_openNotebookDetails() {
        // TODO: открыть карточку ноутбука из Computers > Notebooks и проверить характеристики
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_022)
    @Story("USE_CASE_022")
    @Description(DemoWebshopTestPlan.USE_CASE_022)
    void useCase022_catalogPagination() {
        // TODO: проверить переключение страниц каталога (пагинация)
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_023)
    @Story("USE_CASE_023")
    @Description(DemoWebshopTestPlan.USE_CASE_023)
    void useCase023_catalogSorting() {
        // TODO: проверить работу сортировки товаров
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_024)
    @Story("USE_CASE_024")
    @Description(DemoWebshopTestPlan.USE_CASE_024)
    void useCase024_featuredProductsBlock() {
        // TODO: проверить блок Featured products и переход в карточку товара
        page.navigate(BASE_URL);
    }
}

