package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

	@Test
	public void shouldCreate(){
		Radio radio = new Radio();
		System.out.println("Radioman");
	}

	@Test
	public void shouldCheckFields() {
		Radio radio = new Radio();
		assertEquals(0, radio.currentStation);
		assertEquals(0, radio.nextStation);
	}

	@Test
	public void turnOnNextStation() {
		Radio radio = new Radio();
		int[] stations = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int currentStation = stations[0];
		int expected = currentStation + 1;
		int actual = radio.turnOnNextStation();
		assertEquals(expected, actual);
	}
}
