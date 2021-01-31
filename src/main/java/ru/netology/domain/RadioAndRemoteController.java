package ru.netology.domain;

public class RadioAndRemoteController {
	private int station = 5;

	public void switchStationForward() {
		if (station == 9) {
			setStation(0);
			return;
		}
		setStation(station + 1);
	}
	public void switchStationBack() {
		if (station == 0) {
			setStation(9);
			return;
		}
		setStation(station - 1);
	}

	public int getStation() {
		return station;
	}
	public void setStation(int station) {
		this.station = station;
	}
}
