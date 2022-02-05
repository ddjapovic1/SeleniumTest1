package Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddToCartTest.class, FacebookTest.class, LoginTest.class, MyProfileTest.class, RegisterTest.class,
		RemoveProductTest.class, SearchTest.class, TotalPriceTest.class })
public class AllTests {

}
