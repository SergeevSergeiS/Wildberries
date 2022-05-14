package ru.internet.sergeevss90.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static java.lang.Thread.sleep;

public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Check that search works")
    void openPage() {
        $("#vacancies_head_link").click();
        $(byLinkText("Найди работу мечты")).click();
        $(".f__h1").shouldHave(Condition.text("Карьера"));
    }
}
