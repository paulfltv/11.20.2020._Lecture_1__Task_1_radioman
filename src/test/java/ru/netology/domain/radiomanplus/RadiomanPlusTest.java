package ru.netology.domain.radiomanplus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanPlusTest {
	RadiomanPlus radiomanPlus = new RadiomanPlus();

	@Test
	public void switchCurrentStation0Forward() {
		radiomanPlus.switchStationsForward();
		assertEquals(1, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation4Forward() {
		radiomanPlus.setCurrentStation(4);
		radiomanPlus.switchStationsForward();
		assertEquals(5, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation8Forward() {
		radiomanPlus.setCurrentStation(8);
		radiomanPlus.switchStationsForward();
		assertEquals(9, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation9Forward() {
		radiomanPlus.setCurrentStation(9);
		radiomanPlus.switchStationsForward();
		assertEquals(0, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation9Back() {
		radiomanPlus.setCurrentStation(9);
		radiomanPlus.switchStationsBack();
		assertEquals(8, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation0Back() {
		radiomanPlus.setCurrentStation(0);
		radiomanPlus.switchStationsBack();
		assertEquals(9, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation1Back() {
		radiomanPlus.setCurrentStation(1);
		radiomanPlus.switchStationsBack();
		assertEquals(0, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation6Back() {
		radiomanPlus.setCurrentStation(6);
		radiomanPlus.switchStationsBack();
		assertEquals(5, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchStationMinus1() {
		radiomanPlus.setCurrentStation(-1);
		assertEquals(0, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchStation0() {
		radiomanPlus.setCurrentStation(0);
		assertEquals(0, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchStation5() {
		radiomanPlus.setCurrentStation(5);
		assertEquals(5, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchStation9() {
		radiomanPlus.setCurrentStation(9);
		assertEquals(9, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchStation10() {
		radiomanPlus.setCurrentStation(10);
		assertEquals(0, radiomanPlus.getCurrentStation());
	}

	@Test
	public void setCurrentSoundMinus1() {
		radiomanPlus.setCurrentSound(-1);
		assertEquals(0, radiomanPlus.getCurrentSound());
	}

	@Test
	public void setCurrentSound0() {
		radiomanPlus.setCurrentSound(0);
		assertEquals(0, radiomanPlus.getCurrentSound());
	}

	@Test
	public void setCurrentSound1() {
		radiomanPlus.setCurrentSound(1);
		assertEquals(1, radiomanPlus.getCurrentSound());
	}

	@Test
	public void setCurrentSound5() {
		radiomanPlus.setCurrentSound(5);
		assertEquals(5, radiomanPlus.getCurrentSound());
	}

	@Test
	public void setCurrentSound10() {
		radiomanPlus.setCurrentSound(100);
		assertEquals(100, radiomanPlus.getCurrentSound());
	}

	@Test
	public void setCurrentSound101() {
		radiomanPlus.setCurrentSound(100);
		assertEquals(100, radiomanPlus.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound0() {
		radiomanPlus.setCurrentSound(0);
		radiomanPlus.increaseCurrentSound();
		assertEquals(1, radiomanPlus.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound5() {
		radiomanPlus.setCurrentSound(5);
		radiomanPlus.increaseCurrentSound();
		assertEquals(6, radiomanPlus.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound99() {
		radiomanPlus.setCurrentSound(99);
		radiomanPlus.increaseCurrentSound();
		assertEquals(100, radiomanPlus.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound100() {
		radiomanPlus.setCurrentSound(100);
		radiomanPlus.increaseCurrentSound();
		assertEquals(100, radiomanPlus.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound100() {
		radiomanPlus.setCurrentSound(100);
		radiomanPlus.decreaseCurrentSound();
		assertEquals(99, radiomanPlus.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound99() {
		radiomanPlus.setCurrentSound(99);
		radiomanPlus.decreaseCurrentSound();
		assertEquals(98, radiomanPlus.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound5() {
		radiomanPlus.setCurrentSound(5);
		radiomanPlus.decreaseCurrentSound();
		assertEquals(4, radiomanPlus.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound0() {
		radiomanPlus.setCurrentSound(0);
		assertEquals(0, radiomanPlus.getCurrentSound());
	}



	@Test
	public void setQuantityStations9() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(9);
		radiomanPlus.setLastStation(9);
		assertEquals(9, radiomanPlus.getLastStation());
	}

	@Test
	public void setQuantityStations11() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(11);
		radiomanPlus.setLastStation(11);
		assertEquals(11, radiomanPlus.getLastStation());
	}
}