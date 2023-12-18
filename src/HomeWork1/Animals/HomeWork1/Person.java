package HomeWork1;

public class Person {
    public String fullName;
    public int age;

    public void move(){
        System.out.println(fullName+" is moving");
    }
    public void talk(){
        System.out.println(fullName+" is talking");
    }
    public Person(){

    }
    public Person(String fullName, int age){
        this.fullName=fullName;
        this.age=age;
    }

    public static void main(String[] args){
        Person person=new Person();
        Person person1=new Person("Ken Block", 27);
        person.move();
        person1.move();
        person.talk();
        person1.talk();
    }
}
