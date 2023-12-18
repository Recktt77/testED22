package HomeWork1.Cars;

public class SportCar extends Car{
    public double speed;
    public SportCar(double speed,String brand, String Cclass, int weight){
        super(brand, Cclass, weight);
        this.speed=speed;
    }
}
