package com.gitexample.entities;

public class Employee
{
    private int id;
    private String name;
    private int age;
    private String place;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, String place, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.place = place;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPlace() {
        return place;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", place='" + place + '\'' +
                ", salary=" + salary +
                '}';
    }
}
