package com.hillel.java.advanceOOP.observer;


import java.util.Random;

/**
 * Created by Ramzes on 15.05.2015.
 */
public class ForecastDisplay implements Updatable,Displayble {

    private Random random = new Random();
    private Weather forecasWeather;


    @Override
   // public void update(int temperature, int humidity) {
    public void update(Weather weather) {
        forecasWeather = forecast(weather);
    }

   // private int forecast(int value) {
    private Weather forecast(Weather weather) {
        double ceed = random.nextDouble() * 0.5 + 0.75;
        int forecastTemp = (int)Math.round(weather.getTemperature() * ceed);
        int forecastHumidity = (int)Math.round(weather.getHumidity() * ceed);
        return new Weather(forecastTemp,forecastHumidity);

    }
    @Override
    public void display() {
        System.out.println("Forecast tmp is: " + forecasWeather.getTemperature() + " forecast humidity is:" + forecasWeather.getHumidity());
    }
}
