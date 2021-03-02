package ru.netology.domain.radiomanplus;

class RadiomanPlus {

	private int currentStation;
	private int firstStation = 0;
	private int lastStation = 10;
	private int currentSound;
	private int minSound = 0;
	private int maxSound = 10;

	public RadiomanPlus(int currentStation, int firstStation, int lastStation, int currentSound, int minSound, int maxSound) {
		this.currentStation = currentStation;
		this.firstStation = firstStation;
		this.lastStation = lastStation;
		this.currentSound = currentSound;
		this.minSound = minSound;
		this.maxSound = maxSound;
	}

	public RadiomanPlus(int currentSound, int minSound, int maxSound) {
		this.currentSound = currentSound;
		this.minSound = minSound;
		this.maxSound = maxSound;
	}

	public int getFirstStation() {
		return firstStation;
	}
	public void setFirstStation(int firstStation) {
		this.firstStation = firstStation;
	}
	public int getLastStation() {
		return lastStation;
	}
	public void setLastStation(int lastStation) {
		this.lastStation = lastStation;
	}

	public int getCurrentStation() {
		return currentStation;
	}

	public int getCurrentSound() {
		return currentSound;
	}
	public int getMaxSound() {
		return maxSound;
	}

	public void setMaxSound(int maxSound) {
		this.maxSound = maxSound;
	}

	public int getMinSound() {
		return minSound;
	}

	public void setMinSound(int minSound) {
		this.minSound = minSound;
	}

	public void switchStationsForward() {
		if (currentStation == 0) {
			currentStation++;
			return;
		}
		if (currentStation == 10) {
			setCurrentStation(0);
			return;
		}
		setCurrentStation(currentStation + 1);
	}

	public void switchStationsBack() {
		if (currentStation == 10) {
			currentStation--;
			return;
		}
		if (currentStation == 0) {
			setCurrentStation(10);
			return;
		}
		setCurrentStation(currentStation - 1);
	}
	public void setCurrentStation(int currentStation) {
		if (currentStation > 10) {
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
		if (currentSound == 100) {
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