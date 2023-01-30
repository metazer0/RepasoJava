import java.util.Scanner;

public class BiggestPetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pett hulda = new Pett("Hulda", "Golden retriever");
        PersonaDos leo = new PersonaDos("Leo", hulda);

        System.out.println(leo);
    }
}

class PersonaDos{
    private String name;
    private Pett pet;

    public PersonaDos(String name, Pett pet) {
        this.name = name;
        this.pet = pet;
    }

    public PersonaDos(String name) {
        this(name, new Pett("Toothless", "dragon"));
    }

    public PersonaDos() {
        this("Lilo", new Pett("Stitch", "blue alien"));
    }

    @Override
    public String toString() {
        return this.name + ", " + "has a friend called " + pet.getName() + " (" +
                pet.getBreed() + ")";
    }
}
class Pett{
    private String name;
    private String breed;

    public Pett(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}