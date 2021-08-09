import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> text = new ArrayList<>();

        System.out.print("Enter filename: ");
        String file = scanner.nextLine();
        text = ReadingFilesPerLine.read(file);
        text.stream()
            .forEach(s -> System.out.println(s));

    }

    public static List<String> read(String file) {
        List<String> toReturn = new ArrayList<>();
        try {
            toReturn = Files.lines(Paths.get(file))
                .collect(Collectors.toCollection(ArrayList::new));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return toReturn;
    }

}
