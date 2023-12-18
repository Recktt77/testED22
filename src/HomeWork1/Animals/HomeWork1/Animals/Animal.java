package HomeWork1.Animals;

public class Animal {
    public String food;
    public String location;

    public Animal(String food, String location){
        this.food=food;
        this.location=location;
    }
    public void makeNoise(String voice){
        System.out.println("Voice: "+voice);
    }
    public void eat(String breed, String food){
        System.out.println(breed+" is eating "+ food);
    }
    public void sleep(String location, String breed){
        System.out.println(breed+" is sleeping in "+location);
    }
    public static void testAnimal(Animal animal) {
        System.out.println("Food: " + animal.food);
        System.out.println("Location: " + animal.location);
    }
    public static void main(String[] args){
        Dog dog1=new Dog("Bark", "Lablador", "45", "Meat", "House");
        Cat cat1=new Cat("Meaw", "Britan", "20", "Milk", "Chair");
        Horse horse1=new Horse("Igo", "Zhorga", "330", "Grass", "Fild");
        Animal[] animal1={ new Dog("Bark", "Lablador", "45", "Meat", "House"),
                new Cat("Meaw", "Britan", "20", "Milk", "Chair"),
                new Horse("Igo", "Zhorga", "330", "Grass", "Fild")
        };
            dog1.makeNoise(dog1.voice);
            cat1.eat(cat1.breed, cat1.food);
            horse1.sleep(horse1.location, horse1.breed);
        for (Animal animal : animal1) {
            testAnimal(animal);
            System.out.println(" ");
        }
    }
}
