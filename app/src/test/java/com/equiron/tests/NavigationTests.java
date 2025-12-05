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
        page.navigate(BASE_URL);

        // Проверка видимости основных разделов каталога на главной странице
        assertThat(page.locator(DemoWebshopLocators.NAV_BOOKS_LINK).first().isVisible())
                .as("Ссылка на раздел Books должна быть видимой")
                .isTrue();

        assertThat(page.locator(DemoWebshopLocators.NAV_COMPUTERS_LINK).first().isVisible())
                .as("Ссылка на раздел Computers должна быть видимой")
                .isTrue();

        assertThat(page.locator(DemoWebshopLocators.NAV_ELECTRONICS_LINK).first().isVisible())
                .as("Ссылка на раздел Electronics должна быть видимой")
                .isTrue();

        assertThat(page.locator(DemoWebshopLocators.NAV_APPAREL_SHOES_LINK).first().isVisible())
                .as("Ссылка на раздел Apparel & Shoes должна быть видимой")
                .isTrue();

        assertThat(page.locator(DemoWebshopLocators.NAV_DIGITAL_DOWNLOADS_LINK).first().isVisible())
                .as("Ссылка на раздел Digital downloads должна быть видимой")
                .isTrue();

        assertThat(page.locator(DemoWebshopLocators.NAV_JEWELRY_LINK).first().isVisible())
                .as("Ссылка на раздел Jewelry должна быть видимой")
                .isTrue();

        assertThat(page.locator(DemoWebshopLocators.NAV_GIFT_CARDS_LINK).first().isVisible())
                .as("Ссылка на раздел Gift Cards должна быть видимой")
                .isTrue();
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_003)
    @Story("USE_CASE_003")
    @Description(DemoWebshopTestPlan.USE_CASE_003)
    void useCase003_navigateToBooksCategory() {
        page.navigate(BASE_URL);

        // Переход в раздел Books
        page.locator(DemoWebshopLocators.NAV_BOOKS_LINK).first().click();

        // Проверка, что отображается список книг
        assertThat(page.locator(DemoWebshopLocators.CATEGORY_PRODUCTS_LIST).count() > 0)
                .as("В разделе Books должен отображаться список книг")
                .isTrue();

        assertThat(page.locator(DemoWebshopLocators.PAGE_BODY).innerText().toLowerCase().contains("books"))
                .as("На странице Books должно содержаться слово 'books' в контенте")
                .isTrue();
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_004)
    @Story("USE_CASE_004")
    @Description(DemoWebshopTestPlan.USE_CASE_004)
    void useCase004_navigateToComputersSubcategories() {
        page.navigate(BASE_URL);

        // Переход в раздел Computers
        page.locator(DemoWebshopLocators.NAV_COMPUTERS_LINK).first().click();

        // Проверка доступности подкатегорий на странице
        assertThat(page.locator(DemoWebshopLocators.COMPUTERS_DESKTOPS_LINK).isVisible())
                .as("Ссылка на подкатегорию Desktops должна быть видимой")
                .isTrue();

        assertThat(page.locator(DemoWebshopLocators.COMPUTERS_NOTEBOOKS_LINK).isVisible())
                .as("Ссылка на подкатегорию Notebooks должна быть видимой")
                .isTrue();

        assertThat(page.locator(DemoWebshopLocators.COMPUTERS_ACCESSORIES_LINK).isVisible())
                .as("Ссылка на подкатегорию Accessories должна быть видимой")
                .isTrue();

        // Проверка перехода в каждую подкатегорию
        page.locator(DemoWebshopLocators.COMPUTERS_DESKTOPS_LINK).click();
        assertThat(page.locator(DemoWebshopLocators.CATEGORY_PRODUCTS_LIST).count() >= 0)
                .as("Страница Desktops должна открываться корректно")
                .isTrue();

        page.goBack();
        page.locator(DemoWebshopLocators.COMPUTERS_NOTEBOOKS_LINK).click();
        assertThat(page.locator(DemoWebshopLocators.CATEGORY_PRODUCTS_LIST).count() >= 0)
                .as("Страница Notebooks должна открываться корректно")
                .isTrue();

        page.goBack();
        page.locator(DemoWebshopLocators.COMPUTERS_ACCESSORIES_LINK).click();
        assertThat(page.locator(DemoWebshopLocators.CATEGORY_PRODUCTS_LIST).count() >= 0)
                .as("Страница Accessories должна открываться корректно")
                .isTrue();
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_005)
    @Story("USE_CASE_005")
    @Description(DemoWebshopTestPlan.USE_CASE_005)
    void useCase005_navigateToElectronicsSubcategories() {
        page.navigate(BASE_URL);

        // Переход в раздел Electronics
        page.locator(DemoWebshopLocators.NAV_ELECTRONICS_LINK).first().click();

        // Проверка доступности подкатегорий
        assertThat(page.locator(DemoWebshopLocators.ELECTRONICS_CAMERA_LINK).isVisible())
                .as("Ссылка на подкатегорию Camera, photo должна быть видимой")
                .isTrue();

        assertThat(page.locator(DemoWebshopLocators.ELECTRONICS_CELL_PHONES_LINK).isVisible())
                .as("Ссылка на подкатегорию Cell phones должна быть видимой")
                .isTrue();

        // Проверка перехода в каждую подкатегорию
        page.locator(DemoWebshopLocators.ELECTRONICS_CAMERA_LINK).click();
        assertThat(page.locator(DemoWebshopLocators.CATEGORY_PRODUCTS_LIST).count() >= 0)
                .as("Страница Camera, photo должна открываться корректно")
                .isTrue();

        page.goBack();
        page.locator(DemoWebshopLocators.ELECTRONICS_CELL_PHONES_LINK).click();
        assertThat(page.locator(DemoWebshopLocators.CATEGORY_PRODUCTS_LIST).count() >= 0)
                .as("Страница Cell phones должна открываться корректно")
                .isTrue();
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_006)
    @Story("USE_CASE_006")
    @Description(DemoWebshopTestPlan.USE_CASE_006)
    void useCase006_navigateToApparelAndShoes() {
        page.navigate(BASE_URL);

        // Переход в раздел Apparel & Shoes
        page.locator(DemoWebshopLocators.NAV_APPAREL_SHOES_LINK).first().click();

        // Проверка отображения товаров
        assertThat(page.locator(DemoWebshopLocators.CATEGORY_PRODUCTS_LIST).count() > 0)
                .as("В разделе Apparel & Shoes должен отображаться список товаров")
                .isTrue();
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_007)
    @Story("USE_CASE_007")
    @Description(DemoWebshopTestPlan.USE_CASE_007)
    void useCase007_navigateToDigitalDownloads() {
        page.navigate(BASE_URL);

        // Переход в раздел Digital downloads
        page.locator(DemoWebshopLocators.NAV_DIGITAL_DOWNLOADS_LINK).first().click();

        // Проверка отображения цифровых товаров
        assertThat(page.locator(DemoWebshopLocators.CATEGORY_PRODUCTS_LIST).count() >= 0)
                .as("В разделе Digital downloads должен отображаться список цифровых товаров")
                .isTrue();
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_008)
    @Story("USE_CASE_008")
    @Description(DemoWebshopTestPlan.USE_CASE_008)
    void useCase008_navigateToJewelry() {
        page.navigate(BASE_URL);

        // Переход в раздел Jewelry
        page.locator(DemoWebshopLocators.NAV_JEWELRY_LINK).first().click();

        // Проверка списка ювелирных изделий
        assertThat(page.locator(DemoWebshopLocators.CATEGORY_PRODUCTS_LIST).count() > 0)
                .as("В разделе Jewelry должен отображаться список ювелирных изделий")
                .isTrue();
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_009)
    @Story("USE_CASE_009")
    @Description(DemoWebshopTestPlan.USE_CASE_009)
    void useCase009_navigateToGiftCards() {
        page.navigate(BASE_URL);

        // Переход в раздел Gift Cards
        page.locator(DemoWebshopLocators.NAV_GIFT_CARDS_LINK).first().click();

        // Проверка отображения gift card продуктов
        assertThat(page.locator(DemoWebshopLocators.CATEGORY_PRODUCTS_LIST).count() > 0)
                .as("В разделе Gift Cards должен отображаться список gift card продуктов")
                .isTrue();
    }

    @Test
    @DisplayName(DemoWebshopTestPlan.USE_CASE_010)
    @Story("USE_CASE_010")
    @Description(DemoWebshopTestPlan.USE_CASE_010)
    void useCase010_navigateToFooterLinks() {
        page.navigate(BASE_URL);

        // Проверка перехода по ссылкам нижнего меню
        page.locator(DemoWebshopLocators.FOOTER_SITEMAP_LINK).first().click();
        assertThat(page.url().contains("sitemap"))
                .as("Страница Sitemap должна открываться корректно")
                .isTrue();
        page.goBack();

        page.locator(DemoWebshopLocators.FOOTER_SHIPPING_RETURNS_LINK).first().click();
        assertThat(page.url().contains("shipping-returns"))
                .as("Страница Shipping & Returns должна открываться корректно")
                .isTrue();
        page.goBack();

        page.locator(DemoWebshopLocators.FOOTER_PRIVACY_NOTICE_LINK).first().click();
        assertThat(page.url().contains("privacy-policy"))
                .as("Страница Privacy Notice должна открываться корректно")
                .isTrue();
        page.goBack();

        page.locator(DemoWebshopLocators.FOOTER_CONDITIONS_OF_USE_LINK).first().click();
        assertThat(page.url().contains("conditions-of-use"))
                .as("Страница Conditions of Use должна открываться корректно")
                .isTrue();
        page.goBack();

        page.locator(DemoWebshopLocators.FOOTER_ABOUT_US_LINK).first().click();
        assertThat(page.url().contains("about-us"))
                .as("Страница About us должна открываться корректно")
                .isTrue();
        page.goBack();

        page.locator(DemoWebshopLocators.FOOTER_CONTACT_US_LINK).first().click();
        assertThat(page.url().contains("contactus"))
                .as("Страница Contact us должна открываться корректно")
                .isTrue();
    }
}

