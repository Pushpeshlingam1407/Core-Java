//TODO: WAP in java to input marks of 5 subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following
/* Percentage >= 90 %: Grade A
   Percentage >= 80 %: Grade B
   Percentage >= 70 %: Grade C
   Percentage >= 60 %: Grade D
   Percentage >= 40 %: Grade E
   Percentage < 40 %:  Grade F*/

public class CalculateGrade {

  public static void main(String[] args) {
    int physics = 18,
      chemistry = 23,
      biology = 98,
      mathematics = 56,
      computer = 98;
    if (
      physics >= 0 &&
      physics <= 100 &&
      chemistry >= 0 &&
      chemistry <= 100 &&
      biology >= 0 &&
      biology <= 100 &&
      mathematics >= 0 &&
      mathematics <= 100 &&
      computer > 0 &&
      computer <= 100
    ) {
      double percentage =
        (physics + chemistry + biology + mathematics + computer) / 5.0;
      System.out.println("Percentage: " + percentage + "%");
      if (percentage < 0 || percentage > 100) System.out.println(
        "Invalid Percentage!!"
      );
      else if (percentage >= 90) System.out.println("Grade A");
      else if (percentage >= 80) System.out.println("Grade B");
      else if (percentage >= 70) System.out.println("Grade C");
      else if (percentage >= 60) System.out.println("Grade D");
      else if (percentage >= 40) System.out.println("Grade E");
      else System.out.println("Grade F");
    } else System.out.println("Invalid marks! Enter marks between 0 and 100");
  }
}
