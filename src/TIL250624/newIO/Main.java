package TIL250624.newIO;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Main {
    public static void writeFile(String filename, String content) {
        Path filePath = Paths.get(filename);
        System.out.println(filePath);

//        try (FileWriter fileWriter = new FileWriter(filePath.toFile())) {
//            fileWriter.write(content);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (FileChannel writeChannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024); //1024byte = 1kb
            // BUFFER READ MODE
            buffer.put(content.getBytes()); // 텍스트를 .getBytes()를 통해 buffer에 byte 단위로 넣는다.
            System.out.println("Byte content: " + Arrays.toString(content.getBytes()));

            // FILE WRITE MODE
            buffer.flip(); // CREATE -> WRITE mode
            writeChannel.write(buffer); // buffer 의 내용을 file에 write
            System.out.println("파일을 성공적으로 작성 완료했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) {
        Path filePath = Paths.get(filename);
        try (FileChannel readChannel = FileChannel.open(filePath, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int bytesRead = readChannel.read(buffer);
            while (bytesRead != -1) {
                buffer.flip();

                String chunk = StandardCharsets.UTF_8.decode(buffer).toString();
                System.out.print(chunk);


                buffer.clear();
                bytesRead = readChannel.read(buffer);

//                while (buffer.hasRemaining()) {
//                    System.out.println((char) buffer.get());
//                }
//                buffer.clear();
//                bytesRead = readChannel.read(buffer);
//                System.out.println(bytesRead);
            }
            System.out.println("\n파일 읽기가 완료되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        writeFile("lunch-menu.txt", "오늘의 점심 메뉴는 뭘까요?");
        readFile("lunch-menu.txt");
    }
}
