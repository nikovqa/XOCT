package ru.nikov.pages;

import ru.nikov.components.ContentVerify;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ContactsPage {

    ContentVerify contentverify = new ContentVerify();

    public ContactsPage openPage() {

        step( "Открыть страницу 'https://hostco.ru'", () ->
                open( "https://hostco.ru/contacts" ) );
        return this;
    }

    public void checkEkbContacts() {
        step("Проверить контактную информацию в Екатеринбурге", () ->
                contentverify.verifyEkbContacts()
        );

    }

    public void checkKurganContacts() {
        step("Проверить контактную информацию в Кургане", () ->
                contentverify.verifyKurganContacts()
        );
    }
}