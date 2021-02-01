package ru.netology.domain;

public class RadioAndRemoteController {
	private int currentStation;
	private int currentSound;
	private int minSound = 0;
	private int maxSound = 10;

	public void switchStationsForward() {

		if (currentStation == 0) {
			setCurrentStation(1);
			return;
		}
		setCurrentStation(currentStation + 1);
		if (currentStation == 1) {
			setCurrentStation(2);
			return;
		}
		setCurrentStation(currentStation + 1);
		if (currentStation == 2) {
			setCurrentStation(3);
			return;
		}
		setCurrentStation(currentStation + 1);
		if (currentStation == 3) {
			setCurrentStation(4);
			return;
		}
		setCurrentStation(currentStation + 1);
		if (currentStation == 4) {
			setCurrentStation(5);
			return;
		}
		setCurrentStation(currentStation + 1);
		if (currentStation == 5) {
			setCurrentStation(6);
			return;
		}
		setCurrentStation(currentStation + 1);
		if (currentStation == 6) {
			setCurrentStation(7);
			return;
		}
		setCurrentStation(currentStation + 1);
		if (currentStation == 7) {
			setCurrentStation(8);
			return;
		}
		setCurrentStation(currentStation + 1);
		if (currentStation == 8) {
			setCurrentStation(9);
			return;
		}
		setCurrentStation(currentStation + 1);
		if (currentStation == 9) {
			setCurrentStation(0);
			return;
		}
		setCurrentStation(0);
	}


//	public void switchStation0Back() {
//		if (currentStation == 0) {
//			setCurrentStation(9);
//			return;
//		}
//		setCurrentStation(lastStation - 9);
//	}
//
//	public void switchStation1Back() {
//		if (currentStation == 1) {
//			setCurrentStation(0);
//			return;
//		}
//		setCurrentStation(lastStation - 9);
//	}
//
//	public void switchStation2Back() {
//		if (currentStation == 2) {
//			setCurrentStation(1);
//			return;
//		}
//		setCurrentStation(lastStation - 8);
//	}
//
//	public void switchStation3Back() {
//		if (currentStation == 3) {
//			setCurrentStation(2);
//			return;
//		}
//		setCurrentStation(lastStation - 7);
//	}
//
//	public void switchStation4Back() {
//		if (currentStation == 4) {
//			setCurrentStation(3);
//			return;
//		}
//		setCurrentStation(lastStation - 6);
//	}
//
//	public void switchStation5Back() {
//		if (currentStation == 5) {
//			setCurrentStation(4);
//			return;
//		}
//		setCurrentStation(lastStation - 5);
//	}
//
//	public void switchStation6Back() {
//		if (currentStation == 6) {
//			setCurrentStation(5);
//			return;
//		}
//		setCurrentStation(lastStation - 4);
//	}
//
//	public void switchStation7Back() {
//		if (currentStation == 7) {
//			setCurrentStation(6);
//			return;
//		}
//		setCurrentStation(lastStation - 3);
//	}
//
//	public void switchStation8Back() {
//		if (currentStation == 8) {
//			setCurrentStation(7);
//			return;
//		}
//		setCurrentStation(lastStation - 2);
//	}
//
//	public void switchStation9Back() {
//		if (currentStation == 9) {
//			setCurrentStation(8);
//			return;
//		}
//		setCurrentStation(lastStation - 1);
//	}


