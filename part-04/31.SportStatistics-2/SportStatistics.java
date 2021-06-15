import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

    // Doing with games class is also easy.
    //}
    //public static ArrayList<Games> readGamesFile(String file) {

        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String home = parts[0];
                String away = parts[1];
                int homePt = Integer.valueOf(parts[2]);
                int awayPt = Integer.valueOf(parts[3]);

                // Home team matched the one we are looking
                if (home.equals(team)) {
                    ++games;
                    if (homePt > awayPt) {
                        ++wins;
                    } else {
                        ++losses;
                    }
                // Away tema matched the one we are looking
                } else if (away.equals(team)) {
                    ++games;
                    if (awayPt > homePt) {
                        ++wins;
                    } else {
                        ++losses;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
