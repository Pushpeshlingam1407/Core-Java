public class SwitchCase2 {

  public static void main(String[] args) {
    String day = "Monday";
    switch (day) {
      case "Monday":
        System.out.println("Idli");
      case "Tuesday":
        System.out.println("Vada");
      case "Wednesday":
        System.out.println("Chapati");
      case "Thursday":
        System.out.println("Paratha");
      case "Friday":
        System.out.println("Upma");
      case "Saturday":
        System.out.println("Lemon Rice");
      case "Sunday":
        System.out.println("Dosa");
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
  }
}
