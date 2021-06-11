package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTestAdvanced {

    @Test
    public void shouldGetAndSetRadio() {
        RadioAdvanced radio = new RadioAdvanced();
        String expected = "radioMaximum";

        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test // вернуть радиостанцию к нулю
    void shouldReturnRadioStationToZero() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 10;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test // текущая радиостанция
    void setCurrentRadioStation() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = -11;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());

    }

    @Test // переключение радиостанции на предыдущую
    void changeToThePreviousRadioStation() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 1;
        radio.setCurrentStation(currentStation);
        radio.changeToThePreviousRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test //переключение радиостанции на следующую
    void shouldChangeToTheNextRadioStation() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 5;
        radio.setCurrentStation(currentStation);
        radio.changeToTheNextRadioStation();
        int expected = 6;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test  // станция не переключится, если достигнута минимальная шкала
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.changeToThePreviousRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test // станция не переключится, если достигнута максимальная шкала
    void  notChangeToTheNextRadioStationMaxStation() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.changeToTheNextRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }





    @Test //если громкость выше максимальной
    void ifVolumIsAboveMax() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolum = 11;
        radio.setCurrentVolum(currentVolum);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolum());
    }

    @Test // если громкость ниже минимальной
    void ifVolumIsBelowMin() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolum = -1;
        radio.setCurrentVolum(currentVolum);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolum());
    }

    @Test // громкость не меняется, если достигнута максимальная шкала громкости
    void notChangeVolumIfMaxVolum() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolum = 10;
        radio.setCurrentVolum(currentVolum);
        radio.volumUpForOne();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolum());
    }

    @Test // громкость не меняется, если достигнута минимальная шкала громкости
    void notChangeVolumIfVolumIsMin() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolum = 0;
        radio.setCurrentVolum(currentVolum);
        radio.volumDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolum());

    }

    @Test // прибавление громкости на одно деление
    void volumUpForOne() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolum = 3;
        radio.setCurrentVolum(currentVolum);
        radio.volumUpForOne();
        int expected = 4;
        assertEquals(expected, radio.getCurrentVolum());
    }

    @Test // убавление громкости на одно деление
    void volumDownForOne() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolum = 4;
        radio.setCurrentVolum(currentVolum);
        radio.volumDownForOne();
        int expected = 3;
        assertEquals(expected, radio.getCurrentVolum());

    }


    @Test
    public void radioStation() {
        RadioAdvanced Radio = new RadioAdvanced();
        assertNull(Radio.getName());
        assertEquals(9, Radio.getMaxStation());
        assertEquals(0, Radio.getMinStation());
        assertEquals(0, Radio.getCurrentStation());
        assertEquals(10, Radio.getMaxVolum());
        assertEquals(0, Radio.getMinVolum());
        assertEquals(0, Radio.getCurrentVolum());
        assertFalse(Radio.isOn());
    }


    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentStation);
        radio.currentStation = 5;
        assertEquals(5, radio.currentStation);
    }
}