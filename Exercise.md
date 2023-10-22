**Animal Hierarchy**

Design a Java superclass called "Animal" and a subclass called "Dog" for representing animals in an animal hierarchy. The superclass should contain common attributes and methods that are applicable to all animals, while the subclass should **inherit from the superclass** and add specific attributes and methods related to dogs.

Requirements:

1. The superclass "Animal" should have the following attributes:

- name (String): representing the name of the animal.
- age (int): representing the age of the animal.

    The superclass should also include appropriate getter and setter methods for these attributes.

2. The superclass "Animal" should have the following methods:

- displayDetails(): a method that displays the details of the animal, including its name and age.

3. The subclass "Dog" should inherit from the superclass "Animal" and add the following attributes:

- breed (String): representing the breed of the dog.

- color (String): representing the color of the dog.

    The subclass should include appropriate getter and setter methods for these attributes.

4. The subclass "Dog" should also have an additional method:

- makeSound(): a method that simulates the dog making a sound. 

    You can simply print a message such as "Woof! Woof!".

