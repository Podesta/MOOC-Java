import java.util.ArrayList;

public class Scores {

    private ArrayList<Integer> scores;

    public Scores() {
        this.scores = new ArrayList<>();
    }

    public void addScore(int number) {
        if (number >= 0 && number <= 100) {
            this.scores.add(number);
        }
    }

    public double average() {
        int sum = 0;

        for (int score : this.scores) {
            sum += score;
        }

        return (double)sum / this.scores.size();
    }

    // Returning String to handle the "-". Handle at UserInterface.
    public String averagePassingGrade() {
        int sum = 0;
        int numberOfGrades = 0;

        for (int score : this.scores) {
            if (score >= 50) {
                sum += score;
                ++numberOfGrades;
            }
        }
        // Prevent division by 0
        if (numberOfGrades == 0) {
            return "-";
        }

        return String.valueOf((double)sum / numberOfGrades);
    }

    public double passPercentage() {
        int passing = 0;

        for (int score : scores) {
            if (score >= 50) {
                ++passing;
            }
        }

        return 100.0 * passing / this.scores.size();
    }

    public String gradingDistribution() {
        String zero = "";
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five = "";

        for (int score : this.scores) {
            if (score < 50) {
                zero += "*";
            } else if (score < 60) {
                one += "*";
            } else if (score < 70) {
                two += "*";
            } else if (score < 80) {
                three += "*";
            } else if (score < 90) {
                four += "*";
            } else {
                five += "*";
            }
        }

        return "5: " + five + "\n" +
               "4: " + four + "\n" +
               "3: " + three + "\n" +
               "2: " + two + "\n" +
               "1: " + one + "\n" +
               "0: " + zero;
    }

}
