import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

import org.junit.jupiter.api.Test;

class PracticeFormTests {

    @Test
    void searchSelenideGoogle() {
        open("https://www.google.com");

        $(byName("q")).val("Selenide").pressEnter();
        $("#rso a").shouldHave(href("https://ru.selenide.org/"));
    }

    @Test
    void searchSelenideYandex() {
        open("https://yandex.ru/");

        $("#text").val("Selenide").pressEnter();
        $("[data-cid='1'] a").shouldHave(href("https://ru.selenide.org/").because("We've found it"));
    }
}
