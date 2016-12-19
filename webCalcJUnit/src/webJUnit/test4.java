package webJUnit;



import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yura on 23.05.2016.
 * Основные функции калькулятора
 */
public class test4 {
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
    public void test1_plus(){
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn+")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("2",str);
    }
    @Test
    public void test2_plus(){
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn+")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("20",str);
    }
    @Test
    public void test3_plus(){
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn+")).click();
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("2",str);
    }
    @Test
    public void test4_plus(){
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn+")).click();
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("665",str);
    }

    @Test
    public void test5_plus(){
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn+")).click();
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("6650",str);
    }

    @Test
    public void test1_minus(){
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn-")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("-1",str);
    }

    @Test
    public void test2_minus(){
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn-")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("40",str);
    }

    @Test
    public void test3_minus(){
        driver.findElement(By.id("btn5")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn-")).click();
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn9")).click();
        driver.findElement(By.id("btn9")).click();
        driver.findElement(By.id("btn9")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("1",str);
    }

    @Test
    public void test4_minus(){
        driver.findElement(By.id("btn3")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn-")).click();
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn9")).click();
        driver.findElement(By.id("btn9")).click();
        driver.findElement(By.id("btn9")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("-1999",str);
    }

    @Test
    public void test1_um(){
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("btn*")).click();
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("4",str);
    }

    @Test
    public void test2_um(){
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn3")).click();
        driver.findElement(By.id("btn*")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("0",str);
    }

    @Test
    public void test3_um(){
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn*")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("0",str);
    }

    @Test
    public void test4_um(){
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn*")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("616",str);
    }
	
    //Проверка деления на ноль
    @Test
    public void test1_del(){
        driver.findElement(By.id("btn2")).click();
        driver.findElement(By.id("btn/")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn=")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("divide by zero" + alert.getText());
        alert.accept();
    }

    @Test
    public void test2_del(){
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn/")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn0")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("4",str);
    }

    @Test
    public void test3_del(){
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn/")).click();
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("btn4")).click();
        driver.findElement(By.id("btn=")).click();
        String str = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("3.142857142857143",str);
    }
}
