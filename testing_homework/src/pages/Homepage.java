package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{
        @FindBy(id = "homeButton")
        private WebElement homeButton;

        public HomePage(WebDriver driver) {
            super(driver);
        }

        public void goToHome() {
            click(homeButton);
        }
    }


