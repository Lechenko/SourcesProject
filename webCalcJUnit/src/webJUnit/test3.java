package webJUnit;



import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yura on 23.05.2016.
 */
public class test3 {
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
    public void test1(){
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("111",str);
    }



    @Test
    public void test2(){
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn1")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("001",str);
    }
    @Test
    public void test3(){
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("btn3")).click();
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btn6")).click();
        driver.findElement(By.id("btn7")).click();
        driver.findElement(By.id("btn8")).click();
        driver.findElement(By.id("btn9")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("0123456789",str);
    }
    @Test
    public void test4(){
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn8")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn9")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("btn3")).click();

        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("111111111122181151191423",str);
    }


    }

