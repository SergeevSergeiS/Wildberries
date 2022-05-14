package ru.internet.sergeevss90.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement mainSearchField = $("#searchInput");

    public void searchProduct(String productName) {
        mainSearchField.setValue(productName).pressEnter();
    }
}
