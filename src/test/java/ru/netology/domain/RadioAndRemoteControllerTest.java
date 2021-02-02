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
}
//
//
//
//	@Test
//	public void makeMinSoundLouder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(1, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound1Louder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(2, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound2Louder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(3, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound3Louder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(4, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound4Louder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(5, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound5Louder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(6, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound6Louder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(7, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound7Louder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(8, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound8Louder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(9, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound9Louder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(10, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeMaxSoundLouder() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundLouder();
//		assertEquals(10, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeMaxSoundDown() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(9, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound9Down() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(8, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound8Down() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(7, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound7Down() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(6, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound6Down() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(5, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound5Down() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(4, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound4Down() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(3, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound3Down() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(2, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound2Down() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(1, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeCurrentSound1Down() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(0, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void makeMinSoundDown() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.makeCurrentSoundDown();
//		assertEquals(0, radioAndRemoteController.getCurrentSound());
//	}
//}
