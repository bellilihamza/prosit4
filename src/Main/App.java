package Main;
import entities.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== test de creation des objets avec constructeurs par defaut ===");
        
        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        
        
        System.out.println("\n=== Test de creation avec constructeurs parametres ===");
        
        Aquatic aquatic1 = new Aquatic("Poisson", "Aquatique", 2, false, "ocean");
        Terrestrial terrestrial1 = new Terrestrial("Lion", "Felin", 5, true, 4);
        Dolphin dolphin1 = new Dolphin("Flipper", "Mammifère marin", 8, true, "mer", 35.5f);
        Penguin penguin1 = new Penguin("Tux", "Oiseau", 3, false, "antarctique", 200.0f);
        
        System.out.println("\n===  Instruction 23 ===");
        System.out.println("Aquatic: " + aquatic1.toString());
        System.out.println("Terrestrial: " + terrestrial1.toString());
        System.out.println("Dolphin: " + dolphin1.toString());
        System.out.println("Penguin: " + penguin1.toString());
        
        System.out.println("\n=== Instruction 24 ===");
        System.out.print("Aquatic: ");
        aquatic1.swim();
        System.out.print("Dolphin: ");
        dolphin1.swim();
        System.out.print("Penguin: ");
        penguin1.swim();
        
        Zoo zoo = new Zoo("Zoo Aquatique", 10, "Tunis");
        
        zoo.addAnimal(aquatic1);
        zoo.addAnimal(terrestrial1);
        zoo.addAnimal(dolphin1);
        zoo.addAnimal(penguin1);
        
        System.out.println("\nAnimaux dans le zoo:");
        zoo.displayAnimals();
    }
}
