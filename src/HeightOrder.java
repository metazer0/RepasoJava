import java.util.ArrayList;
import java.util.Objects;

public class HeightOrder {
    public static void main(String[] args) {
        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
    }
}

class Person{
    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }

    // Created with the insert code functionality of NetBeans
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.height != other.height) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}

class Room {

    ArrayList<Person> persons;

    public Room(){
        this.persons =  new ArrayList<Person>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){

        if(persons.isEmpty()){
            return null;
        }

        Person shortest = this.persons.get(0);

        for (Person person : persons) {
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }

        return shortest;
    }

    public Person take(){
        if(persons.isEmpty()){
            return null;
        }

        Person shortest = this.persons.get(0);

        for (Person person : persons) {
            if(shortest.getHeight() > person.getHeight()){
                shortest = person;
            }
        }

        persons.remove(shortest);

        return shortest;
    }


}
