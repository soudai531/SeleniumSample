import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.io.IO;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class Kadai02 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // 指定したURLをブラウザで開く
        driver.get("https://form.run/@nishino-1649647518");
        driver.findElement(By.id("_field_1_name")).sendKeys("小道蒼大");
        driver.findElement(By.id("_field_2")).sendKeys("12345");
        driver.findElement(By.cssSelector(".sf-btn")).click();

        //スクリーンショットを保存
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        WebElement element = driver.findElement(By.id("sf-form-page"));
        File screenshot = element.getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(screenshot.toPath(), new File("C:/Users/ksou2/Pictures/test_result/" + screenshot.getName()).toPath());
        } catch(IOException e) {
            System.out.println("正しく保存できませんでした。");
        }

        // 社員IDの出力
        String employeeId = driver.findElement(By.id("_field_2")).getAttribute("value");
        System.out.println("社員ID：" + employeeId);

    }
}