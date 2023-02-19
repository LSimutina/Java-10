package ru.netology.maven.Java10;

public class Radio {
    private int minRadioNumber = 0;
    private int maxRadioNumber = 9;
    private int radioNumber = minRadioNumber;
    private int sizeRadio=10;

    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int soundVolume = minSoundVolume;

    //  --------- РАДИО ---------
    public Radio() {
    }

    public Radio(int size) {
        this.sizeRadio = size - 1;
        this.maxRadioNumber = minRadioNumber + sizeRadio;
    }

    public int getMinRadioNumber() {
        return minRadioNumber;
    }

    public int getMaxRadioNumber() {
        return maxRadioNumber;
    }

    public int getRadioNumber() {
        return radioNumber;
    }

    public void setRadioNumber(int newRadioNumber) {
        if (newRadioNumber < minRadioNumber) {
            return;
        }
        if (newRadioNumber > maxRadioNumber) {
            return;
        }
        radioNumber = newRadioNumber;
    }

    public void setToMaxNumber() {
        radioNumber = maxRadioNumber;
    }

    public int nextRadioNumber() {
        if (radioNumber >= maxRadioNumber) {
            radioNumber = minRadioNumber;
        } else {
            radioNumber = radioNumber + 1;
        }
        return radioNumber;
    }

    public int prevRadioNumber() {
        if (radioNumber <= minRadioNumber) {
            radioNumber = maxRadioNumber;
        } else {
            radioNumber = radioNumber - 1;
        }
        return radioNumber;
    }

    //  ---------  ЗВУК ---------
    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSoundVolume) {
            return;
        }
        if (newSoundVolume > maxSoundVolume) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setToMaxVolume() {
        soundVolume = maxSoundVolume;
    }

    public int nextSoundVolume() {
        if (soundVolume >= maxSoundVolume) {
            soundVolume = maxSoundVolume;
        } else {
            soundVolume = soundVolume + 1;
        }
        return soundVolume;
    }

    public int prevSoundVolume() {
        if (soundVolume <= minSoundVolume) {
            soundVolume = minSoundVolume;
        } else {
            soundVolume = soundVolume - 1;
        }
        return soundVolume;
    }
}