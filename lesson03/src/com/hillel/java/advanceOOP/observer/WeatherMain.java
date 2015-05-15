package com.hillel.java.advanceOOP.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramzes on 15.05.2015.
 */
public class WeatherMain {

    public static void main(String[] args) {
        CurrentWeatherDisplay currentWeatherDisplay  = new CurrentWeatherDisplay();
        StatisticDisplay statisticDisplay = new StatisticDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        //WeatherData weatherData = new WeatherData(currentWeatherDisplay, statisticDisplay);
        List<Displayble> displaybles = new ArrayList<>();

        displaybles.add(currentWeatherDisplay);
        displaybles.add(statisticDisplay);
        displaybles.add(forecastDisplay);

        WeatherData weatherData = new WeatherData();

        weatherData.addObserver(currentWeatherDisplay);
        weatherData.addObserver(statisticDisplay);
        weatherData.addObserver(forecastDisplay);


        weatherData.reciveData(19, 60);
        weatherData.reciveData(21, 50);
        weatherData.reciveData(41, 50);



        System.out.println();
        print(displaybles);
    }

    public static void  print(List<Displayble> displaybles) {

        for (Displayble displayble: displaybles) {
            displayble.display();
        }

    }
}
