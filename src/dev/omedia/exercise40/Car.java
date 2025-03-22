package dev.omedia.exercise40;


public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
    public String startEngine(){
        String className = this.getClass().getSimpleName();
        System.out.println(className);
        return className + " engine is starting";
    }
    public String accelerate(){
        String className = this.getClass().getSimpleName();
        System.out.println(className);
        return className + " is accelerating";
    }
    public String brake(){
        String className = this.getClass().getSimpleName();
        System.out.println(className);
        return className + " is braking";
    }
    public int getCylinders(){
        return this.cylinders;
    }
    public String getName(){
        return this.name;
    }
}
