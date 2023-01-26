abstract class Animal implements IMakeNoise, IMakeTrick {
    int age;
    String name;

    Animal(){
        int age = 15;
        String name = "Svinq";
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("My name is " + name + "I am " + age + "age");
    }

    public void makeTrick(){
        System.out.println("Look at my trick");
    }
}
