package PageObg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObg
{
    private WebDriver driver = null;

    @FindBy(id = "btn1")
    public WebElement bt1;

    @FindBy(id = "btn2")
    public WebElement bt2;

    @FindBy(id = "btn3")
    public WebElement bt3;

    @FindBy(id = "btn4")
    public WebElement bt4;

    @FindBy(id = "btn5")
    public WebElement bt5;

    @FindBy(id = "btn6")
    public WebElement bt6;

    @FindBy(id = "btn7")
    public WebElement bt7;

    @FindBy(id = "btn8")
    public WebElement bt8;

    @FindBy(id = "btn9")
    public WebElement bt9;

    @FindBy(id = "btn0")
    public WebElement bt0;

    @FindBy(id = "btnC")
    public WebElement btC;

    @FindBy(id = "btn=")
    public WebElement rav;

    @FindBy(id = "btn+")
    public WebElement sum;

    @FindBy(id = "btn-")
    public WebElement min;

    @FindBy(id = "btn*")
    public WebElement um;

    @FindBy(id = "btn/")
    public WebElement del;

    @FindBy(id = "txt")
    public WebElement txt;



    public PageObg(WebDriver driver)
    {
        this.driver = driver;
        this.driver.get("file:///D:/Users/ed/Desktop/Files/Calc/calc.html");
        PageFactory.initElements(this.driver, this);
    }

    public void  refresh()
    {
        this.driver.navigate().refresh();
        PageFactory.initElements(this.driver, this);
    }


    public WebElement getBt0 ()
        {
            return bt0;
        }

    public WebElement getBt1() {
        return bt1;
    }

    public WebElement getBt2() {
        return bt2;
    }

    public WebElement getBt3() {
        return bt3;
    }

    public WebElement getBt4() {
        return bt4;
    }

    public WebElement getBt5() {
        return bt5;
    }

    public WebElement getBt6() {
        return bt6;
    }

    public WebElement getBt7() {
        return bt7;
    }

    public WebElement getBt8() {
        return bt8;
    }

    public WebElement getBt9() {
        return bt9;
    }

    public WebElement getSum() {
        return sum;

    }

    public WebElement getMin() {
        return min;
    }

    public WebElement getDel() {
        return del;
    }

    public WebElement getUm() {
        return um;
    }

    public WebElement getRav() {
        return rav;
    }

    public WebElement getTxt() {
        return txt;
    }

    public WebElement getBtC()
    {
        return btC;
    }
}
