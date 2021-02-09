package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioAndRemoteControllerTest {

	@Test
	public void switchCurrentStation0Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(1, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation4Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(4);
		radioAndRemoteController.switchStationsForward();
		assertEquals(5, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation8Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(8);
		radioAndRemoteController.switchStationsForward();
		assertEquals(9, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation9Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(9);
		radioAndRemoteController.switchStationsForward();
		assertEquals(0, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation9Back() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(9);
		radioAndRemoteController.switchStationsBack();
		assertEquals(8, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation0Back() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(0);
		radioAndRemoteController.switchStationsBack();
		assertEquals(9, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation1Back() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(1);
		radioAndRemoteController.switchStationsBack();
		assertEquals(0, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation6Back() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(6);
		radioAndRemoteController.switchStationsBack();
		assertEquals(5, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStationMinus1() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(-1);
		assertEquals(0, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation0() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(0);
		assertEquals(0, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation5() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(5);
		assertEquals(5, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation9() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(9);
		assertEquals(9, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation10() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(10);
		assertEquals(0, radioAndRemoteController.getCurrentStation());
	}

    @Test
	public void setCurrentSoundMinus1() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(-1);
		assertEquals(0, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void setCurrentSound0() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(0);
		assertEquals(0, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void setCurrentSound1() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(1);
		assertEquals(1, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void setCurrentSound5() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(5);
		assertEquals(5, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void setCurrentSound10() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(10);
		assertEquals(10, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void setCurrentSound11() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(11);
		assertEquals(10, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound0() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(0);
		radioAndRemoteController.increaseCurrentSound();
		assertEquals(1, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound5() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(5);
		radioAndRemoteController.increaseCurrentSound();
		assertEquals(6, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound9() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(9);
		radioAndRemoteController.increaseCurrentSound();
		assertEquals(10, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound10() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(10);
		radioAndRemoteController.increaseCurrentSound();
		assertEquals(10, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound10() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(10);
		radioAndRemoteController.decreaseCurrentSound();
		assertEquals(9, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound9() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(9);
		radioAndRemoteController.decreaseCurrentSound();
		assertEquals(8, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound5() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(5);
		radioAndRemoteController.decreaseCurrentSound();
		assertEquals(4, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound0() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(0);
		assertEquals(0, radioAndRemoteController.getCurrentSound());
	}
}