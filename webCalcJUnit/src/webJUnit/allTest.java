package webJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;



/**
 * класс для параметрического запуска тестов
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ test1.class,test2.class,test3.class,test4.class })
public class allTest {
}
