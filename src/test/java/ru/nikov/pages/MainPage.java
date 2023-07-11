package ru.nikov.pages;

import ru.nikov.components.ContentVerify;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPage {

    ContentVerify contentVerify = new ContentVerify();

    public MainPage openPage() {
        step("Открыть главную страницу 'https://hostco.ru'", () ->
                open("https://hostco.ru"));

        return this;
    }

    public MainPage headerMenuContent() {
        step("Проверить наличие подразделов в хедер меню", () ->
                contentVerify.verifyHeaderMenuContent());

        return this;
    }


    public MainPage isRequestFormExist() {
        step("Проверить наличие формы для запроса консультации", () ->
                contentVerify.verifyRequestFormExistOnMainPage());

        return this;
    }

    public MainPage subscribeButtonClick() {
        step("Кликнуть кнопку 'Подписка'", () ->
                $(".footer-btn", 1).scrollIntoView(false).click());

        return this;
    }
    public MainPage verifySubscribeForm() {
        step("Проверить, что появилась форма подписки", () ->
                contentVerify.verifySubscribeForm());

        return this;
    }

    public MainPage checkFreeCallNumber() {
        step( "Проверить бесплатный номер телефона", () ->
                contentVerify.verifyFreeCallNumber() );

        return this;
    }
        public MainPage viewInfoAboutUs() {
            step("Перейти в раздел 'О компании'", () ->
                   $(".primary-nav").$(byText("О компании")).click() );

            return this;
        }

    public MainPage checkInfoAboutUs() {
        step("Пероверить информацию в разделе 'О компании'", () ->
        contentVerify.verifyInfoAboutUs() );

        return this;
    }
}
