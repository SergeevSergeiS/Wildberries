package ru.internet.sergeevss90.tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.internet.sergeevss90.helpers.DriverUtils;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.internet.sergeevss90.tests.TestData.*;

public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Проверка ошибок в коде главной страницы")
    void consoleShouldNotHaveErrorsTest() {
        step("Проверяем что консоль логов не содержит ошибок 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            assertThat(consoleLogs).doesNotContain("SEVERE");
        });
    }

    @Test
    @DisplayName("Проверка функциональности корзины")
    void searchProduct() {
        step("Поиск товара", () -> {
            mainPage.searchProduct(productName);
        });

        step("Добавление товара в корзину", () -> {
            searchResultsPage.addToBasket(productName);
        });

        step("Переход в корзину", () -> {
            searchResultsPage.moveToBasket();
        });

        step("Проверка корзины", () -> {
            basketPage.checkProduct(productName);
        });

        step("Очистка корзины", () -> {
            basketPage.clearBasket();
        });

        step("Проверка пустой корзины", () -> {
            basketPage.checkEmptyBasket();
        });
    }
}

