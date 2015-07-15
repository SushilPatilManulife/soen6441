package unittests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BoardTest.class, DedicationTokensTest.class,
		FavorTokensTest.class, GameEngineTest.class, LakeTileTest.class,
		LanternApplicationTest.class, LanternCardsTest.class, PlayerTest.class })
public class AllTests {

}