package gettersetter;
class AdultPerson {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 18) {
            this.age = age;
        } else {
            System.out.println("성인만 가입 가능");
        }
    }
}

public class Main {
//    public static void main(String[] args) {
//        AdultPerson p = new AdultPerson();
//        p.setName("John");
//        System.out.println(p.getName());
//    }
}