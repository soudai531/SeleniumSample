import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.io.IO;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class Kadai03 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // 指定したURLをブラウザで開く
        driver.get("https://form.run/@nishino-1649647518");
        //名前,社員ID,文字入力
        driver.findElement(By.id("_field_1_name")).sendKeys("小道蒼大");
        driver.findElement(By.id("_field_2")).sendKeys("1234");

        //セレクトボックス選択
        Select select = new Select(driver.findElement(By.name("_field_9")));
        select.selectByValue("正社員");
        driver.findElement(By.id("_field_4")).sendKeys("プロダクトソリューション1部");

        // 星のクリック(xpath)
        driver.findElement(By.xpath("//*[@id=\"sf-form-elements\"]/div/div/div/div[1]/div[5]/div/div/div[2]/div[3]/label/span")).click();
        // selectorで指定
//        driver.findElement(By.cssSelector("#sf-form-elements > div > div > div > div.form-elements > div:nth-child(5) > div > div > div.sf-rating-wrapper.js-sf-rating-wrapper-_field_5 > div:nth-child(3) > label > span")).click();;
        // テキストエリアの入力
        driver.findElement(By.id("_field_6")).sendKeys("人事評価に不満があるから");
        driver.findElement(By.id("_field_7")).sendKeys("人事評価の透明化");
        driver.findElement(By.id("_field_8")).sendKeys("特になし");

        // サブミット
        driver.findElement(By.id("_field_8")).submit();
    }
}