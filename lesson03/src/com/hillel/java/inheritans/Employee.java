package com.hillel.java.inheritans;

/**
 * Created by Ramzes on 22.04.2015.
 */
public class Employee extends Person {

    private  String departament;

    public String field = "Eployee's field";

    public Employee() {
        // метод коорый java выполянет при ините класса, вызов конструктора парента
        // java сама его вызывает
        super();
        System.out.println("Creating Employee");
    }

    public Employee(String name,String departament) {
        //name init here becouse it params from calss Persone
        super(name);
        this.departament=departament;

    }

    @Override
    public String someMethod() {
        return "Employee's overridden method. Method see: {field: " + field + ", static method: " + staticMethod() + "}";
    }

    public static String staticMethod() {
        return "Employee's static method";
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
}
