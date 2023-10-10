import java.util.Scanner;
import java.time.LocalDate;

public class agecalculator_test{
    public static void main(String [] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your age in YYYY-MM-DD: ");
        String date=obj.nextLine();

        LocalDate localdate = LocalDate.parse(date);
        int year1 = localdate.getYear();

        LocalDate localdate2 = LocalDate.now();
        int year2 = localdate2.getYear();
        int age = year2 - year1;
 
        System.out.println("Your age is : "+age);
    }
}