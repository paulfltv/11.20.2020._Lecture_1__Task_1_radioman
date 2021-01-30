package ru.netology.domain;

public class Radio {
	int currentStation;
	int nextStation;

	public int turnOnNextStation() {

		int[] stations = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int currentStation = stations[0];
		for (int station : stations) {
			currentStation++;
			if (currentStation == stations[9]) {
				nextStation = 0;
			} else {
				currentStation++;
			}
		}
		return currentStation;
	}
}