//TODO: WAP in java to calculate the profit or loss

public class ProfitAndLoss {

  public static void main(String[] args) {
    double costPrice = 112.09,
      sellingPrice = 223.34;
    double profit = sellingPrice - costPrice;
    double loss = costPrice - sellingPrice;
    double profitPercentage = (profit / costPrice) * 100;
    double lossPercentage = (loss / costPrice) * 100;
    System.out.println("Profit Percentage: " + profitPercentage);
    System.out.println("Loss Percentage: " + lossPercentage);
    if (sellingPrice > costPrice) System.out.println("Profit");
    else if (sellingPrice < costPrice) System.out.println("Loss");
    else System.out.println("No profit No loss");
  }
}
