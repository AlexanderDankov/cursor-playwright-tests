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
}


