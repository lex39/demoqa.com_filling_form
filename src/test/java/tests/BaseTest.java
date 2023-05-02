package tests;

import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;

public class BaseTest {
  @BeforeAll
  static void beforeAll() {
    Configuration.browserSize = "1920x1080";
    Configuration.baseUrl = "https://demoqa.com";
  }
}
