package Tests;

import Pages.MainPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppleTest extends BaseTest {
    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    private final static String EXPECTED_WORD = "iphone-13";

    @Test
    public void checkHref() {
        assertTrue(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains(EXPECTED_WORD));
    }
}