package ru.netology.maven.Java10;

public class Radio {
    private int radioNumber;
    private int soundVolume;

    //  --------- РАДИО ---------
    public int getRadioNumber() {
        return radioNumber;
    }

    public void setRadioNumber(int newRadioNumber) {
        if (newRadioNumber < 0) {
            return;
        }
        if (newRadioNumber > 9) {
            return;
        }
        radioNumber = newRadioNumber;
    }

    public void setToMaxNumber() {
        radioNumber = 9;
    }

    public int nextRadioNumber() {
        if (radioNumber >= 9) {
            radioNumber = 0;
        } else {
            radioNumber = radioNumber + 1;
        }
        return radioNumber;
    }

    public int prevRadioNumber() {
        if (radioNumber <= 0) {
            radioNumber = 9;
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
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setToMaxVolume() {
        soundVolume = 10;
    }

    public int nextSoundVolume() {
        if (soundVolume >= 10) {
            soundVolume = 10;
        } else {
            soundVolume = soundVolume + 1;
        }
        return soundVolume;
    }

    public int prevSoundVolume() {
        if (soundVolume <= 0) {
            soundVolume = 0;
        } else {
            soundVolume = soundVolume - 1;
        }
        return soundVolume;
    }
}
