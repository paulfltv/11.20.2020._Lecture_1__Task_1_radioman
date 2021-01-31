package ru.netology.domain;

public class RadioAndRemoteController {
	int Station;

	public void switchStationForward(int Station) {

		if (Station == 9) {
			setStation(0);
			return;
		}
		setStation(Station + 1);
	}

	public void switchStationBack(int Station) {

		if (Station == 0) {
			setStation(9);
			return;
		}
		setStation(Station - 1);
	}

	private void setStation(int i) {
	}
}