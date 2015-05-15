package com.hillel.java.advanceOOP.observer;

/**
 * Created by Ramzes on 15.05.2015.
 */
public class CurrentWeatherDisplay implements Updatable, Displayble {

    //private int temperature;
    //
    // private int humidity;

    private Weather weather;

    @Override
    public void update(Weather weather) {

        this.weather = weather;

    }
    @Override
    public void display() {
        System.out.println("Current weather is: temperature: " + weather.getTemperature() + " humidity is: " + weather.getHumidity());
    }

}
