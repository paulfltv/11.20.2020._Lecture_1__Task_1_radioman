package ru.netology.domain;

public class RadioAndRemoteController {
	private int currentStation;
	private int currentSound;

	public int getCurrentStation() {
		return currentStation;
	}
	public int getCurrentSound() {
		return currentSound;
	}

	public void switchStationsForward() {
		if (currentStation == 9) {
			setCurrentStation(0);
			return;
		}
		setCurrentStation(currentStation + 1);
	}

	public void switchStationsBack() {
		if (currentStation == 0) {
			setCurrentStation(9);
			return;
		}
		setCurrentStation(currentStation - 1);
	}

	public void setCurrentStation(int currentStation) {
		if (currentStation > 9) {
			return;
		}
		if (currentStation < 0) return;
		this.currentStation = currentStation;
	}
	public void setCurrentSound(int currentSound) {
		int maxSound = 10;
		if (currentSound > maxSound) {
		} else {
			this.currentSound = currentSound;
		}
		int minSound = 0;
		if (currentSound < minSound) {
		} else {
			this.currentSound = currentSound;
		}
	}

	public void increaseCurrentSound() {
		if (currentSound == 0) {
			currentSound++;
		}
	}
	public void decreaseCurrentSound() {
		if (currentSound == 10) {
			currentSound--;
		}
	}
}