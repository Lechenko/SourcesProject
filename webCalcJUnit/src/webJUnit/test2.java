package webJUnit;



import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Yura on 23.05.2016.
 * Проверка элементов на клик
 */
public class test2 {
    public static WebDriver driver = null;

    @BeforeClass
    public  static void startUP(){
        driver = new FirefoxDriver();
        driver.get("file:///D:/Users/ed/Desktop/Files/Calc/calc.html");
    }
    @Before
    public void refresh(){
    driver.navigate().refresh();
}

    @AfterClass
    public static void ref(){

        driver.close();
        driver = null;
    }

    @Test
    public void bt1(){
        driver.findElement(By.id("btn1")).click();
    }

    @Test
    public void bt2(){
        driver.findElement(By.id("btn2")).click();
    }
    @Test
    public void bt3(){
        driver.findElement(By.id("btn3")).click();
    }
    @Test
    public void bt4(){
        driver.findElement(By.id("btn4")).click();
    }

    @Test
    public void bt5(){
        driver.findElement(By.id("btn5")).click();
    }
    @Test
    public void bt6(){
        driver.findElement(By.id("btn6")).click();
    }
    @Test
    public void bt7(){
        driver.findElement(By.id("btn7")).click();
    }

    @Test
    public void bt8(){
        driver.findElement(By.id("btn8")).click();
    }
    @Test
    public void bt9(){
        driver.findElement(By.id("btn9")).click();
    }
    @Test
    public void bt0(){
        driver.findElement(By.id("btn0")).click();
    }

    @Test
    public void bt_um(){
        driver.findElement(By.id("btn*")).click();
    }
    @Test
    public void bt_del(){
        driver.findElement(By.id("btn/")).click();
    }
    @Test
    public void bt_plus(){
        driver.findElement(By.id("btn+")).click();
    }

    @Test
    public void bt_minus(){
        driver.findElement(By.id("btn-")).click();
    }
    @Test
    public void btC(){
        driver.findElement(By.id("btnC")).click();
    }
    @Test
    public void bt_res(){
        driver.findElement(By.id("btn=")).click();
    }

}
