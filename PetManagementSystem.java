public class PetManagementSystem {
    public static void main(String[] args) {
        PetService service = new PetService();
        System.out.println("Basic checkup fee: $" + service.calculateFee());
        System.out.println("Checkup with vaccination fee: $" + service.calculateFee(true));
        System.out.println("Full service fee: $" + service.calculateFee(true, true));
        System.out.println("Emergency fee: $" + service.calculateFee("Emergency"));

        System.out.println("\nWelcome to the Pet Clinic!");
        System.out.println("==========================");
        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Tweety", 1);

        dog.displayInfo();
        dog.makeSound();
        System.out.println();

        cat.displayInfo();
        cat.makeSound();
        System.out.println();

        bird.displayInfo();
        bird.makeSound();

        System.out.println("\nTraining Session Started!");
        System.out.println("=========================");
        Trainable tDog = (Trainable) dog;
        Trainable tBird = (Trainable) bird;

        tDog.performTrick();
        tBird.performTrick();
    }
}
