public class Main {
    public static void main(String[] args) {
        Pet myPet = new Pet("Tootsie", "JM");
        
        System.out.println(Movement.makeSound(myPet));
        System.out.println(Movement.eat(myPet));
    }
}
