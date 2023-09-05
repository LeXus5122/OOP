package Homework.Homework7;

import Homework.Homework7.DataBase.MeteoStore;
import Homework.Homework7.NewSensor.ST500Info;
import Homework.Homework7.NewSensor.SensorTemperature;
import Homework.Homework7.OldSensor.MS200;
import Homework.Homework7.OldSensor.MeteoSensor;

public class Main {

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с
    // этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от
    // предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        SensorTemperature sensorTemperature = new ST500Info().getData();
        ST500InfoAdapter st500InfoAdapter = new ST500InfoAdapter(sensorTemperature);
        meteoDb.save(st500InfoAdapter);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные
        // отправить в метод save объекта meteoDb
    }
}