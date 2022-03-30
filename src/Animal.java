public abstract class Animal {
    private final String animalType;

    protected Animal(String animalType) {
        this.animalType = animalType;
    }

    public abstract String makeSound();

    public boolean climb(Tree tree) {
        System.out.println(animalType + " failed to climb tree");
        return false;
    }

    public abstract Animal jump(Tree tree);

    public void eat(Animal otherAnimal) {
        System.out.println(animalType + " eats " + otherAnimal.animalType);
    }

    @Override
    public String toString() {
        return animalType;
    }
}
