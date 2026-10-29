
public class Pattern16 {
    public static void main(String[] args) {
        int rows = 7, cols = 7;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i + j == 6 || (i == 3) || (i == 4 && j == 1)
                    || (i == 4 && j == 2) || (i == 5 && j == 1)) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
