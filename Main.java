import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int marks = scanner.nextInt();
        
        if(marks >=90)
        {
            System.out.println("grade A");
        }
        else if(marks >=80)
        {
            System.out.println("grade B");
        }
        else if(marks >=70)
        {
            System.out.println("grade C");
        }
        else if(marks >=60)
        {
            System.out.println("grade D");
        }
        else
        {
            System.out.println("grade F");
        }
    }
}