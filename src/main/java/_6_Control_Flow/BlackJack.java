package _6_Control_Flow;

public class BlackJack {
  public static void main(String[] args) {
    String card = "king";
    int currentTotalValue = 15;

    int currentValue = switch (card) {
      case "king", "queen", "jack" -> 10;
      case "ace" -> {
        yield currentTotalValue <= 10 ? 11 : 1;
      }
      default -> Integer.parseInt(card);
    };
    System.out.printf("Current Card Value: %d%n", currentValue);
    System.out.printf("Total Value: %d%n", currentTotalValue + currentValue);
  }
}
