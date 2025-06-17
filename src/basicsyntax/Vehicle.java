//class Vehicle {
//    String brand;
//    public Vehicle(String brand) {
//        this.brand = brand;
//    }
//
//    public void display() {
//        System.out.println("Brand: " + brand);
//    }
//}
//class Car2 extends Vehicle {
//    String model;
//    public Car2(String brand, String model) {
//        super(brand);
//        this.model = model;
//    }
//    public void display() {
//        System.out.printf("Brand : %s, Model: %s\n", this.brand, this.model);
//    }
//}
//class Bicycle extends Vehicle {
//    String color;
//    public Bicycle(String brand, String color) {
//        super(brand);
//        this.brand = brand;
//    }
//    public void display() {
//        System.out.println("Color: " + this.color);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Car2 car = new Car2("Mercedes", "Ford");
//        car.display();
//        Bicycle bicycle = new Bicycle("Mercedes", "red");
//        bicycle.display();
//        Vehicle car2 = new Car2("kia", "kiamodel");
//
//        Vehicle[] vehicles = new Vehicle[] { car, bicycle };
//
//    }
//}
