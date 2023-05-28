package Script;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileWork {
    public static void main(String[] args) throws IOException {
        String path = "src/main/java/Script";
        System.out.println("type file u want to create");
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        Path path1 = Paths.get(path, file);
        if (Files.exists(path1)) {
            System.out.println("File already exist");
        } else {
            Path testCreate = Files.createFile(Paths.get(String.valueOf(path1)));
            if (Files.exists(path1)) {
                System.out.println("File created");
            } else {
                System.out.println("Error");
            }
        }
    }
}
