package basicsyntax;

class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println("이름 : " + name);
    }
}

class Dog extends Animal {
    String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    @Override // 주석 + 기능
    public void printName() {}
    public void printNameAndBreed() {
        System.out.println("이름 : " + name + ", 품종 : " + breed);
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog3 = new Dog("쿠키", "말티즈");
        dog3.printName();
        dog3.printNameAndBreed();

        Animal dog = new Dog("이름", "품종");
        if(dog instanceof Dog) {
            Dog newDog = (Dog) dog; //Variable 'newDog' can be replaced with pattern variable
            newDog.printName();
        }

    }
}