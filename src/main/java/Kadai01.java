import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kadai01 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // 指定したURLをブラウザで開く
        driver.get("https://www.google.com/");
        // 検索バーに文字列を入力
        driver.findElement(By.id("APjFqb")).sendKeys("犬　犬種");
        //　Enterを押下
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

    }
}
