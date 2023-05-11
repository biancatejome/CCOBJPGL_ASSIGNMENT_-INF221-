package Dog;

public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Maltichon myPet = new Maltichon();

        System.out.println("JIU'S ADORABLE MALTICHON!");
        System.out.println(" ");
        System.out.println("Name: " + myPet.Name);
        System.out.println(" ");

        myPet.bark();
        System.out.println(" ");
        System.out.println("Elle has " + myPet.eyeColor);
        System.out.println("She's " + myPet.Height);
        System.out.println("She has a " + myPet.headShape + " head");
        System.out.println("She has a " + myPet.furColor + " fur" );
        System.out.println("And, is very " + myPet.Temperament);
    }
}
