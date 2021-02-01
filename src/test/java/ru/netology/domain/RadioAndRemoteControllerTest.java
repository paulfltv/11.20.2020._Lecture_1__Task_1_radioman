package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioAndRemoteControllerTest {

	@Test
	public void switchStation0Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(1, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation1Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(2, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation2Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(3, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation3Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(4, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation4Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(5, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation5Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(6, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation6Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(7, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation7Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(8, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation8Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(9, radioAndRemoteController.getCurrentStation());
	}

	@Test
	public void switchStation9Forward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.switchStationsForward();
		assertEquals(0, radioAndRemoteController.getCurrentStation());
	}


//	@Test
//	public void switchStation0Back() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.switchStation0Back();
//		assertEquals(9, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchStation1Back() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.switchStation1Back();
//		assertEquals(0, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchStation2Back() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.switchStation2Back();
//		assertEquals(1, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchStation3Back() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.switchStation3Back();
//		assertEquals(2, radioAndRemoteController.getCurrentStation());
//	}
//	@Test
//	public void switchStation4Back() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.switchStation4Back();
//		assertEquals(3, radioAndRemoteController.getCurrentStation());
//	}
//	@Test
//	public void switchStation5Back() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.switchStation5Back();
//		assertEquals(4, radioAndRemoteController.getCurrentStation());
//	}
//	@Test
//	public void switchStation6Back() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.switchStation6Back();
//		assertEquals(5, radioAndRemoteController.getCurrentStation());
//	}
//	@Test
//	public void switchStation7Back() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.switchStation7Back();
//		assertEquals(6, radioAndRemoteController.getCurrentStation());
//	}
//	@Test
//	public void switchStation8Back() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.switchStation8Back();
//		assertEquals(7, radioAndRemoteController.getCurrentStation());
//	}
//	@Test
//	public void switchStation9Back() {
//		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//		radioAndRemoteController.switchStation9Back();
//		assertEquals(8, radioAndRemoteController.getCurrentStation());
//	}


	@Test
	public void makeMinSoundLouder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeMinSoundLouder();
		assertEquals(1, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound1Louder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound1Louder();
		assertEquals(2, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound2Louder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound2Louder();
		assertEquals(3, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound3Louder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound3Louder();
		assertEquals(4, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound4Louder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound4Louder();
		assertEquals(5, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound5Louder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound5Louder();
		assertEquals(6, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound6Louder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound6Louder();
		assertEquals(7, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound7Louder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound7Louder();
		assertEquals(8, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound8Louder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound8Louder();
		assertEquals(9, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound9Louder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound9Louder();
		assertEquals(10, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeMaxSoundLouder() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeMaxSoundLouder();
		assertEquals(10, radioAndRemoteController.getCurrentSound());
	}

	@Test
	public void makeMaxSoundDown() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeMaxSoundDown();
		assertEquals(9, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound9Down() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound9Down();
		assertEquals(8, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound8Down() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound8Down();
		assertEquals(7, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound7Down() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound7Down();
		assertEquals(6, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound6Down() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound6Down();
		assertEquals(5, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound5Down() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound5Down();
		assertEquals(4, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound4Down() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound4Down();
		assertEquals(3, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound3Down() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound3Down();
		assertEquals(2, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound2Down() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound2Down();
		assertEquals(1, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeCurrentSound1Down() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeCurrentSound1Down();
		assertEquals(0, radioAndRemoteController.getCurrentSound());
	}
	@Test
	public void makeMinSoundDown() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		radioAndRemoteController.makeMinSoundDown();
		assertEquals(0, radioAndRemoteController.getCurrentSound());
	}


}
