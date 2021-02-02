package ru.netology.domain;

public class RadioAndRemoteController {
	private int currentStation;
	private int currentSound;

	public int getCurrentStation() {
		return currentStation;
	}

	public void setCurrentStation(int currentStation) {
		this.currentStation = currentStation;
	}

	public int getCurrentSound() {
		return currentSound;
	}

	public void setCurrentSound(int currentSound) {
		this.currentSound = currentSound;
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

	public void putStation() {
		if (currentStation < 9) {
			setCurrentSound(currentSound + 1);
			setCurrentSound(currentSound - 1);
		}
	}

		public void makeCurrentSoundLouder () {
			if (currentSound == 10) {
				setCurrentSound(10);
				return;
			}
			setCurrentSound(currentSound + 1);
		}
		public void makeCurrentSoundDown () {
			if (currentSound == 0) {
				setCurrentSound(0);
				return;
			}
			setCurrentSound(currentSound - 1);
		}
		public void putSound () {

	}