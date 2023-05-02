package tests;

import com.github.javafaker.Faker;
import pages.RegistrationPage;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

public class RegistrationPageFillingFormTest extends BaseTest {

  RegistrationPage registrationPage = new RegistrationPage();
  Faker faker = new Faker();

  @Test
  public void fillFormTest() {

    registrationPage.openPage();

    registrationPage
            .setFirstName(faker.name().firstName())
            .setLastName(faker.name().lastName())
            .setUserEmail(faker.internet().emailAddress())
            .setUserNumber(faker.number().digits(10))
            .setGander();

    registrationPage.calendar.setDate("22", "3", "1987" );

    registrationPage
            .setSubjects("Maths")
            .hobbiesWrapper()
            .uploadPicture()
            .setCurrentAddress()
            .selectState()
            .selectCity()
            .clickSubmitButton();

    $(".modal-title").shouldHave(text("Thanks for submitting the form"));
  }
}
