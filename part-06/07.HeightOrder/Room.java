import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person toReturn = this.persons.get(0);
        for (Person person : this.persons) {
            if (person.getHeight() < toReturn.getHeight()) {
                toReturn = person;
            }
        }
        return toReturn;
    }

    public Person take() {
        Person toRemove = this.shortest();
        this.persons.remove(toRemove);
        return toRemove;
    }
}
