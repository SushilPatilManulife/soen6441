package unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.xml.crypto.Data;

import org.junit.Test;

import eclipse_project.LakeTiles;
import eclipse_project.LanternCards;
import eclipse_project.Player;

public class LanternCardsTest {

	//Black Cards Start
	@Test
	public void testBlackColorCardsWhenAvailableForTwoPlayers() {
		
		LanternCards lc = new LanternCards(2);
			
		assertTrue(lc.getBlackCard());
	}
	
	@Test
	public void testBlackColorCardsWhenAvailableForThreePlayers() {
		
		LanternCards lc = new LanternCards(3);
			
		assertTrue(lc.getBlackCard());
	}
	
	@Test
	public void testBlackColorCardsWhenAvailableForFourPlayers() {
		
		LanternCards lc = new LanternCards(4);
			
		assertTrue(lc.getBlackCard());
	}

	@Test
	public void testBlackColorCardsWhenNotAvailableForThreePlayers() {
		
		LanternCards lc = new LanternCards(3);
			
		for(int i=0;i<10;i++)
			lc.getBlackCard();
		
		assertFalse(lc.getBlackCard());
	}
	
	@Test
	public void testAddBlackColorCards() {
		
		LanternCards lc = new LanternCards(3);
		
		for(int i=0;i<10;i++)
			lc.getBlackCard();
		
		lc.addBlackcard();
				
		assertTrue(lc.getBlackCard());
	}
	
	@Test
	public void testHasCards() {
		//
		LanternCards lc = new LanternCards(0, 1, 1, 1, 1, 1, 1, 1);
		
		// 
		assertTrue(lc.hasCard("redCard"));
		assertTrue(lc.hasCard("greenCard"));
		assertTrue(lc.hasCard("blueCard"));
		assertTrue(lc.hasCard("whiteCard"));
		assertTrue(lc.hasCard("orangeCard"));
		assertTrue(lc.hasCard("purpleCard"));
		assertTrue(lc.hasCard("blackCard"));
		assertFalse(lc.hasCard("unknownCard"));
	}
	
	@Test
	public void testHasCardsFalse() {
		//
		LanternCards lc = new LanternCards(0, 0, 0, 0, 0, 0, 0, 0);
		
		// 
		assertFalse(lc.hasCard("redCard"));
		assertFalse(lc.hasCard("greenCard"));
		assertFalse(lc.hasCard("blueCard"));
		assertFalse(lc.hasCard("whiteCard"));
		assertFalse(lc.hasCard("orangeCard"));
		assertFalse(lc.hasCard("purpleCard"));
		assertFalse(lc.hasCard("blackCard"));
	}
	
	@Test
	public void testAddCard() {
		//
		LanternCards lc = new LanternCards(0, 0, 0, 0, 0, 0, 0, 0);
		
		// 
		lc.addCard("redCard");
		lc.addCard("greenCard");
		lc.addCard("blueCard");
		lc.addCard("whiteCard");
		lc.addCard("orangeCard");
		lc.addCard("purpleCard");
		lc.addCard("blackCard");
		
		//
		assertTrue(lc.getCard("redCard"));
		assertTrue(lc.getCard("greenCard"));
		assertTrue(lc.getCard("blueCard"));
		assertTrue(lc.getCard("whiteCard"));
		assertTrue(lc.getCard("orangeCard"));
		assertTrue(lc.getCard("purpleCard"));
		assertTrue(lc.getCard("blackCard"));
	}
	
	@Test
	public void testGetCard() {
		//
		LanternCards lc = new LanternCards(0, 1, 1, 1, 1, 1, 1, 1);
		
		// 
		assertTrue(lc.getCard("redCard"));
		assertTrue(lc.getCard("greenCard"));
		assertTrue(lc.getCard("blueCard"));
		assertTrue(lc.getCard("whiteCard"));
		assertTrue(lc.getCard("orangeCard"));
		assertTrue(lc.getCard("purpleCard"));
		assertTrue(lc.getCard("blackCard"));
		assertFalse(lc.hasCard("unknownCard"));
		
		//
		assertFalse(lc.getCard("redCard"));
		assertFalse(lc.getCard("greenCard"));
		assertFalse(lc.getCard("blueCard"));
		assertFalse(lc.getCard("whiteCard"));
		assertFalse(lc.getCard("orangeCard"));
		assertFalse(lc.getCard("purpleCard"));
		assertFalse(lc.getCard("blackCard"));
	}
	
	@Test
	public void testNonZeroColors() {
		//
		LanternCards lc = new LanternCards(0, 1, 1, 0, 1, 0, 1, 1);
		
		// 
		assertTrue(lc.nonZeroColors() == 5);
	}
	
	@Test
	public void testColorsWithQuantity() {
		//
		LanternCards lc = new LanternCards(0, 3, 1, 0, 1, 0, 3, 1);
		
		// 
		assertTrue(lc.numColorsWithQuantity(3) == 2);
	}
	
	@Test
	public void testGetAll() {
		//
		LanternCards lc = new 		 LanternCards(0, 3, 1, 0, 1, 0, 3, 1);
		LanternCards target_lc = new LanternCards(0, 1, 2, 3, 4, 1, 1, 3);
		
		// 
		lc.getAll(target_lc);
		
		//
		assertTrue(lc.redCardCount() == 4);
		assertTrue(lc.greenCardCount() == 3);
		assertTrue(lc.blackCardCount() == 4);
		assertTrue(lc.whiteCardCount() == 5);
		assertTrue(lc.orangeCardCount() == 4);
		assertTrue(lc.purpleCardCount() == 1);
		assertTrue(lc.blackCardCount() == 4);
	}
}
