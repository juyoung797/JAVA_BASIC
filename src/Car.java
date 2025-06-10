public class Car {
    String brand;
    int year;
    String model;
    int price;
    public void displayInfo() {
        System.out.println("이 차의 브랜드는 " + brand + "입니다. 연식은 " + year + "년 정도 되었고 모델이름은 " + model + "입니다. 가격은 " + price + "입니다.");
    }
    void drive() {
        System.out.println("gogo");
    }
//    Car car = new Car();
//    car.brand = "현대";
//    car.year = 2;
//    car.model = "싼타페";
//    car.displayInfo();
}
