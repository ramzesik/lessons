package com.hillel.java.troubls;

/**
 * Created by Ramzes on 08.05.2015.
 */
public  class Car implements Comparable<Car>{
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

 /*   public void setModel(String model) {
        this.model = model;
    }
*/
    @Override
    public int compareTo(Car o) {
        return this.model.compareTo(o.model);
    }
}
