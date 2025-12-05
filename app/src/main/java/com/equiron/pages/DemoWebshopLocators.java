package com.equiron.pages;

/**
 * Набор констант с локаторами для Demo Web Shop.
 * Здесь собираем все используемые в тестах селекторы,
 * чтобы при изменении верстки править их в одном месте.
 */
public final class DemoWebshopLocators {

    private DemoWebshopLocators() {
        // utility class
    }

    // Главная страница
    public static final String HOME_WELCOME_TITLE =
            "h2:has-text(\"Welcome to our store\")";

    public static final String HOME_FEATURED_PRODUCTS_BLOCK_TEXT =
            "Featured products";

    // Навигация - основные категории
    public static final String NAV_BOOKS_LINK = "a[href*='/books']";
    public static final String NAV_COMPUTERS_LINK = "a[href*='/computers']";
    public static final String NAV_ELECTRONICS_LINK = "a[href*='/electronics']";
    public static final String NAV_APPAREL_SHOES_LINK = "a[href*='/apparel-shoes']";
    public static final String NAV_DIGITAL_DOWNLOADS_LINK = "a[href*='/digital-downloads']";
    public static final String NAV_JEWELRY_LINK = "a[href*='/jewelry']";
    public static final String NAV_GIFT_CARDS_LINK = "a[href*='/gift-cards']";

    // Подкатегории Computers (находятся в боковом меню Categories)
    public static final String COMPUTERS_DESKTOPS_LINK = "//a[contains(@href,'/desktops') and text()='Desktops']";
    public static final String COMPUTERS_NOTEBOOKS_LINK = "//a[contains(@href,'/notebooks') and text()='Notebooks']";
    public static final String COMPUTERS_ACCESSORIES_LINK = "//a[contains(@href,'/accessories') and text()='Accessories']";

    // Подкатегории Electronics (находятся в боковом меню Categories)
    public static final String ELECTRONICS_CAMERA_LINK = "//a[contains(@href,'/camera-photo') and text()='Camera, photo']";
    public static final String ELECTRONICS_CELL_PHONES_LINK = "//a[contains(@href,'/cell-phones') and text()='Cell phones']";

    // Нижнее меню (footer)
    public static final String FOOTER_SITEMAP_LINK = "a[href*='/sitemap']";
    public static final String FOOTER_SHIPPING_RETURNS_LINK = "a[href*='/shipping-returns']";
    public static final String FOOTER_PRIVACY_NOTICE_LINK = "a[href*='/privacy-policy']";
    public static final String FOOTER_CONDITIONS_OF_USE_LINK = "a[href*='/conditions-of-use']";
    public static final String FOOTER_ABOUT_US_LINK = "a[href*='/about-us']";
    public static final String FOOTER_CONTACT_US_LINK = "a[href*='/contactus']";

    // Общие селекторы для проверки страниц категорий
    public static final String CATEGORY_PAGE_TITLE = ".page-title";
    public static final String CATEGORY_PRODUCTS_LIST = ".product-item";
    public static final String PAGE_BODY = "body";
}


