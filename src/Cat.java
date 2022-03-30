public class Cat extends Animal {

    public Cat() {
        super("cat");
    }

    public boolean climb(Tree tree) {
        System.out.println("Cat climbs into tree");
        tree.setAnimal(this);
        return true;
    }

    @Override
    public Animal jump(Tree tree) {
        return null;
    }

    @Override
    public String makeSound() {
        return "Miav";
    }
}
