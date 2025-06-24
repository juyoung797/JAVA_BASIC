package TIL250624.myannotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface CustomInfo {
    String author();
    String date();
    int version() default 1; // 메서드가 아니라 필드 값임
}
@CustomInfo(author = "j797", date = "2025-06-24", version = 2)
class Demo {
    @CustomInfo(author = "j797", date = "2025-06-24")
    public void display() {
        System.out.println("Display method executed");
    }
}
public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Class<?> demoClass = demo.getClass();
        if (demoClass.isAnnotationPresent(CustomInfo.class)) {
            CustomInfo info = demoClass.getAnnotation(CustomInfo.class);
            System.out.println("Class Info : " + info);
            System.out.println("author : " + info.author());
            System.out.println("date : " + info.date());
            System.out.println("version : " + info.version());
        }
        try {
            Method displayMethod = demoClass.getMethod("display");
            if (displayMethod.isAnnotationPresent(CustomInfo.class)) {
                CustomInfo displayMethodInfo = displayMethod.getAnnotation(CustomInfo.class);
                System.out.println("displayMethod Info : " + displayMethodInfo);
                System.out.println("version : " + displayMethodInfo.version());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
