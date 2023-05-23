import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();

		WebDriver edgeDriver = new EdgeDriver();
		WebDriver chromedriver = new ChromeDriver();

//		WebDriver firefoxDriver = new FirefoxDriver();

		ArrayList<WebDriver> drivers = new ArrayList<>();
		drivers.add(edgeDriver);
		drivers.add(chromedriver);

//		firefoxDriver.get("https://www.google.com/");


		for(WebDriver driver : drivers) {
			// 指定したURLをブラウザで開く
			driver.get("http://example.selenium.jp/reserveApp");
			//　id属性がguestnameのMTML要素に入力
			driver.findElement(By.id("guestname")).sendKeys("サンプルユーザー");
			// id属性がgoto_nextの要素をクリック
			driver.findElement(By.id("goto_next")).click();
			// 閉じる
			driver.quit();
		}



	}
}
