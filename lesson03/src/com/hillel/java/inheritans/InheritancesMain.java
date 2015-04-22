package com.hillel.java.inheritans;

/**
 * ������������ �� �����������
 */

import com.hillel.java.improveArray.StringArray;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Ramzes on 22.04.2015.
 */
public class InheritancesMain {


    public static void main(String[] args) {

         Person persone = new Employee("Ivan","IT");

        register(persone);

       // register(new Employee("Ivan","IT"));
       // register(new Person("Vasya"));

        //jenerics();


    }

    public static void jenerics() {
        //jeneric ����������� ArrayList � ����� ������� ��������
        // ArrayList<Employee> list = new ArrayList<Employee>();
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Employee("ivan","IT"));
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

        // �������� ����� �� ����������� � ������� ����
        if (employee instanceof Person) {
            System.out.println("Realy?");
        }

        register(employee);
        register(employeeAsPeson);


        //constructors();
    }

    // ������������� ������
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
