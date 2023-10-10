//age calculator
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your date of birth? (YYYY-MM-DD)");
    String dobString = scanner.next();


    int age = getAge(dobString);

    System.out.println("You are " + age + " years old.");

  }

  private static int getAge(String dobString) {
    LocalDate dob = LocalDate.parse(dobString);


    LocalDate now = LocalDate.now();

    int age = Period.between(dob, now).getYears();

    return age;
  }
}