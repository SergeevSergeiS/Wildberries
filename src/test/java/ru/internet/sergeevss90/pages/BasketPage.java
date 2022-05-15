package ru.internet.sergeevss90.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    private final SelenideElement actualProductName = $(".list-item__good-info");
    private final SelenideElement counter = $(".count__plus");
    private final SelenideElement emptyBasket = $(".basket-page__basket-empty");

    public void checkProduct(String productName) {
        actualProductName.shouldHave(text(productName));
    }

    public void clearBasket() {
        counter.hover();
        String clear = "Удалить";
        $(byText(clear)).click();
    }

    public void checkEmptyBasket() {
        String emptyStatus = "В корзине пока ничего нет";
        emptyBasket.shouldHave(text(emptyStatus));
    }


}
