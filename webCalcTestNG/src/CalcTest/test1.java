package CalcTest;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObg.PageObg;

import static org.testng.Assert.assertTrue;


public class test1
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
    public void testBtn0()
    {
        assertTrue(page.getBt0() != null);
    }

    @Test
    public void testBtn1()
    {
        assertTrue(page.getBt1() != null);
    }

    @Test
    public void testBtn2()
    {
        assertTrue(page.getBt2() != null);
    }

    @Test
    public void testBtn3()
    {
        assertTrue(page.getBt3() != null);
    }

    @Test
    public void testBtn4()
    {
        assertTrue(page.getBt4() != null);
    }

    @Test
    public void testBtn5()
    {
        assertTrue(page.getBt5() != null);
    }

    @Test
    public void testBtn6()
    {
        assertTrue(page.getBt6() != null);
    }

    @Test
    public void testBtn7()
    {
        assertTrue(page.getBt7() != null);
    }

    @Test
    public void testBtn8()
    {
        assertTrue(page.getBt8() != null);
    }

    @Test
    public void testBtn9()
    {
        assertTrue(page.getBt9() != null);
    }

    @Test
    public void testSum()
    {
        assertTrue(page.getSum() != null);
    }

    @Test
    public void testMin()
    {
        assertTrue(page.getMin() != null);
    }

    @Test
    public void testDel()
    {
        assertTrue(page.getDel() != null);
    }

    @Test
    public void testUm()
    {
        assertTrue(page.getUm() != null);
    }

    @Test
    public void testRav()
    {
        assertTrue(page.getRav() != null);
    }

    @Test
    public void testBtC()
    {
        assertTrue(page.getBtC() != null);
    }

    @Test
    public void testTxt()
    {
        assertTrue(page.getTxt() != null );
    }
}





