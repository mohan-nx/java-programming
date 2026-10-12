import java.util.Scanner;

public class MatrixAddation {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int a[][]=ScannerInput();
        int b[][]=ScannerInput();
        int c[][]=new int[2][2];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
