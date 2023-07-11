package ru.nikov.tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.nikov.pages.MainPage;


public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();


    @Tag ("critical")
    @DisplayName("Проверка содержимого хэдер меню")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void headerMenuContentTest() {
        mainPage.openPage()
                .headerMenuContent();
    }

    @Tag ("critical")
    @DisplayName("Проверка наличия формы запроса консультации")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void requestFormTest() {
        mainPage.openPage()
                .isRequestFormExist();
    }

}

