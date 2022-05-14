package ru.internet.sergeevss90.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static java.lang.Thread.sleep;

public class GeneratedTests extends TestBase {

    /*@Disabled
    @Test
    @DisplayName("Check that search works")
    void openPage() {
        $("#vacancies_head_link").click();
        $(byLinkText("Найди работу мечты")).click();
        $(".f__h1").shouldHave(Condition.text("Карьера"));
    }*/

    @Test
    @DisplayName("Check that search works")
    void openVacanciesPage() {
        open("https://bellintegrator.ru/index.php?route=information/vacancies");
        $(".careersSelect__block .btn").click();
        $(".careersSelect__block li:nth-child(6) .text").click();
        $("#select_group_id").selectOption("Тестирование");
        $(".bs-placeholder").click();
        $(byLinkText("Москва")).click();
        $("#select_city_id").selectOption("Москва");
        $("#search_vacancy > span").click();
        $("#total > span:nth-child(1)").click();
    }
}
