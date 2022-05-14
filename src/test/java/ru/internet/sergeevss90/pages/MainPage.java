package ru.internet.sergeevss90.pages;

import com.codeborne.selenide.SelenideElement;

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
        sellButton.shouldBe(visible);
    }

    public void checkEmploymentButton() {
        employmentButton.shouldBe(visible);
    }
}
