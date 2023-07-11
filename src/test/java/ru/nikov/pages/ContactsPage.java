package ru.nikov.pages;

import com.codeborne.selenide.SelenideElement;
import ru.nikov.components.ContentVerifyModal;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ContactPage {

    private final SelenideElement
            ekbAddress = $("#bx_3218110189_2512.contact-txt", 0),
            ekbPhone = $("#bx_3218110189_2512.contact-txt", 1),
            email = $("#bx_3218110189_2512.contact-txt", 2),





            supportButton = $(".supernav_container").$(byText("SUPPORT")),
            gamesAndProgramsButton = $("[href='https://help.steampowered.com/en/wizard/HelpWithGame']"),
            communityButton = $(".supernav_container").$(byText("COMMUNITY")),
            searchPlayersInput = $("#SearchPlayers"),
            languageButton = $("#language_pulldown"),
            languageDropDownList = $("#language_dropdown");

    ContentVerifyModal contentVerifyModal = new ContentVerifyModal();

    public ContactPage openPage() {

        step( "Открыть страницу 'https://hostco.ru'", () ->
                open( "https://hostco.ru/contacts" ) );
        return this;
    }

    public void checkEkbContacts() {
        step("Проверить контактную информацию в Екатеринбурге", () ->
                contentVerifyModal.verifyEkbContacts()
        );

    }

    public void checkKurganContacts() {
        step("Проверить контактную информацию в Кургане", () ->
                contentVerifyModal.verifyKurganContacts()
        );
    }
}