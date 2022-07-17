package ru.netology.radio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStationNumber = 10;

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStationNumber - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxStationNumber - 1) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = maxStationNumber - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}

