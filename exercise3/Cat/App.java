package Cat;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("JIU'S ADORABLE HIMALAYAN CAT!");
        System.out.println(" ");

        System.out.println("Name: LEO");
        System.out.println("Age: 4 years old");
        System.out.println(" ");

        System.out.println("About LEO!");

        // Create object from pet class
        Pet myPet = new Pet();

        myPet.meow();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.furColor);
        System.out.println(myPet.furLength);
        System.out.println(myPet.headShape);
    }
}