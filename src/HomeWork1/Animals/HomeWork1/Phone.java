package HomeWork1;

//   1.	Create a Phone class that contains the number, model, and weight variables
public class Phone {
    public String number;
    public String model;
    public int weight;

    public static void main(String[] args){
        //   2.	Create three instances of this class.
        Phone phone=new Phone("278136","s2",67);
        Phone phone1=new Phone("8137121", "s3", 78);
        Phone phone2=new Phone("72736718", "s4", 89);
        //   3.	Print the values of their variables to the console.
        System.out.println("number:"+phone.getNumber()+ "model:"+phone.getModel()+"weight:"+phone.getWeight());
        System.out.println("number:"+phone1.getNumber()+ "model:"+ phone1.getModel()+"weight:"+phone1.getWeight());
        System.out.println("number:"+phone2.getNumber()+ "model:"+phone2.getModel()+"weight:"+phone2.getWeight());
        phone1.receiveCall("Ken Block", phone1.getNumber());
        phone2.receiveCall("Ken Block");
        sendMessage(phone.getNumber(), phone1.getNumber(), phone2.getNumber());
    }
    //   4.	Add methods to the Phone class: receiveCall, has one parameter - the name of the caller. Prints the message “{name} is ringing” to the console. getNumber method - returns the phone number. Call these methods for each of the objects.
    public void receiveCall(String name){
        System.out.println(name + "is ringing");
    }
    //    public String getNumber(String number){
//        return number;
//    }
    //5.Add a constructor to the Phone class that takes three parameters as input to initialize the class variables - number, model and weight.
//    public Phone(String number, String model, int weight){
//        this.number=number;
//        this.model=model;
//        this.weight=weight;
//    }
    //6.Add a constructor that takes two parameters as input to initialize class variables - number, model.
    public Phone(String number, String model){
        this.number=number;
        this.model=model;
    }
    public Phone(){
        //7.Add constructor without parameters.
    }
    //8.Call a constructor with two parameters from a constructor with three parameters.
    public Phone(String number, String model, int weight){
        this(number, model);
        this.weight=weight;
    }
    //9.	Add an overloaded receiveCall method that takes two parameters - the name of the caller and the phone number of the caller. Call this method.
    public void receiveCall(String name, String number){
        System.out.println(name+ ":"+number);
    }
    //10.Create a sendMessage method with variable length arguments. This method accepts as input the phone numbers to which the message will be sent. The method prints the numbers of these phones to the console.
    public static void sendMessage(String... phoneNumbers) {
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
    //11.JavaBean
    public String getNumber() {
        return number;
    }
    public void getNumber(String number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void getModel(String model) {
        this.model = model;
    }
    public double getWeight() {
        return weight;
    }
    public void getWeight(int weight) {
        this.weight = weight;
    }
}



