import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;

public class LiteracyComparison {

    public static void main(String[] args) {
        String fileName = "literacy.csv";
        List<String> lines = new ArrayList<>();
        List<Data> literacyData = new ArrayList<>();

        lines = LiteracyComparison.readFile(fileName);
        literacyData = LiteracyComparison.formatData(lines);
        LiteracyComparison.sortData(literacyData);
        LiteracyComparison.printData(literacyData);

    }

    public static List<String> readFile(String fileName) {
        try {
            return Files.lines(Paths.get(fileName))
                .collect(Collectors.toList());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return new ArrayList<>();
    }

    public static List<Data> formatData(List<String> list) {
        return list.stream()
            .map(line -> line.split(","))
            .filter(parts -> parts.length == 6) // Make sure all data is complete
            .map(parts -> new Data(parts[3], parts[2], parts[4], parts[5]))
            .collect(Collectors.toList());
    }

    public static void sortData(List<Data> list) {
        Collections.sort(list, (p1, p2) -> compareDouble(p1.getLiteracy(), p2.getLiteracy()));
    }

    public static int compareDouble(double p1, double p2) {
        if (p1 < p2) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void printData(List<Data> list) {
        list.stream()
            .forEach(s -> System.out.println(s));
    }

}
