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
		radioAndRemoteController.switchStationsForward();
		radioAndRemoteController.switchStationsForward();
		radioAndRemoteController.switchStationsForward();
		radioAndRemoteController.switchStationsForward();
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
		assertEquals(0, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation0Back() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentStation(8);
		radioAndRemoteController.switchStationsForward();
		assertEquals(9, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation1Back() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
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
		radioAndRemoteController.setCurrentStation(9);
		assertEquals(9, radioAndRemoteController.getCurrentStation());
	}


	@Test
	public void increaseCurrentSound0() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.increaseCurrentSound();
		assertEquals(1, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void increaseCurrentSound5() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(6);
		radioAndRemoteController.increaseCurrentSound();
		assertEquals(6, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound10() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(9);
		radioAndRemoteController.decreaseCurrentSound();
		assertEquals(9, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound9() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(8);
		radioAndRemoteController.decreaseCurrentSound();
		assertEquals(8, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound5() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(4);
		radioAndRemoteController.decreaseCurrentSound();
		assertEquals(4, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void decreaseCurrentSound0() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound(0);
		radioAndRemoteController.decreaseCurrentSound();
		assertEquals(0, radioAndRemoteController.getCurrentSound());
	}
}