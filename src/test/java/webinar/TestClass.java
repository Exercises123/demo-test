package webinar;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestClass {




    @Test
    void fillForm() {
        open("https://demoqa.com/automation-practice-form");

        $(".mr-sm-2.form-control").sendKeys("123Name");
        $("#lastName").sendKeys("LastName");
        $("#userNumber").sendKeys("1231231231");

    }

}
