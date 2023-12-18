package HomeWork1.Cars;

public class Driver extends Car{
    public String fullName;
    public int experience;
    public Driver(String fullName, int experience,String brand, String Cclass, int weight){
        super(brand, Cclass, weight);
        this.fullName=fullName;
        this.experience=experience;
    }
    public void cartoString(String fullName, int experience){
        System.out.println(fullName +" "+ experience+" ");
    }
}
