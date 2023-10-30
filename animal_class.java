class Animal {
    // Attributes
    String name;
    int age;

    Animal(String name){
        System.out.println("hello");
    }
//     // Constructor to initialize attributes
//     Animal(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

    // Getter for name
    String getName() {
        return name;
    }

    // Setter for name
    void setName(String name) {
        this.name = name;
    }

    // Getter for age
    int getAge() {
        return age;
    }

    // Setter for age
    void setAge(int age) {
        if (age >= 0) {  // Simple validation to ensure non-negative age
            this.age = age;
        } else {
            System.out.println("Invalid age value.");
        }
    }

    // Method to display details of the animal
    void displayDetails() {
        System.out.println("Name of the animal: " + name);
        System.out.println("Age of the animal: " + age + " years old");
    }
}

class Dog extends Animal {
    // Additional attributes for the Dog subclass
    String breed;
    String color;

    // // Constructor to initialize the attributes of Dog and the inherited attributes from Animal
    // Dog(String name, int age, String breed, String color) {
    //     super(name, age);  // Calls the constructor of the superclass (Animal) to initialize name and age
    //     this.breed = breed;
    //     this.color = color;
    // }

    // Getter for breed
    String getBreed() {
        return breed;
    }

    // Setter for breed
    void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter for color
    String getColor() {
        return color;
    }

    // Setter for color
    void setColor(String color) {
        this.color = color;
    }

    void makeSound() {
    System.out.println("Woof! Woof! Give me food!");
    }

}

// Testing
class Test {
    public static void main(String[] args) {
        // GPT suggested constructor, but it is not needed
        // Dog myDog = new Dog("Buddy", 5, "Golden Retriever", "Golden");
        
        Dog myDog = new Dog();
        // Setter demo
        myDog.setName("Evey");
        myDog.setAge(2);
        myDog.setBreed("Lab/hound");
        myDog.setColor("Black");


        myDog.displayDetails();
        myDog.makeSound();
    }
}
