package entities;

public class Aquatic extends Animal {
    protected String habitat;
    
    public Aquatic() {
        super();
    }
    
    public Aquatic(String nom, String family, int age, boolean isMammal, String habitat) {
        super(nom, family, age, isMammal);
        this.habitat = habitat;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
    
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}