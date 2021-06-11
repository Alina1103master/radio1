package ru.netology;

public class RadioAdvanced {
    private String name;
    private boolean on;
    private int currentStation = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolum = 0;
    private int maxVolum = 10;
    private int minVolum = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void changeToThePreviousRadioStation() {
        if (currentStation == minStation) {
            this.currentStation = 9;
            return;
        }
        this.currentStation--;
    }

    public void changeToTheNextRadioStation() {
        if (currentStation == maxStation) {
            this.currentStation = 0;
            return;
        }
        this.currentStation++;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        minStation = minStation;
    }

    public int getCurrentVolum() {
        return currentVolum;
    }

    public void setCurrentVolum(int currentVolum) {
        if (currentVolum > maxVolum) {
            return;
        }
        if (currentVolum < minVolum) {
            return;
        }
        this.currentVolum = currentVolum;
    }

    public int getMaxVolum() {
        return maxVolum;
    }

    public void setMaxVolumeLevel(int maxVolumeLevel) {
        maxVolum = maxVolumeLevel;
    }

    public int getMinVolum() {
        return minVolum;
    }

    public void setMinVolum(int minVolum) {
        minVolum = minVolum;
    }

    public void volumUpForOne() {

        if (currentVolum == maxVolum) {
            this.currentVolum = currentVolum;
        }
        if (currentVolum < maxVolum) {
            this.currentVolum++;
        }
    }

    public void volumDownForOne() {
        if (currentVolum == minVolum) {
            this.currentVolum = currentVolum;
        }
        if (currentVolum > minVolum) {
            this.currentVolum--;
        }
    }


    public boolean isOn() {
        return on;
    }

}
