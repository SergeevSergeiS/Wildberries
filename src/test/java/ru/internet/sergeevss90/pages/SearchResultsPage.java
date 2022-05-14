package ru.internet.sergeevss90.pages;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class SearchResultsPage {

    public void addToBasket(String productName) throws InterruptedException {
        $(byText(productName)).hover();
        String toBasket = "В корзину";
        $(byLinkText(toBasket)).click();
        sleep(1000);
    }

    public void moveToBasket() {
        String basket = "Корзина";
        $(byText(basket)).click();
    }
}
