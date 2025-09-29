import entities.Animal;
import entities.Zoo;

public class App {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Hmem", 3, "tunis");
        Animal a = new Animal("tigre", "felin", 5, true);
        
        zoo.addAnimal(a);
        zoo.displayAnimals();
    }
}
