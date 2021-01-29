package Animal;

public abstract class Animal {

    public int age;
    public Animal(int age){
        this.age = age;
        System.out.println("Animal has been created");

}
    public abstract void eat ();

    public void sleep(){
        System.out.println("The animal is sleeping.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        cat.eat();
        dog.sleep();

        //Casting
        Object dogie = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();
        realDog.ruff();

        Object str = "est";
        String realS =(String) str;

        //What happens when...
        Dog doggy = new Dog();
        if(doggy instanceof Animal){
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();
    

    }
}
