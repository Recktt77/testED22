package HomeWork1.Inheritance;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;
    public Student(String firstName,String lastName,String group,double averageMark){
        this.firstName=firstName;
        this.lastName=lastName;
        this.group=group;
        this.averageMark=averageMark;
    }
    public void getScholarship(double averageMark){
        if(averageMark==5){
            System.out.println("$100");
        }
        else
            System.out.println("$80");
    }
    public static void main(String[] args){
        Student first=new Student("Kim", "lim", "SE", 4);
        Aspirant second=new Aspirant("Li", "Min", "CS", 5, "JKO");
        first.getScholarship(first.averageMark);
        second.getScholarship(second.averageMark);
    }
}

