package com.equiron.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 100–119 — поиск.
 */
@Epic("Demo Web Shop")
@Feature("Поиск товаров")
public class SearchTests extends BasePlaywrightTest {

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_100)
    @Story("USE_CASE_100")
    @Description(DemoWebshopTestPlan.USE_CASE_100)
    void useCase100_searchForBook() {
        // TODO: поиск по ключевому слову "book" и проверка, что в результатах есть книги
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_101)
    @Story("USE_CASE_101")
    @Description(DemoWebshopTestPlan.USE_CASE_101)
    void useCase101_searchForComputer() {
        // TODO: поиск по "computer" и проверка релевантности результатов
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_102)
    @Story("USE_CASE_102")
    @Description(DemoWebshopTestPlan.USE_CASE_102)
    void useCase102_searchForNonExistingTerm() {
        // TODO: поиск по несуществующей строке и проверка сообщения об отсутствии результатов
        page.navigate(BASE_URL);
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_103)
    @Story("USE_CASE_103")
    @Description(DemoWebshopTestPlan.USE_CASE_103)
    void useCase103_searchWithEmptyQuery() {
        // TODO: поиск с пустой строкой и проверка поведения системы
        page.navigate(BASE_URL);
    }
}

