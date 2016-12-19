package CalcTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObg.PageObg;

import static org.testng.Assert.assertEquals;


public class test3
{
    WebDriver driver = null;
    PageObg page = null;

    @BeforeClass
    public  void setUp()
    {
        driver = new FirefoxDriver();
        page = new PageObg(driver);
    }

    @AfterClass
    public void setDown()
    {
        driver.close();
        driver = null;
    }

    @Test
    public void dev1()
    {
        page.getBt1().click();//1
        page.getBt1().click();//2
        page.getBt1().click();//3
        page.getBt1().click();//4
        page.getBt1().click();//5
        page.getBt1().click();//6
        page.getBt1().click();//7
        page.getBt1().click();//8
        page.getBt1().click();//9
        page.getBt1().click();//10
        page.getBt1().click();//11
        page.getBt1().click();//12
        page.getBt1().click();//13
        page.getBt1().click();//14
        page.getBt1().click();//15
        page.getBt1().click();//16
        page.getBt1().click();//17
        page.getBt1().click();//18
        page.getBt1().click();//19
        page.getBt1().click();//20
        page.getBt1().click();//21
        page.getBt1().click();//22
        page.getBt1().click();//23
        page.getBt1().click();//24
        page.getBt1().click();//25

        String act = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("1111111111111111111111111", act);
    }
    @Test
    public void dev2(){
        page.getBt0();
        page.getBt0();
        page.getBt0();
        page.getBt1();
        page.getBt1();
        page.getBt1();
        page.getBt2();
        page.getBt2();
        page.getBt2();
        page.getBt3();
        page.getBt3();
        page.getBt3();
        page.getBt4();
        page.getBt4();
        page.getBt4();
        page.getBt5();
        page.getBt5();
        page.getBt5();
        page.getBt6();
        page.getBt6();
        page.getBt6();
        page.getBt7();
        page.getBt7();
        page.getBt7();
        page.getBt8();
        page.getBt8();
        page.getBt8();
        page.getBt9();
        page.getBt9();
        page.getBt9();

        String act = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("000111222333444555666777888999", act);
    }
}
