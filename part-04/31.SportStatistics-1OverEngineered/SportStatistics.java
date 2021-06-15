import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String search = scan.nextLine();

        boolean found = false;
        ArrayList<Team> list = readRecordFile(file);
        for (Team team : list) {
            if (team.getName().equals(search)) {
                found = true;
                System.out.println("Games: " + team.getGames());
                System.out.println("Wins: " + team.getWins());
                System.out.println("Losses: " + team.getLosses());
            }
        }

        if (!found) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }
    }

    public static ArrayList<Team> readRecordFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();

        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                // Split line
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);

                boolean newHome = true;
                boolean newAway = true;
                // Check if team was already added to the ArrayList
                for (Team team : teams) {
                    if (team.getName().equals(parts[0])) {
                        newHome = false;
                        team.addGames();
                        // Add victory or loss
                        if (homePoints > awayPoints) {
                            team.addWins();
                        } else {
                            team.addLosses();
                        }

                    } else if (team.getName().equals(parts[1])) {
                        newAway = false;
                        team.addGames();
                        // Add victory or loss
                        if (awayPoints > homePoints) {
                            team.addWins();
                        } else {
                            team.addLosses();
                        }
                    }

                    // If both are not new, no need to keep checking
                    if (!newHome && !newAway) {
                        break;
                    }
                }

                // Add new home, and add one game and loss or victory.
                if (newHome) {
                    Team home = new Team(parts[0]);

                    home.addGames();
                    if (homePoints > awayPoints) {
                        home.addWins();
                    } else {
                        home.addLosses();
                    }

                    teams.add(home);
                }

                // Add new away, and add one game and loss or victory.
                if (newAway) {
                    Team away = new Team(parts[1]);

                    away.addGames();
                    if (awayPoints > homePoints) {
                        away.addWins();
                    } else {
                        away.addLosses();
                    }

                    teams.add(away);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return teams;
    }

}
