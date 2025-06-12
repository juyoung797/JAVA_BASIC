class Person {
    String name;
    int age;
    String doing = "";
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("안녕하세요? 저는 " + name + "입니다. 저의 나이는 " + age + "세 입니다. 저는 " + doing + "하는 중입니다.");
    }
//    Person person = new Person();
//    person.name = "주영";
//    person.age = 100;
//    person.doing = "강의듣기";
//    person.sayHello();
//
//    Person mzPerson = new Person();
//    mzPerson.name = "김객체";
//    mzPerson.age = 20;
//    mzPerson.doing = "점심식사";
//    mzPerson.sayHello();

}