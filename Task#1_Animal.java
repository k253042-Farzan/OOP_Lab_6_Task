package Lab07Task01;

public class Animal {
    void makeSound(){
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {
    void makeSound(){
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void makeSound(){
        System.out.println("Cat meows.");
    }
}


class Main {
    public static void main(String[] args){
        Animal d = new Dog();
        Animal c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}

