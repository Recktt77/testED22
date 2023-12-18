package HomeWork1.Cars;

public class Lorry extends Car{
    public int carring;
    public Lorry(int carring,String brand, String Cclass, int weight){
        super(brand, Cclass, weight);
        this.carring=carring;
    }
}
