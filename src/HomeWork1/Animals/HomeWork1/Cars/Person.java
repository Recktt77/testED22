package HomeWork1.Cars;

public class Person extends Driver{
    public int age;
    public Person(int age, String fullName, int experience, String brand, String Cclass, int weight){
        super(fullName, experience, brand,Cclass, weight);
        this.age=age;
    }
}
