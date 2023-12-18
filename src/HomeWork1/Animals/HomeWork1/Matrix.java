package HomeWork1;

public class Matrix {
    public int row;
    public int column;
    public int[][] array=new int[row][column];
    public Matrix(int[][] array, int row, int column){
        this.array=array;
        this.row=row;
        this.column=column;
    }
    public static int[][] addition(int[][] array, int[][] array2, int row, int column){
        int[][] arrayadd=new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arrayadd[i][j]=array[i][j]+array2[i][j];
            }
        }
        return arrayadd;
    }
    public static int[][] multiplication(int[][] array, int[][] array2, int row, int column){
        int[][] arraymult=new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arraymult[i][j]=array[i][j]*array2[j][i];
            }
        }
        return arraymult;
    }
    public static void printout(int[][] arrayadd, int[][] arraymult, int row, int column){
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arrayadd[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arraymult[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        int[][] arraytest={{1,2},{3,2}};
        int[][] arraytest2={{5,6},{6,2}};
        Matrix arraymain=new Matrix(arraytest,2, 2);
        Matrix arraymain2=new Matrix(arraytest2,2, 2);
        printout(addition(arraymain.array, arraymain2.array, arraymain.row,arraymain.column),multiplication(arraymain.array, arraymain2.array, arraymain.row,arraymain.column),2,2);
    }
}
