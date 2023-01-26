public class Dog extends Animal{

    public Dog(int age, String name) {
        super(age, name);
    }

    public void makeNoise(){
        System.out.println("Woof!");
    }
    public void makeTrick(){
        System.out.println("Hold my paw, human!");
    }
}
