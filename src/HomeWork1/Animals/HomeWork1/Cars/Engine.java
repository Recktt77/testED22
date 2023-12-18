package HomeWork1.Cars;

public class Engine extends Car{
    public String power;
    public String manufacture;
    public Engine(String power, String manufacture,String brand, String Cclass, int weight){
        super(brand, Cclass, weight);
        this.manufacture=manufacture;
        this.power=power;
    }
    public void cartoString(String power, String manufacture){
        System.out.println(power +" "+ manufacture+" ");
    }
}
