package ru.internet.sergeevss90.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import ru.internet.sergeevss90.helpers.Attach;
import ru.internet.sergeevss90.helpers.DriverSettings;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
/*import pages.*;*/

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {

    /*MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    CabinetPage cabinetPage = new CabinetPage();
    HelpPage helpPage = new HelpPage();
    BasketPage basketPage = new BasketPage();
    UchebnikiPage uchebnikiPage = new UchebnikiPage();*/

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @BeforeEach
    void openVacanciesPage() {
        step("open main page", () -> open(""));
    }

    @AfterEach
    void addAttachments() {
        Attach.takeScreenshot("Final screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
