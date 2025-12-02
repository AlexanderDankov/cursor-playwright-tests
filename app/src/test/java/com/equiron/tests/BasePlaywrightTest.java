package com.equiron.tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BasePlaywrightTest {

    protected static final String BASE_URL = loadBaseUrl();

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeAll
    void setUpPlaywright() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @AfterAll
    void tearDownPlaywright() {
        if (page != null) {
            page.close();
        }
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }

    private static String loadBaseUrl() {
        Properties properties = new Properties();
        try (InputStream is = BasePlaywrightTest.class
                .getClassLoader()
                .getResourceAsStream("test-config.properties")) {
            if (is != null) {
                properties.load(is);
                String value = properties.getProperty("base.url");
                if (value != null && !value.isBlank()) {
                    return value;
                }
            }
        } catch (IOException ignored) {
            // Fallback to default if config cannot be read
        }
        return "https://demowebshop.tricentis.com/";
    }
}

