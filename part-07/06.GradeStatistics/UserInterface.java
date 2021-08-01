import java.util.Scanner;

public class UserInterface {

    private Scores scores;
    private Scanner scan;

    public UserInterface(Scanner scan, Scores scores) {
        this.scan = scan;
        this.scores = scores;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        String input = "";
        while (!input.equals("-1")) {
            input = scan.nextLine();
            scores.addScore(Integer.valueOf(input));
        }

        this.printResults();
    }

    public void printResults() {
        System.out.println("Point average (all): " + scores.average());
        System.out.println("Point average (passing): " + scores.averagePassingGrade());
        System.out.println("Pass percentage: " + scores.passPercentage());
        System.out.println("Grade distribution:");
        System.out.println(scores.gradingDistribution());
    }

}
