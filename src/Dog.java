public class Dog extends Animal {

    public Dog() {
        super("dog");
    }

    public Animal jump(Tree tree) {
        Animal animal = tree.getAnimal();
        System.out.println("Dog shakes " + animal + " out of tree");
        return animal;
    }

    public void chase(Animal otherAnimal) {
        System.out.println("Dog chasing: " + otherAnimal);
    }

    @Override
    public String makeSound() {
        return "Vuf";
    }
}
