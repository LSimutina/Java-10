package ru.netology.maven.Java10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    Radio radio = new Radio();
    Radio vol = new Radio();

    @Test
    public void test() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinRadioNumber());
        Assertions.assertEquals(9, radio.getMaxRadioNumber());
        Assertions.assertEquals(0, radio.getRadioNumber());
    }

    @Test
    public void testSize() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(0, radio.getMinRadioNumber());
        Assertions.assertEquals(9, radio.getMaxRadioNumber());
        Assertions.assertEquals(0, radio.getRadioNumber());
    }

    @ParameterizedTest //Проверка номер радиостанции от 0 до 9
    @CsvFileSource(files = "src/test/resources/set.cvs")
    public void shouldSetRadioNumber(int expected, int radioNumber) {
        radio.setRadioNumber(radioNumber);

        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test //Максимальная станция
    public void shouldSetToMaxNumber() {
        radio.setToMaxNumber();

        int expected = 9;
        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // Переключение радио на след. радиостанцию
    @CsvFileSource(files = "src/test/resources/next.cvs")
    public void shouldNextRadioNumber(int expected, int newRadioNumber) {
        radio.setRadioNumber(newRadioNumber);
        radio.nextRadioNumber();

        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // Переключение радио на предыдущую радиостанцию
    @CsvFileSource(files = "src/test/resources/prev.cvs")
    public void shouldPrevRadioNumber(int expected, int newRadioNumber) {
        radio.setRadioNumber(newRadioNumber);
        radio.prevRadioNumber();

        int actual = radio.getRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

//////////// Volume

    @ParameterizedTest //Проверка звука в диапозоне от 0 до 10
    @CsvFileSource(files = "src/test/resources/set_sound.cvs")
    public void shouldSetSoundVolume(int expected, int newSoundVolume) {
        vol.setSoundVolume(newSoundVolume);

        int actual = vol.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test //Максимальный звук
    public void shouldSetToMaxVolume() {
        vol.setToMaxVolume();

        int expected = 100;
        int actual = vol.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest //Проверка увеличения звука
    @CsvFileSource(files = "src/test/resources/next_sound.cvs")
    public void shouldNextSoundVolume(int expected, int newSoundVolume) {
        vol.setSoundVolume(newSoundVolume);
        vol.nextSoundVolume();

        int actual = vol.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest //Проверка уменьшения звука
    @CsvFileSource(files = "src/test/resources/prev_sound.cvs")
    public void shouldPrevSoundVolume(int expected, int newSoundVolume) {
        vol.setSoundVolume(newSoundVolume);
        vol.prevSoundVolume();

        int actual = vol.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}