package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
  private final SelenideElement
          firstName = $("#firstName"),
          lastName = $("#lastName"),
          userEmail = $("#userEmail"),
          userNumber = $("#userNumber"),
          radioBtnGender = $("#genterWrapper"),
          hobbiesWrapper = $("#hobbiesWrapper"),
          subjectInput = $("#subjectsInput"),
          uploadPicture = $("#uploadPicture"),
          currentAddress = $("#currentAddress"),
          selectState = $("#stateCity-wrapper"),
          selectCity = $("#stateCity-wrapper"),
          submitButton = $("#submit");
  public CalendarComponent calendar = new CalendarComponent();

public void openPage() {
  open("/automation-practice-form");
}

public RegistrationPage setFirstName(String value) {
  firstName.setValue(value);
  return this;
}

  public RegistrationPage setLastName(String value) {
    lastName.setValue(value);
    return this;
  }

  public RegistrationPage setUserEmail(String value) {
    userEmail.setValue(value);
    return this;
  }

  public RegistrationPage setUserNumber(String value) {
    userNumber.setValue(value);
    return this;
  }

  public void setGander() {
    radioBtnGender.$(byText("Male")).click();
  }

  public RegistrationPage setSubjects(String value) {
    subjectInput.setValue(value).pressEnter();
    return this;
  }

  public RegistrationPage hobbiesWrapper() {
    hobbiesWrapper.$(byText("Music")).click();
    return this;
  }

  public RegistrationPage uploadPicture() {
    uploadPicture.uploadFromClasspath("img/test.png");
    return this;
  }

  public RegistrationPage setCurrentAddress() {
    currentAddress.setValue("Москва, ул. Пушкина, дом Колотушкина");
    return this;
  }

  public RegistrationPage selectState() {
    $("#state").scrollTo().click();
    selectState.$(byText("Haryana")).click();
    return this;
  }

  public RegistrationPage selectCity() {
    $("#city").click();
    selectCity.$(byText("Karnal")).click();
    return this;
  }

  public void clickSubmitButton() {
    submitButton.click();
  }
}
