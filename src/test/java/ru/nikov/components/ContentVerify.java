package ru.nikov.components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ContentVerifyModal {

    public void verifyHeaderMenuContent() {
        $("div",2 ).shouldHave(Condition.text("Карьера"), Condition.text("Пресс центр"),
                Condition.text("Контакты"));
    }

    public void verifyRequestFormExistOnMainPage() {
       $(".main-page-form").scrollIntoView(false);
    }

    public void verifySearchSupportInputVisible() {
        $("#help_search_support_input").shouldBe(Condition.visible);
    }

    public void verifyEkbContacts() {
        $("#bx_3218110189_2512").shouldHave( Condition.text("Екатеринбург Адрес 620026, Екатеринбург  ул. Энгельса, 36 Телефон/факс +7 (343) 216-16-30 Email info@hostco.ru"));
    }

    public void verifyKurganContacts() {
        $(byText("Курган")).click();
        $("#bx_3218110189_2516").shouldHave( Condition.text("Курган Адрес 640007, Курган ул. Блюхера, 30в Телефон/факс +7 (3522) 63-08-93 Email info@hostco.ru"));
    }

    public void verifySubscribeForm() {
        $("#modal-header").shouldHave(Condition.text("Подписка"));
    }

    public void verifyLanguageContentResult(String expectedResult) {
        $(".header_installsteam_btn_content").shouldHave(Condition.text(expectedResult));
    }

    public void verifyGameRemoveFromCart() {
        $(".cart_status_message").shouldHave(Condition.text("Your item has been removed!"));
    }
}
