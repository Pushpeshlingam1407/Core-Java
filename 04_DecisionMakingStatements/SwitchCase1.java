//TODO: Switch Case

public class SwitchCase {

  public static void main(String[] args) {
    String day = "Thursday";
    switch (day) {
      case "Monday":
        System.out.println("Idli");
        break;
      case "Tuesday":
        System.out.println("Vada");
        break;
      case "Wednesday":
        System.out.println("Chapati");
        break;
      case "Thursday":
        System.out.println("Paratha");
        break;
      case "Friday":
        System.out.println("Upma");
        break;
      case "Saturday":
        System.out.println("Lemon Rice");
        break;
      case "Sunday":
        System.out.println("Dosa");
      default:
        System.out.println("Invalid input");
        break;
    }
  }
}
