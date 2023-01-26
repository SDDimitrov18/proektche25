public class Cat extends Animal{

    public Cat(int age, String name) {
        super(age, name);
    }
    public void makeNoise(){
        System.out.println("Meow!.");
    }
    public void makeTrick(){
        System.out.println("No trick for you i am lazzy!");
    }
}
