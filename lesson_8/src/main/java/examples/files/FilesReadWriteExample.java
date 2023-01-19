package examples.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class FilesReadWriteExample {

    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("out/"));

        Path path = Paths.get("out/hello.txt");
        
        System.out.println("---- READ out/hello.txt -----");

        // This will fail if the file doesn't exist
        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(line -> System.out.println(line));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // https://docs.oracle.com/javase/8/docs/api/java/nio/file/StandardOpenOption.html
        System.out.println("---- WRITEout/ hello2.txt -----");
        Path path2 = Paths.get("out/hello2.txt");

        // You can check if a file exist
        if (path2.toFile().exists()){
            System.out.println("File already exists!");
        } else {
            Files.writeString(path2, "hello world", StandardOpenOption.CREATE_NEW);
        }
    }

}
