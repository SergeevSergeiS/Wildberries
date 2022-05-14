package ru.internet.sergeevss90.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import ru.internet.sergeevss90.helpers.DriverUtils;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Проверка ошибок в коде главной страницы Wildberries.ru")
    void consoleShouldNotHaveErrorsTest() {
        step("Проверяем что консоль логов не содержит ошибок 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            assertThat(consoleLogs).doesNotContain("SEVERE");
        });
    }

    @Test
    @DisplayName("Проверка функциональности корзины")
    void fillBasketAndClearBasketTest() throws InterruptedException {
        $("#searchInput").setValue("Настольная игра Русский Манчкин").pressEnter();
        $(byText("Настольная игра Русский Манчкин")).hover();
        $(byLinkText("В корзину")).click();
        sleep(1000);
        $(byText("Корзина")).click();
        $(".list-item__good-info").shouldHave(text("Настольная игра Русский Манчкин"));
        $(".count__plus").hover();
        $(byText("Удалить")).click();
        $(".basket-page__basket-empty").shouldHave(text("В корзине пока ничего нет"));
    }
}
