package smartHouse.addFunction.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetRadioStation() {
        radio.setCurrantRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrantRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStation2() {
        radio.setCurrantRadioStation(-2);
        int expected = 0;
        int actual = radio.getCurrantRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStation() {
        radio.setCurrantRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrantRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        radio.setCurrantRadioStation(4);
        int expected = 5;
        radio.next();
        int actual = radio.getCurrantRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LoopForwardRadioStation() {
        radio.setCurrantRadioStation(9);
        int expected = 0;
        radio.next();
        int actual = radio.getCurrantRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrantRadioStation(7);
        int expected = 6;
        radio.prev();
        int actual = radio.getCurrantRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LoopAheadRadioStation() {
        radio.setCurrantRadioStation(0);
        int expected = 9;
        radio.prev();
        int actual = radio.getCurrantRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrantVolume(45);

        int expected = 45;
        int actual = radio.getCurrantVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolume() {
        radio.setCurrantVolume(101);

        int expected = 0;
        int actual = radio.getCurrantVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelow() {
        radio.setCurrantVolume(-2);

        int expected = 0;
        int actual = radio.getCurrantVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUp() {
        radio.setCurrantVolume(10);
        int expected = 11;
        radio.volumeUp();
        int actual = radio.getCurrantVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDown() {
        radio.setCurrantVolume(66);
        int expected = 65;
        radio.volumeDown();
        int actual = radio.getCurrantVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUpMax() {
        radio.setCurrantVolume(100);
        int expected = 100;
        radio.volumeUp();
        int actual = radio.getCurrantVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDownMin() {
        radio.setCurrantVolume(0);
        int expected = 0;
        radio.volumeDown();
        int actual = radio.getCurrantVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioRange1() {
        int expected = 15;
        Radio radio = new Radio(expected);

        int actual = radio.getRadioRange();

        Assertions.assertEquals(expected, actual);
    }


}

