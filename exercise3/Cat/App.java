package Cat;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("JIU'S ADORABLE HIMALAYAN CAT!");

        // Create object from pet class
        Pet myPet = new Pet();
        
        System.out.println("Name: " + myPet.name);
        System.out.println("Age: " + myPet.age);
        
        myPet.meow();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.furColor);
        System.out.println(myPet.furLength);
        System.out.println(myPet.headShape);
    }
}
