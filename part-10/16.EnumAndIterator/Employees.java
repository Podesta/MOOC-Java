import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {

    private List<Person> employeesList;

    public Employees() {
        this.employeesList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employeesList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        employeesList.addAll(peopleToAdd);
        // Also possible with stream
        /**
        peopleToAdd.stream().forEach(person -> {
            this.add(person);
        });
        **/
    }

    public void print() {
        Iterator<Person> iterator = employeesList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employeesList.iterator();

        while (iterator.hasNext()) {
            Person tmpPerson = iterator.next();
            if (tmpPerson.getEducation() == education) {
                System.out.println(tmpPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employeesList.iterator();

        while (iterator.hasNext()) {
            Person tmpPerson = iterator.next();
            if (tmpPerson.getEducation() == education) {
                iterator.remove();
            }
        }
    }

}
