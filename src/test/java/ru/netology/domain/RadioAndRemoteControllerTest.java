package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioAndRemoteControllerTest {

	@Test
	public void switchCurrentStationForward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(9, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation9Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(0, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStation0Back() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsBack();
		assertEquals(9, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchCurrentStationBack() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsBack();
		assertEquals(0, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation5() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsBack();
		assertEquals(5, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation10() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsBack();
		assertEquals(9, radioAndRemoteController.getCurrentStation());
	}


//	@Test
//	public void makeCurrentSound9Louder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(10, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound1Down() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(0, radioAndRemoteController.getCurrentSound());
//	}

	@Test
	public void makeMaxSoundLouder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound();
		assertEquals(10, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeMintSoundDown() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.setCurrentSound();
		assertEquals(0, radioAndRemoteController.getCurrentSound());
	}
}
