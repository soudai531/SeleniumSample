import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReserveConfirmPage {
    private WebDriver driver;

    public ReserveConfirmPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPrice() {
        return driver.findElement(By.id("price")).getText();
    }

    public void commit() {
        driver.findElement(By.id("commit")).click();
    }
}
