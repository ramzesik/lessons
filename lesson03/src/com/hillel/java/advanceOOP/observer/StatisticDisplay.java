package com.hillel.java.advanceOOP.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramzes on 15.05.2015.
 */
public class StatisticDisplay implements Updatable,Displayble {

   // private List<Integer> temperatures = new ArrayList<>();
   // private List<Integer> humidities = new ArrayList<>();
    private List<Weather> weatherHistory = new ArrayList<>();

    @Override
    public void update(Weather weather) {
        weatherHistory.add(weather);

        //this.temperatures.add(temperature);
        //this.humidities.add(humidity);

    }
    @Override
    public void display() {

        //int averageTemp = average(temperatures);
        //int averageHumidity = average(humidities);
        Weather avgTem = average(weatherHistory);

        System.out.println("Statistic: temperature is: " +avgTem.getTemperature()  + " humidities is: " + avgTem.getHumidity());

    }

    public Weather average(List<Weather> list) {

        if (list.isEmpty()) {
            return new Weather(0,0);
        }
        int sumTemp = 0;
        int sumHumadity = 0;

        for (Weather weather : list) {
            sumTemp += weather.getTemperature();
            sumHumadity += weather.getHumidity();
        }

        int avgTemp = (int)Math.round(sumTemp * 1.0 / list.size());
        int avgHumadity = (int) Math.round(sumHumadity * 1.0 / list.size());

        return new Weather(avgTemp,avgHumadity);
    }
    /*
    public int average(List<Integer> list) {
        int sum = 0;
        if (list.isEmpty()) {
            return 0;
        }
        for (Integer i : list) {
            sum += i;
        }
        return (int) Math.round(sum * 1.0 / list.size());
    }
    */


}
