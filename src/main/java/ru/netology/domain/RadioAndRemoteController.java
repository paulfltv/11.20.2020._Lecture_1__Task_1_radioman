package ru.netology.domain;

public class RadioAndRemoteController {
	private int currentStation;
	private int currentSound;
	private int maxSound = 10;
	private int minSound = 0;

	public int getCurrentStation() {
		return currentStation;
	}

	public int getCurrentSound() {
		return currentSound;
	}


	public void switchStationsForward() {
		if (currentStation == 0) {
			currentStation++;
			return;
		}
		if (currentStation == 9) {
			setCurrentStation(0);
			return;
		}
		setCurrentStation(currentStation + 1);
	}
	public void switchStationsBack() {
		if (currentStation == 9) {
			currentStation--;
			return;
		}
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
		if (currentStation < 0) {
			return;
		}
		this.currentStation = currentStation;
	}

	public void increaseCurrentSound() {
		if (currentSound == 0) {
			currentSound++;
			return;
		}
		setCurrentSound(currentSound + 1);
	}
	public void decreaseCurrentSound() {
		if (currentSound == 10) {
			currentSound--;
			return;
		}
		setCurrentSound(currentSound - 1);
	}
	public void setCurrentSound(int currentSound) {
		if (currentSound >= maxSound) {
			this.currentSound = maxSound;
			return;
		}
		if (currentSound <= minSound) {
			this.currentSound = minSound;
			return;
		}
		this.currentSound = currentSound;
	}
}