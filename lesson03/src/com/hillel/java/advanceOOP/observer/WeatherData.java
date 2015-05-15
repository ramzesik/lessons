package com.hillel.java.advanceOOP.observer;

// наблидатель

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramzes on 15.05.2015.
 */
public class WeatherData {

    /*
    private int temperature;
    private int humidity;
    */
    private Weather weather;


    // private CurrentWeatherDisplay currentWeatherDisplay;
    // private StatisticDisplay statisticDisplay;
    private Updatable currentWeatherDisplay;
    private Updatable statisticDisplay;
    private List<Updatable> updatables = new ArrayList<>();

    /* когда заюзали интерфейс это не надо
    //public WeatherData(CurrentWeatherDisplay currentWeatherDisplay,StatisticDisplay statisticDisplay) {
    public WeatherData(Updatable currentWeatherDisplay,Updatable statisticDisplay) {
        this.currentWeatherDisplay = currentWeatherDisplay;
        this.statisticDisplay = statisticDisplay;
    }
    */

    public void addObserver(Updatable observer) {
        updatables.add(observer);
    }


    public void reciveData(int temperature, int humidity) {

        weather = new Weather(temperature,humidity);
       /* this.temperature = temperature;
        this.humidity = humidity;
        */
        measurementChange();

    }

    /*
    private void measurementChange() {
        currentWeatherDisplay.update(temperature, humidity);
        statisticDisplay.update(temperature, humidity);
    }
    */

    private void measurementChange() {

        for (Updatable observer : updatables) {
            observer.update(weather);
        }
    }


}
