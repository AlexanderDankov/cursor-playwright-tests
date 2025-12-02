package com.equiron;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PlaywrightTest {

    private Playwright playwright;
    private Browser browser;
    private Page page;

    @BeforeAll
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        page = browser.newPage();
    }

    @AfterAll
    public void tearDown() {
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

    @Test
    public void testPageTitle() {
        page.navigate("https://example.com");
        String title = page.title();
        assertNotNull(title, "Page title should not be null");
        assertTrue(title.length() > 0, "Page title should not be empty");
    }
}
