package Garage;

public class Car{
    private String name;

    //Methods overloading
    public Car(String name){
        this.name = name;
    }

    //Copy constructor
    public Car(Car car){
        this.name = car.name;
    }

    public String toString(){
        return this.name;
    }

}
