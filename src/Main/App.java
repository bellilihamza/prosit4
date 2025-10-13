package Main;
import entities.*;

public class App {
    public static void main(String[] args) {
        Zoo z = new Zoo("AquaZoo", 20, "Tunis");

        z.addquaticAnimal(new Dolphin("Flipper", "Delphinidae", 5, true, "Mer", 25));
        z.addquaticAnimal(new Penguin("Tux", "Spheniscidae", 3, false, "Banquise", 40));
        z.addquaticAnimal(new Penguin("Pingo", "Spheniscidae", 4, false, "Antarctique", 60));

        System.out.println("\n--- Tous les animaux nagent ---");
        z.makeAllSwim();

        System.out.println("\nProfondeur maximale des pingouins : " + z.maxPenguinSwiming() + " m");
        System.out.println();
        z.diplayNumberOfAquaticsByType();
    }
}
