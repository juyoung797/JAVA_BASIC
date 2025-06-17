package TIL250613.interfaces;

interface AnimalInterface {
    void makeSound();
}
class AnimalClass {
    public void makeSound() {

    }// 실제 구현은 필요 없음!
}
class Dog implements AnimalInterface {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
    public void makeLoud() {
        System.out.println("으르릉깡깡");
    }
}
public class Main {
    public static void main(String[] args) {
        AnimalInterface dog = new Dog();
        dog.makeSound();
        if (dog instanceof Dog) {
            Dog newDog = new Dog();
            newDog.makeLoud();// 자식만 갖고있는 메소드들이 많이 활용된다면 다형성을 지향하는 것이 좋다.
        }
    }
}
