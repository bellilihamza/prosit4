package entities;
public class Zoo {
    private String nom;
    private String city;
    private Animal[] animals;
    private int nbrCages; 

    public Zoo(String nom, int capacite, String city) {
        setNom(nom); 
        this.city = city;
        this.animals = new Animal[capacite];
        this.nbrCages = 0;
    }

    public String getNom() {
        return nom;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            System.out.println("Le nom d'un zoo ne doit pas etre vide.");
        }
        this.nom = nom;
    }

    public void setCity(String city) {
        this.city = city;
    }

   public boolean addAnimal(Animal a){
    if (isZooFull()){
        return false;
    }   

    animals[nbrCages]=a;
    nbrCages++;
    return true;

   }  
public void displayAnimals() {
        for (int i = 0; i < nbrCages; i++) {
            System.out.println(animals[i].toString());
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i].getNom().equals(animal.getNom())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;
        for (int i = index; i < nbrCages - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrCages - 1] = null;
        nbrCages--;
        return true;
    }
    public boolean isZooFull() {
        return nbrCages == animals.length ;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrCages >= z2.nbrCages) return z1;
        return z2;
    }

    public String toString() {
        return "Zoo " + getNom() + " à " + city + " contient " + nbrCages + " animaux.";
    }
    
}
