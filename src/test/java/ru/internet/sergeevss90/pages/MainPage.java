package ru.internet.sergeevss90.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement mainSearchField = $("#searchInput");
    private final SelenideElement sellButton = $(".simple-menu__link--sell-on-wb");
    private final SelenideElement employmentButton = $(".simple-menu__link--employment");

    public void searchProduct(String productName) {
        mainSearchField.setValue(productName).pressEnter();
    }

    public void checkSellButton() {
        sellButton.shouldBe(visible).click();
    }
    public void getNumberOfWindows() {
        Assertions.assertEquals(
                2,
                WebDriverRunner.getWebDriver().getWindowHandles().size()
        );
    }

    public void checkEmploymentButton() {
        employmentButton.shouldBe(visible);
    }
}
