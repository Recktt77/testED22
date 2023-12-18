package HomeWork1;

public class Reader {
    public String fullName;
    public int[] cardNumber=new int[2];
    public String[] faculty=new String[3];
    public String data;
    public String phone;
    public Reader(String fullName, int[] cardNumber, String[] faculty, String data, String phone){
        this.fullName=fullName;
        this.cardNumber=cardNumber;
        this.faculty=faculty;
        this.data=data;
        this.phone=phone;
    }
    public void takeBook(String fullName, int[] cardNumber){
        System.out.println(fullName+" took "+ cardNumber[1]+ " books");
    }
    public void takeBook(String fullName, String[] faculty){
        System.out.print(fullName+" took books: ");
        for(int i=0; i<3; i++){
            System.out.print(faculty[i]+", ");
        }
        System.out.println(" ");
    }
    public void returnBook(String fullName, String[] faculty){
        System.out.print(fullName+" returned the books: ");
        for(int i=0; i<3; i++){
            System.out.print(faculty[i]+", ");
        }
        System.out.println(" ");
    }
    public void returnBook(String fullName, int[] cardNumber){
        System.out.println(fullName+" returned "+ cardNumber[1]+ " books");
    }
    public static void main(String[] args){
        int[] cardnumbertest= {123213,3};
        String[] facultytest={"Adventures", "Dictionary", "Encyclopedia"};
        Reader reader1=new Reader("Jack Hanma", cardnumbertest, facultytest, "23.10.2023", "87775557788");
        reader1.takeBook(reader1.fullName, reader1.cardNumber);
        reader1.takeBook(reader1.fullName, reader1.faculty);
        reader1.returnBook(reader1.fullName, reader1.cardNumber);
        reader1.returnBook(reader1.fullName, reader1.faculty);
    }
}
