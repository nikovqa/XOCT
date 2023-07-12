package ru.nikov.tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.nikov.pages.ContactsPage;
import ru.nikov.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

@Tag( "any" )
public class Tests extends TestBase {

    MainPage mainPage = new MainPage();
    ContactsPage contactsPage = new ContactsPage();


    @Tag ("normal")
    @DisplayName("Проверка содержимого хэдер меню")
    @Severity(SeverityLevel.NORMAL)
    @Test
    void headerMenuContentTest() {
        mainPage.openPage()
                .headerMenuContent();
    }

    @Tag ("critical")
    @DisplayName("Проверка наличия формы запроса консультации на главной странице")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void requestFormTest() {
        mainPage.openPage()
                .isRequestFormExist();
    }

    @Tag ("critical")
    @DisplayName("Проверка контактной информации")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void contactsTest() {
        contactsPage.openPage().checkEkbContacts();
        contactsPage.openPage().checkKurganContacts();
    }

    @Tag ("normal")
    @DisplayName("Проверка наличия формы подписки на главной странице")
    @Severity(SeverityLevel.NORMAL)
    @Test
    void subscribeFormTest() {
        mainPage.openPage()
                .subscribeButtonClick()
                .verifySubscribeForm();
    }

    @Tag ("critical")
    @DisplayName("Проверка бесплатного номера в хедере")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void freeCallNumberTest() {
        mainPage.openPage()
                .checkFreeCallNumber();
    }


    @Tag ("normal")
    @DisplayName("Проверка информации в разделе 'О компании'")
    @Severity(SeverityLevel.NORMAL)
    @Test
    void aboutUsPageTest() {
        mainPage.openPage()
                .viewInfoAboutUs()
                .checkInfoAboutUs();
    }
}

