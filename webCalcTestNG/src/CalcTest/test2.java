package CalcTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObg.PageObg;


public class test2
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
    public void bt1Click() {
        page.getBt1().click();
    }
    @Test
    public void bt2Click()
    {
        page.getBt2().click();
    }
    @Test
    public void bt3Click()
    {
        page.getBt3().click();
    }
    @Test
    public void bt4Click()
    {
        page.getBt4().click();
    }
    @Test
    public void bt5Click()
    {
        page.getBt5().click();
    }
    @Test
    public void bt6Click()
    {
        page.getBt6().click();
    }
    @Test
    public void bt7Click()
    {
        page.getBt7().click();
    }
    @Test
    public void bt8Click()
    {
        page.getBt8().click();
    }
    @Test
    public void bt9Click()
    {
        page.getBt9().click();
    }
    @Test
    public void bt0Click()
    {
        page.getBt0().click();
    }

    @Test
    public void sumClick()
    {
        page.getSum().click();
    }
    @Test
    public void minClick()
    {
        page.getMin().click();
    }
    @Test
    public void delClick()
    {
        page.getDel().click();
    }
    @Test
    public void umClick()
    {
        page.getUm().click();
    }
    @Test
    public void ravClick()
    {
        page.getRav().click();
    }
    @Test
    public void btcClick()
    {
        page.getBtC().click();
    }

}