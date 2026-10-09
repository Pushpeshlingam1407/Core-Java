public class SwitchCase3 {

  public static void main(String[] args) {
    String day = "Wednesday";
    switch (day) {
      case "Monday", "Tuesday", "Wednesday":
        System.out.println("Idly");
        break;
      case "Thursday":
        System.out.println("Dosa");
        break;
      case "Friday", "Saturday", "Sunday":
        System.out.println("Chapati");
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
  }
}
