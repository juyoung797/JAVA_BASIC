//public class Inheritance {
//}
//class Animal {
//    String name;
//    public Animal(String name) {
//        this.name = name;
//    }
//    public void printName(String name) {
//        System.out.println("Animal name : " + name + this.name);
//        //필드 값에 접근하려면 this 키워드를 사용해야 한다.
//    }
//}
//class Dog extends Animal {
//    String breed;
//    //There is no no-arg constructor available in 'Animal'
//    public Dog(String name) {
//        super(name);
//    }
//    public Dog(String name, String breed) {
//        super(name); // 부모가 요구하는 필드를 먼저 채워야 한다. // 약간 택배박스같은역할
//        this.breed = breed;
////        super.name = name; //안됨
//    }
//}
////class Dog {
////    String name; //중복되는 키워드 : extends를 쓰면 제거된다.
////}
//public class Main {
//    public static void main(String[] args) {
//        Dog dog = new Dog("뽀삐", "말티즈");
//        dog.printName("쿠키");
//    }
//}

//class Animal {
//    String name;
//    public Animal(String name) {
//        this.name = name;
//    }
//    public void printName(String name) {
//        System.out.println("Animal name : " + name + this.name);
//        //필드 값에 접근하려면 this 키워드를 사용해야 한다.
//    }
//}
//class Dog extends Animal {
//    String breed;
//    //There is no no-arg constructor available in 'Animal'
//    public Dog() {
////        super(name);
//    }
//    public Dog(String name, String breed) {
//        super(name); // 부모가 요구하는 필드를 먼저 채워야 한다. // 약간 택배박스같은역할
//        this.breed = breed;
////        super.name = name; //안됨
//    }
//}
////class Dog {
////    String name; //중복되는 키워드 : extends를 쓰면 제거된다.
////}
//public class Main {
//    public static void main(String[] args) {
//        Dog dog = new Dog("뽀삐", "말티즈");
//        dog.printName("쿠키");
//    }
//}
