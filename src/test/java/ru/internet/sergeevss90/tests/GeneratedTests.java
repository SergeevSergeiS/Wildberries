package ru.internet.sergeevss90.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static java.lang.Thread.sleep;

public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Check that search works")
    void openVacanciesPage() throws InterruptedException {
        $("#searchInput").setValue("Настольная игра Русский Манчкин").pressEnter();
        $(byText("Настольная игра Русский Манчкин")).hover();
        $(byLinkText("В корзину")).click();
        sleep(1000);
        $(byText("Корзина")).click();
    }
}
