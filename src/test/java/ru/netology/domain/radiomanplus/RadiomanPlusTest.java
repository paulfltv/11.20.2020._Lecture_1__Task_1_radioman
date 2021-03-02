package ru.netology.domain.radiomanplus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadiomanPlusTest {

	@Test
	public void switchCurrentStation0Forward() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 10, 0, 0, 100);
		radiomanPlus.switchStationsForward();
		assertEquals(1, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation4Forward() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(4, 0, 10, 0, 0, 100);
		radiomanPlus.switchStationsForward();
		assertEquals(5, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation9Forward() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(9, 0, 10, 0, 0, 100);
		radiomanPlus.switchStationsForward();
		assertEquals(10, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchLastStationForward() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(10, 0, 10, 0, 0, 100);
		radiomanPlus.switchStationsForward();
		assertEquals(0, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchFirstStationBack() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 10, 0, 0, 100);
		radiomanPlus.switchStationsBack();
		assertEquals(10, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation1Back() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(1, 0, 10, 0, 0, 100);
		radiomanPlus.switchStationsBack();
		assertEquals(0, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation6Back() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(6, 0, 10, 0, 0, 100);
		radiomanPlus.switchStationsBack();
		assertEquals(5, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchCurrentStation9Back() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(9, 0, 10, 0, 0, 100);
		radiomanPlus.switchStationsBack();
		assertEquals(8, radiomanPlus.getCurrentStation());
	}

	@Test
	public void switchLastStationBack() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(10, 0, 10, 0, 0, 100);
		radiomanPlus.switchStationsBack();
		assertEquals(9, radiomanPlus.getCurrentStation());
	}

	@Test
	public void setFirstStation() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 10, 0, 0, 100);
		radiomanPlus.setFirstStation(0);
		assertEquals(0, radiomanPlus.getFirstStation());
	}

	@Test
	public void setStation5() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(5, 0, 10, 0, 0, 100);
		assertEquals(5, radiomanPlus.getCurrentStation());
	}

	@Test
	public void setLastStation() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 10, 0, 0, 100);
		radiomanPlus.setLastStation(10);
		assertEquals(10, radiomanPlus.getLastStation());
	}

	@Test
	public void setStationMinus1() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 10, 0, 0, 100);
		radiomanPlus.setCurrentStation(-1);
		assertEquals(0, radiomanPlus.getCurrentStation());
	}

	@Test
	public void setStation11() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(10, 0, 10, 0, 0, 100);
		radiomanPlus.setCurrentStation(11);
		assertEquals(10, radiomanPlus.getLastStation());
	}

	@Test
	public void setLastStation9() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 9, 0, 0, 100);
		radiomanPlus.setLastStation(9);
		assertEquals(9, radiomanPlus.getLastStation());
	}

	@Test
	public void setLastStation99() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 99, 0, 0, 100);
		radiomanPlus.setLastStation(99);
		assertEquals(99, radiomanPlus.getLastStation());
	}

	@Test
	public void setLastStation999() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 999, 0, 0, 100);
		radiomanPlus.setLastStation(999);
		assertEquals(999, radiomanPlus.getLastStation());
	}

	@Test
	public void setMinSound() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 100);
		radiomanPlus.setMinSound(0);
		assertEquals(0, radiomanPlus.getMinSound());
	}

	@Test
	public void setMaxSound() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 100);
		radiomanPlus.setMaxSound(100);
		assertEquals(100, radiomanPlus.getMaxSound());
	}

	@Test
	public void decreaseMinSound() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 100);
		radiomanPlus.decreaseCurrentSound();
		assertEquals(0, radiomanPlus.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound1() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(1, 0, 100);
		radiomanPlus.decreaseCurrentSound();
		assertEquals(0, radiomanPlus.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound50() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(50, 0, 100);
		radiomanPlus.decreaseCurrentSound();
		assertEquals(49, radiomanPlus.getCurrentSound());
	}

	@Test
	public void decreaseMaxSound() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(100, 0, 100);
		radiomanPlus.decreaseCurrentSound();
		assertEquals(99, radiomanPlus.getCurrentSound());
	}

	@Test
	public void increaseMinSound() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(0, 0, 100);
		radiomanPlus.increaseCurrentSound();
		assertEquals(1, radiomanPlus.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound50() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(50, 0, 100);
		radiomanPlus.increaseCurrentSound();
		assertEquals(51, radiomanPlus.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound99() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(99, 0, 100);
		radiomanPlus.increaseCurrentSound();
		assertEquals(100, radiomanPlus.getCurrentSound());
	}

	@Test
	public void increaseMaxSound() {
		RadiomanPlus radiomanPlus = new RadiomanPlus(100, 0, 100);
		radiomanPlus.increaseCurrentSound();
		assertEquals(100, radiomanPlus.getCurrentSound());
	}
}