package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@type='text']");

    public MainPage(String url) {
        Selenide.open(url);
    }
    public SearchPages search(String searchString) {
        textBoxInput.val(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPages();
    }
}