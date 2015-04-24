package com.hillel.java.inheritans;

/**
 * конмткруторы не наследуются
 */

import com.hillel.java.improveArray.StringArray;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Ramzes on 22.04.2015.
 */
public class InheritancesMain {


    public static void main(String[] args) {

        // Person persone = new Employee("Ivan","IT");

        //register(persone);

       // register(new Employee("Ivan","IT"));
       // register(new Person("Vasya"));

        //jenerics();

        polymorphismVsFieldsAndStaticMethods();
    }


    private static void polymorphismVsFieldsAndStaticMethods() {
       /* Person purePerson = new Person("Ivan");
        System.out.println("Person object as Person:\n" +
                "   method: {" + purePerson.someMethod() + "} \n" +
                "   out of class field: {" + purePerson.field + "} \n" +
                "   out of class static method: {" + purePerson.staticMethod() + "} \n");

        */Employee pureEmployee = new Employee("Ivan", "T");/*
        System.out.println("Employee object as Employee:\n" +
                "   method: {" + pureEmployee.someMethod() + "} \n" +
                "   out of class field: {" + pureEmployee.field + "} \n" +
                "   out of class static method: {" + pureEmployee.staticMethod() + "}\n");
*/
        Person employeeCastedToPerson = pureEmployee;
        System.out.println("Employee object casted to Person:\n" +
                "   polymorphyc method: {" + employeeCastedToPerson.someMethod() + "} \n" +
                "   out of class field: {" + employeeCastedToPerson.field + "} \n" +
                "   out of class static method: {" + employeeCastedToPerson.staticMethod() + "}\n");

    }



    public static void jenerics() {
        //jeneric расказывает ArrayList с каким объктом работаем
        // ArrayList<Employee> list = new ArrayList<Employee>();
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Employee("ivan", "IT"));
        list.add(new Person("Ivann"));

        Employee employee = (Employee) list.get(0);

        //inconvinionWay();
    }

    public static void inconvinionWay() {
        Employee employee = new Employee("name", "dep");

        Person employeeAsPeson = employee;
        Object employeeAsObject = employeeAsPeson;

        //Person employeeAsPeson = employee;
        //Person employeeAsPeson =  new Employee("name2","dep");
        //Object employeeAsObject  = new Employee("name","dep");

        /*
        // use StringArray
        StringArray array = new StringArray();
        array.add(employee);
        array.add(employeeAsPeson);
        array.add(employeeAsObject);
        */

        ArrayList array = new ArrayList();
        array.add(employee);
        array.add(employeeAsPeson);
        array.add(employeeAsObject);

        employee = (Employee) array.get(0);
        employeeAsPeson = (Person) array.get(1);
        employeeAsObject = array.get(2);


        if (employeeAsPeson instanceof Employee) {
            employee = (Employee) employeeAsPeson;
        }

        // проверка можно ли прикастоват к данному типу
        if (employee instanceof Person) {
            System.out.println("Realy?");
        }

        register(employee);
        register(employeeAsPeson);


        //constructors();
    }

    // перегруженный методы
    // overloaded method
    public static void register(Employee employee) {
        System.out.println("employee registered" + employee.getName());
    }
    public static void register(Person person) {
        System.out.println("employee registered" + person.getName());

    }

    public static void constructors() {
        // Person person = new Person("Ivan");
        Employee employee = new Employee("Petro", "IT");
        // simpleExemple();
    }

    public static void simpleExemple() {

        /*
        Person person = new Person();

        person.setName("Ivan");
        Employee employee = new Employee();
        employee.setName("Petro");
        employee.setDepartament("IT");
        */
    }
}
