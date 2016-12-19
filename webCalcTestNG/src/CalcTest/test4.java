package CalcTest;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObg.PageObg;

import static org.testng.Assert.assertEquals;


public class test4
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
    @BeforeMethod
    public void ref()
    {
        page.refresh();
    }



    @Test
    public void dev1()
    {
        page.getBt2().click();
        page.getUm().click();
        page.getBt2().click();
        page.getRav().click();

        String act = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("4", act);
    }

    @Test
    public void dev2()
    {
        page.getBt2().click();
        page.getSum().click();
        page.getBt2().click();
        page.getRav().click();

        String act = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("4", act);
    }

    @Test
    public void dev3()
    {
        page.getBt2().click();
        page.getDel().click();
        page.getBt2().click();
        page.getRav().click();

        String act = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("1", act);
    }

    @Test
    public void dev4()
    {
        page.getBt2().click();
        page.getMin().click();
        page.getBt2().click();
        page.getRav().click();

        String act = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("0", act);
    }

    @Test
    public void dev5()
    {
        page.getBt8().click();
        page.getBt8().click();
        page.getDel().click();
        page.getBt2().click();
        page.getRav().click();

        String act = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("44", act);
    }

    @Test
    public void dev6()
    {
        page.getBt8().click();
        page.getBt8().click();
        page.getUm().click();
        page.getBt2().click();
        page.getRav().click();

        String act = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("176", act);
    }

    @Test
    public void dev7()
    {
        page.getBt2().click();
        page.getBt2().click();
        page.getBt2().click();
        page.getSum().click();
        page.getBt3().click();
        page.getBt5().click();
        page.getBt5().click();
        page.getRav().click();

        String act = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("577", act);
    }

    @Test
    public void dev8()
    {
        page.getBt5().click();
        page.getBt3().click();
        page.getBt4().click();
        page.getMin().click();
        page.getBt4().click();
        page.getBt3().click();
        page.getBt5().click();
        page.getRav().click();

        String act = driver.findElement(By.id("txt")).getAttribute("value");
        assertEquals("99", act);
    }

    @Test
    public void dev9()
        {
            page.getBt0().click();
            page.getBt0().click();
            page.getBt3().click();
            page.getSum().click();
            page.getBt2().click();
            page.getBt0().click();
            page.getBt0().click();
            page.getRav().click();

            String act = driver.findElement(By.id("txt")).getAttribute("value");
            assertEquals("203", act);
        }

    @Test
    public void dev10()
    {
            page.getBt2().click();
            page.getDel().click();
            page.getBt0().click();
            page.getRav().click();

        Alert alert = driver.switchTo().alert();
        System.out.println("divide by zero" + alert.getText());
        alert.accept();
    }



}
