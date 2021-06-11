package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public int setSoundVolume() {
      Radio radio = new Radio();
      radio.maxVolum = 10;
      radio.minVolum = 0;
      radio.on = true;

      radio.setSoundVolume();

      int currentVolum = setSoundVolume();
        return currentVolum;
    }

    @Test
    public void shouldInitFieldToZeroValues() {
        Radio radio = new Radio();
        assertNull(radio.soundVolume);
        assertEquals(9, radio.maxStation);
        assertEquals(0, radio.minStation);
        assertEquals(0, radio.currentStation);
        assertFalse(radio.on);
    }


    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentStation);
        radio.currentStation = -10;
        assertEquals(-10, radio.currentStation);
    }
}

