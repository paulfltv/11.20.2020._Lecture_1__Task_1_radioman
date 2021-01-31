package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioAndRemoteControllerTest {

	@Test
	public void switchStationForward() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		assertEquals(0, radioAndRemoteController.Station);
	}

	@Test
	public void switchStationBack() {
		RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
		assertEquals(9, radioAndRemoteController.Station);
	}
}
