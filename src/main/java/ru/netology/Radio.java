package ru.netology;



public class Radio {
    public int currentStation;
    boolean on; //радио вкл
    int soundVolume; //громкость звука
    int maxVolum = 10; //макс громкость
    int minVolum = 0; //мин громкость
    int currentRadioStation = 0;//текущая радиостанция
    int minStation = 0;
    int maxStation = 9;

    void setSoundVolume() {
         int currentVolume = 0;
         if (currentVolume < 10) {
             currentVolume = currentVolume + 1;


         }
    }


}
