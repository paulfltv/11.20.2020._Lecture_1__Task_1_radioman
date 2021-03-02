//package ru.netology.domain.radioman;
//
//import org.junit.jupiter.api.Test;
//import ru.netology.domain.radioman.RadioAndRemoteController;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class RadioAndRemoteControllerTest {
//	RadioAndRemoteController radioAndRemoteController = new RadioAndRemoteController();
//	@Test
//	public void switchCurrentStation0Forward() {
//		radioAndRemoteController.switchStationsForward();
//		assertEquals(1, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchCurrentStation4Forward() {
//		radioAndRemoteController.setCurrentStation(4);
//		radioAndRemoteController.switchStationsForward();
//		assertEquals(5, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchCurrentStation8Forward() {
//		radioAndRemoteController.setCurrentStation(8);
//		radioAndRemoteController.switchStationsForward();
//		assertEquals(9, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchCurrentStation9Forward() {
//		radioAndRemoteController.setCurrentStation(9);
//		radioAndRemoteController.switchStationsForward();
//		assertEquals(0, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchCurrentStation9Back() {
//		radioAndRemoteController.setCurrentStation(9);
//		radioAndRemoteController.switchStationsBack();
//		assertEquals(8, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchCurrentStation0Back() {
//		radioAndRemoteController.setCurrentStation(0);
//		radioAndRemoteController.switchStationsBack();
//		assertEquals(9, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchCurrentStation1Back() {
//		radioAndRemoteController.setCurrentStation(1);
//		radioAndRemoteController.switchStationsBack();
//		assertEquals(0, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchCurrentStation6Back() {
//		radioAndRemoteController.setCurrentStation(6);
//		radioAndRemoteController.switchStationsBack();
//		assertEquals(5, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchStationMinus1() {
//		radioAndRemoteController.setCurrentStation(-1);
//		assertEquals(0, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchStation0() {
//		radioAndRemoteController.setCurrentStation(0);
//		assertEquals(0, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchStation5() {
//		radioAndRemoteController.setCurrentStation(5);
//		assertEquals(5, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchStation9() {
//		radioAndRemoteController.setCurrentStation(9);
//		assertEquals(9, radioAndRemoteController.getCurrentStation());
//	}
//
//	@Test
//	public void switchStation10() {
//		radioAndRemoteController.setCurrentStation(10);
//		assertEquals(0, radioAndRemoteController.getCurrentStation());
//	}
//
//    @Test
//	public void setCurrentSoundMinus1() {
//		radioAndRemoteController.setCurrentSound(-1);
//		assertEquals(0, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void setCurrentSound0() {
//		radioAndRemoteController.setCurrentSound(0);
//		assertEquals(0, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void setCurrentSound1() {
//		radioAndRemoteController.setCurrentSound(1);
//		assertEquals(1, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void setCurrentSound5() {
//		radioAndRemoteController.setCurrentSound(5);
//		assertEquals(5, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void setCurrentSound10() {
//		radioAndRemoteController.setCurrentSound(10);
//		assertEquals(10, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void setCurrentSound11() {
//		radioAndRemoteController.setCurrentSound(11);
//		assertEquals(10, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void increaseCurrentSound0() {
//		radioAndRemoteController.setCurrentSound(0);
//		radioAndRemoteController.increaseCurrentSound();
//		assertEquals(1, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void increaseCurrentSound5() {
//		radioAndRemoteController.setCurrentSound(5);
//		radioAndRemoteController.increaseCurrentSound();
//		assertEquals(6, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void increaseCurrentSound9() {
//		radioAndRemoteController.setCurrentSound(9);
//		radioAndRemoteController.increaseCurrentSound();
//		assertEquals(10, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void increaseCurrentSound10() {
//		radioAndRemoteController.setCurrentSound(10);
//		radioAndRemoteController.increaseCurrentSound();
//		assertEquals(10, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void decreaseCurrentSound10() {
//		radioAndRemoteController.setCurrentSound(10);
//		radioAndRemoteController.decreaseCurrentSound();
//		assertEquals(9, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void decreaseCurrentSound9() {
//		radioAndRemoteController.setCurrentSound(9);
//		radioAndRemoteController.decreaseCurrentSound();
//		assertEquals(8, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void decreaseCurrentSound5() {
//		radioAndRemoteController.setCurrentSound(5);
//		radioAndRemoteController.decreaseCurrentSound();
//		assertEquals(4, radioAndRemoteController.getCurrentSound());
//	}
//
//	@Test
//	public void decreaseCurrentSound0() {
//		radioAndRemoteController.setCurrentSound(0);
//		assertEquals(0, radioAndRemoteController.getCurrentSound());
//	}
//}