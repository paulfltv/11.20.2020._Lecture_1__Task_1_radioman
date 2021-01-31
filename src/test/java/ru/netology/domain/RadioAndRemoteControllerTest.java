package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioAndRemoteControllerTest {

	@Test
	public  void switchStationForward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		assertEquals(6, radioAndRemoteController.getStation());
	}
	@Test
	public  void switchStationBack() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		assertEquals(4, radioAndRemoteController.getStation());
	}

}
