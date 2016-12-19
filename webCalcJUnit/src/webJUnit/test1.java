package webJUnit;



import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Yura on 23.05.2016.
 * Проверка элементов на Null
 */
public class test1 {

    public static  WebDriver driver = null;

  @BeforeClass
    public static void startUP(){
      driver = new FirefoxDriver();
      driver.get("file:///D:/Users/ed/Desktop/Files/Calc/calc.html");
  }

  @AfterClass
    public static void setdown() {
      driver.close();
      driver = null;
  }

    @Test
    public void btn1(){
        Assert.assertNotNull(driver.findElement(By.id("btn1")));
    }

    @Test
    public void btn2(){
        Assert.assertNotNull(driver.findElement(By.id("btn2")));
    }

    @Test
    public void btn3(){
        Assert.assertNotNull(driver.findElement(By.id("btn3")));
    }

    @Test
    public void btn4(){
        Assert.assertNotNull(driver.findElement(By.id("btn4")));
    }

    @Test
    public void btn5(){
        Assert.assertNotNull(driver.findElement(By.id("btn5")));
    }

    @Test
    public void btn6(){
        Assert.assertNotNull(driver.findElement(By.id("btn6")));
    }

    @Test
    public void btn7(){
        Assert.assertNotNull(driver.findElement(By.id("btn7")));
    }

    @Test
    public void btn8(){
        Assert.assertNotNull(driver.findElement(By.id("btn8")));
    }

    @Test
    public void btn9(){
        Assert.assertNotNull(driver.findElement(By.id("btn9")));
    }

    @Test
    public void btn0(){
        Assert.assertNotNull(driver.findElement(By.id("btn0")));
    }

    @Test
    public void btn_plus(){
        Assert.assertNotNull(driver.findElement(By.id("btn+")));
    }

    @Test
    public void btn_minus(){
        Assert.assertNotNull(driver.findElement(By.id("btn-")));
    }

    @Test
    public void btn_um(){
        Assert.assertNotNull(driver.findElement(By.id("btn*")));
    }

    @Test
    public void btn_del(){
        Assert.assertNotNull(driver.findElement(By.id("btn/")));
    }

    @Test
    public void btn_c(){
        Assert.assertNotNull(driver.findElement(By.id("btnC")));
    }

    @Test
    public void btn_res(){
        Assert.assertNotNull(driver.findElement(By.id("btn=")));
    }
    @Test
    public void txt(){
        Assert.assertNotNull(driver.findElement(By.id("txt")));
    }
}

