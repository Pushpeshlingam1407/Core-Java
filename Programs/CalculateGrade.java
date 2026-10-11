//TODO: WAP in java to input marks of 5 subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following
/* Percentage >= 90 %: Grade A
   Percentage >= 80 %: Grade B
   Percentage >= 70 %: Grade C
   Percentage >= 60 %: Grade D
   Percentage >= 40 %: Grade E
   Percentage < 40 %:  Grade F*/

public class Prog8 {

  public static void main(String[] args) {
    int percentage = 88;
    if (percentage >= 90) System.out.println("Grade A");
    else if (percentage >= 80) System.out.println("Grade B");
    else if (percentage >= 70) System.out.println("Grade C");
    else if (percentage >= 60) System.out.println("Grade D");
    else if (percentage >= 40) System.out.println("Grade E");
    else System.out.println("Grade F");
  }
}
