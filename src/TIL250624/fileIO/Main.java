package TIL250624.fileIO;

import java.io.*;

public class Main {
    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                System.out.println(Line);
            }
        } catch (IOException e) {
             e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        writeFile("lunch-menu.txt", "lunch-menu");
        writeFile("lunch-menu.txt", "떡볶이");
        System.out.println("파일 생성 완료");
        readFile("lunch-menu.txt");
    }
}