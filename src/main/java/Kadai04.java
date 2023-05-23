import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Kadai04 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 指定したURLをブラウザで開く
        driver.get("https://abcc-gw.asojuku.ac.jp/azcafe/login");
        /*
        ログインページ
         */
        driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("9999999@s.asojuku.ac.jp");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[3]/input")).sendKeys("9999999");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();

        /*
        ホームページ
         */
        // ハンバーガーメニューが表示されるまで待つ
        WebElement hamburgerMenu = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/ul[1]/li/a")));
        // ハンバーガーメニューをクリック
        hamburgerMenu.click();
        WebElement searchAssignment = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/aside[1]/div/div[4]/div/div/nav/ul/li[3]/a")));
        // 問題検索ボタンをクリック
        searchAssignment.click();

        /**
         * 問題検索ページ
         */

        WebElement searchBox = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"example1_filter\"]/label/input")));
        searchBox.sendKeys("JSS-JK27-03");

        driver.findElement(By.xpath("//*[@id=\"example1\"]/tbody/tr/td[2]/a")).click();

    }
}