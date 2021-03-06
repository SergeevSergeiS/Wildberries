package ru.internet.sergeevss90.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class MainPage {
    private final SelenideElement mainSearchField = $("#searchInput");
    private final SelenideElement sellButton = $(".simple-menu__link--sell-on-wb");
    private final SelenideElement employmentButton = $(".simple-menu__link--employment");
    private final SelenideElement chatBot = $(".smm-fixed__toggle");
    private final SelenideElement chatText = $(".message__text--wb");

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

    public void switchTab() {
        switchTo().window(1);
    }

    public void checkEmploymentButton() {
        employmentButton.shouldBe(visible).click();
    }

    public void checkChatBot() {
        chatBot.shouldBe(visible).click();
    }

    public void checkChatText() {
        String text = "Ева Вайлет";
        chatText.shouldHave(text(text));
    }
}
