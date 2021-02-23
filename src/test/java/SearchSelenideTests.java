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
}
