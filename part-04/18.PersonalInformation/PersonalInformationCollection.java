import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();

        while (true) {
            System.out.print("First name: ");
            String firstName = scan.nextLine();

            if (firstName.equals("")) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scan.nextLine();
            System.out.print("Identification number: ");
            String identificationNumber = scan.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName,
                                                        identificationNumber));
        }

        System.out.println("");
        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }

}
