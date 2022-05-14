package ru.internet.sergeevss90.tests;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Visible;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.internet.sergeevss90.helpers.DriverUtils;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.internet.sergeevss90.tests.TestData.*;

public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Проверка ошибок в коде главной страницы")
    void consoleShouldNotHaveErrorsTest() {
        step("Проверка отсутствия ошибок ошибок 'SEVERE' в логах консоли", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            assertThat(consoleLogs).doesNotContain("SEVERE");
        });
    }

    @Test
    @DisplayName("Проверка функциональности корзины")
    void basketTest() {
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

    @Test
    @DisplayName("Проверка действия кнопки 'Продавайте на Wildberries'")
    void sellButtonTest() {
        step("Проверка видимости кнопки и её нажатие", () -> {
            mainPage.checkSellButton();
        });

        step("Проверка открытия новой вкладки", () -> {
            mainPage.getNumberOfWindows();
        });

        step("Переход на новую вкладку", () -> {
            mainPage.switchTab();
        });
    }

    @Test
    @DisplayName("Проверка действия кнопки 'Работа в Wildberries'")
    void employmentButtonTest() {
        step("Проверка видимости кнопки и её нажатие", () -> {
            mainPage.checkEmploymentButton();
        });

        step("Проверка текста объявления", () -> {
            mainPage.checkEmploymentAnnouncement();
        });
    }
}

