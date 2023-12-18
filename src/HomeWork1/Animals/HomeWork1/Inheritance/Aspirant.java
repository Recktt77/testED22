package HomeWork1.Inheritance;

public class Aspirant extends Student{
    public String sciWork;
    public Aspirant(String firstName,String lastName,String group,double averageMark, String sciWork){
        super(firstName,lastName,group,averageMark);
        this.sciWork=sciWork;
    }
    public void getScholarship(double averageMark){
        if(averageMark==5){
            System.out.println("$200");
        }
        else
            System.out.println("$180");
    }
}
