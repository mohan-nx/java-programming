import java.util.Scanner;

public class Marks{
    public static void main(String[] args ){
        Scanner Scanner = new Scanner(System.in);
        int marks= Scanner nextInt();

        if (marks>=90)
            System.out.println("grade a ");

        else if (marks >=80)
            System.out.println("grade b");

        else{
            System.out.println("fail");
        }
    }
}