	public void makeMinSoundLouder() {
		if (currentSound == 0) {
			setCurrentSound(1);
			return;
		}
		setCurrentSound(minSound + 1);
	}
	public void makeCurrentSound1Louder() {
		if (currentSound == 1) {
			setCurrentSound(2);
			return;
		}
		setCurrentSound(minSound + 2);
	}
	public void makeCurrentSound2Louder() {
		if (currentSound == 2) {
			setCurrentSound(3);
			return;
		}
		setCurrentSound(minSound + 3);
	}
	public void makeCurrentSound3Louder() {
		if (currentSound == 3) {
			setCurrentSound(4);
			return;
		}
		setCurrentSound(minSound + 4);
	}
	public void makeCurrentSound4Louder() {
		if (currentSound == 4) {
			setCurrentSound(5);
			return;
		}
		setCurrentSound(minSound + 5);
	}
	public void makeCurrentSound5Louder() {
		if (currentSound == 5) {
			setCurrentSound(6);
			return;
		}
		setCurrentSound(minSound + 6);
	}
	public void makeCurrentSound6Louder() {
		if (currentSound == 6) {
			setCurrentSound(7);
			return;
		}
		setCurrentSound(minSound + 7);
	}
	public void makeCurrentSound7Louder() {
		if (currentSound == 7) {
			setCurrentSound(8);
			return;
		}
		setCurrentSound(minSound + 8);
	}
	public void makeCurrentSound8Louder() {
		if (currentSound == 8) {
			setCurrentSound(9);
			return;
		}
		setCurrentSound(minSound + 9);
	}
	public void makeCurrentSound9Louder() {
		if (currentSound == 9) {
			setCurrentSound(10);
			return;
		}
		setCurrentSound(minSound + 10);
	}
	public void makeMaxSoundLouder() {
		setCurrentSound(maxSound);
	}
	public void makeMaxSoundDown() {
		setCurrentSound(maxSound - 1);
	}
	public void makeCurrentSound9Down() {
		if (currentSound == 9) {
			setCurrentSound(9);
			return;
		}
		setCurrentSound(maxSound - 2);
	}
	public void makeCurrentSound8Down() {
		if (currentSound == 8) {
			setCurrentSound(7);
			return;
		}
		setCurrentSound(maxSound - 3);
	}
	public void makeCurrentSound7Down() {
		if (currentSound == 7) {
			setCurrentSound(6);
			return;
		}
		setCurrentSound(maxSound - 4);
	}
	public void makeCurrentSound6Down() {
		if (currentSound == 6) {
			setCurrentSound(5);
			return;
		}
		setCurrentSound(maxSound - 5);
	}
	public void makeCurrentSound5Down() {
		if (currentSound == 5) {
			setCurrentSound(4);
			return;
		}
		setCurrentSound(maxSound - 6);
	}
	public void makeCurrentSound4Down() {
		if (currentSound == 4) {
			setCurrentSound(3);
			return;
		}
		setCurrentSound(maxSound - 7);
	}
	public void makeCurrentSound3Down() {
		if (currentSound == 3) {
			setCurrentSound(2);
			return;
		}
		setCurrentSound(maxSound - 8);
	}
	public void makeCurrentSound2Down() {
		if (currentSound == 2) {
			setCurrentSound(1);
			return;
		}
		setCurrentSound(maxSound - 9);
	}
	public void makeCurrentSound1Down() {
		if (currentSound == 1) {
			setCurrentSound(minSound);
			return;
		}
		setCurrentSound(maxSound - 10);
	}
	public void makeMinSoundDown() {
		int minSound = 0;
		setCurrentSound(minSound);
}


	public int getCurrentStation() {
		return currentStation;
	}
	public void setCurrentStation(int currentStation) {
		this.currentStation = currentStation;
	}
//	public int getFirstStation() {
//		return firstStation;
//	}
//	public void setFirstStation(int firstStation) {
//		this.firstStation = firstStation;
//	}
//	public int getLastStation() {
//		return lastStation;
//	}
//	public void setLastStation(int lastStation) {
//		this.lastStation = lastStation;
//	}

	public int getCurrentSound() {
		return currentSound;
	}
	public void setCurrentSound(int currentSound) {
		this.currentSound = currentSound;
	}
	public int getMinSound() {
		return minSound;
	}
	public void setMinSound(int minSound) {
		this.minSound = minSound;
	}
	public int getMaxSound() {
		return maxSound;
	}
	public void setMaxSound(int maxSound) {
		this.maxSound = maxSound;
	}
}
