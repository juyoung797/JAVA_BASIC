package basicsyntax;

public class Car {
    String brand;
    int year;
    String model;
    int price;
    public Car(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }
    public Car(String brand, int year, String model, int price) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("이 차의 브랜드는 " + brand + "입니다. 연식은 " + year + "년 정도 되었고 모델이름은 "
                + model + "입니다. " + ((this.price == 0)? "" : "가격은" + this.price + "입니다."));
    }
    void drive() {
        System.out.println("gogo");
    }
}

//    Car car = new Car();
//    car.brand = "현대";
//    car.year = 2;
//    car.model = "싼타페";
//    car.displayInfo();


//Car car = new Car("현대", 3, "abc");
//Car car2 = new Car("기아", 5, "abcde", 123456789);
//        car.displayInfo();
//        car2.displayInfo();
