public class Controller {
    private Dog dog;
    private Cat cat;
    private Tree tree;

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createPark();
        controller.start();
    }

    private void createPark() {
        dog = new Dog();
        cat = new Cat();
        tree = new Tree();
    }

    private void start() {
        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
        dog.chase(cat);
        cat.climb(tree);
        if( dog.climb(tree) ) {
            dog.eat(cat);
        } else {
            Animal animal = dog.jump(tree);
            dog.chase(animal);
        }

    }
}
