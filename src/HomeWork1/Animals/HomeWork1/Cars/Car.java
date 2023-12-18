package HomeWork1.Cars;

public class Car {
    public String brand;
    public String Cclass;
    public int weight;
    public Car(String brand, String Cclass, int weight){
        this.brand=brand;
        this.Cclass=Cclass;
        this.weight=weight;
    }
    public static void start(){
        System.out.println("Let's go");
    }
    public static void stop(){
        System.out.println("Let's stop");
    }
    public static void turnRight(){
        System.out.println("Turn right");
    }
    public static void turnLeft(){
        System.out.println("Turn left");
    }
    public void cartoString(String brand, String Cclass, int weight){
        System.out.println(brand+" "+Cclass+" "+weight+ " ");
    }
    public static void main(String[] args){
        Lorry capacity= new Lorry(230, "Mercedes", "S", 2300);
        SportCar car1=new SportCar(370, "Audi", "A8", 3400);
        Person ken=new Person(27, "ken block", 13, "Audi", "Rs4", 1900);
        Engine motor= new Engine("640Hp", "W12", "Audi", "S8", 3000);
        start();
        stop();
        turnRight();
        turnLeft();
        car1.cartoString(car1.brand, car1.Cclass,car1.weight);
        motor.cartoString(motor.power, motor.manufacture);
        ken.cartoString(ken.fullName, ken.experience);

    }

}
