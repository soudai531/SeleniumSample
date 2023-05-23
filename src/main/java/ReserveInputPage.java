import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = http://example.selenium.jp/reserveApp/
public class ReserveInputPage {
    private WebDriver driver;
    // 宿泊日テキストボックス
    @FindBy(name = "reserve_y")
    public WebElement reserveYear;
    @FindBy(name = "reserve_m")
    public WebElement reserveMonth;
    @FindBy(name = "reserve_d")
    public WebElement reserveDay;
    // 泊数テキストボックス
    @FindBy(name = "reserve_t")
    public WebElement reserveTerm;
    // 人数
    @FindBy(id = "headcount")
    public WebElement headCount;
    //朝食バイキングラジオボタン
    @FindBy(id = "breakfast_on")
    public WebElement breakfastOn;
    @FindBy(id = "breakfast_off")
    public WebElement breakfastOff;
    // プランチェックボックス
    @FindBy(name = "plan_a")
    public WebElement earlyCheckInPlan;
    @FindBy(name = "plan_b")
    public WebElement sightseeingPlan;
    // 名前テキストボックス
    @FindBy(name = "gname")
    public WebElement guestName;
    // 次のページボタン
    @FindBy(name = "goto_next")
    public WebElement goToNextButton;

    public ReserveInputPage(WebDriver driver) {
        this.driver = driver;
    }

    public ReserveConfirmPage goToNext() {
        goToNextButton.click();
        return PageFactory.initElements(driver, ReserveConfirmPage.class);
    }
}
