package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldChangeStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        int exp = 9;
        int act = rad.getCurrentStation();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotChangeStationBelowMinValue() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        int exp = 0;
        int act = rad.getCurrentStation();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotChangeStationAboveMaxValue() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int exp = 0;
        int act = rad.getCurrentStation();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldTurnNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.nextStation();

        int exp = 9;
        int act = rad.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotTurnStationAboveMaxValue() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.nextStation();

        int exp = 0;
        int act = rad.getCurrentStation();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldTurnPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(3);
        rad.prevStation();

        int exp = 2;
        int act = rad.getCurrentStation();
    }

    @Test
    public void shouldNotTurnStationBelowMinValue() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();

        int exp = 9;
        int act = rad.getCurrentStation();
    }


    @Test
    public void shouldChangeVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        int exp = 10;
        int act = rad.getCurrentVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotChangeVolumeBelowMinValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int exp = 0;
        int act = rad.getCurrentVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotChangeVolumeAboveMaxValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        int exp = 0;
        int act = rad.getCurrentVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);
        rad.increaseVolume();

        int exp = 9;
        int act = rad.getCurrentVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int exp = 10;
        int act = rad.getCurrentVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);
        rad.decreaseVolume();

        int exp = 7;
        int act = rad.getCurrentVolume();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void shouldNotDecreaseVolumeBelowLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int exp = 0;
        int act = rad.getCurrentVolume();

        Assertions.assertEquals(exp, act);
    }
}

