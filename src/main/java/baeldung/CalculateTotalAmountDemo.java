package baeldung;

import formatting.CalculateTotalAmount;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculateTotalAmountDemo {
  public static void main(String[] args) {
    CalculateTotalAmount total = new CalculateTotalAmount("4.5",
            "2.69", "10", "7.25");

    System.out.println(total.calculateTotalAmount());
  }

  @Test
  public void givenPurchaseTxn_whenCalclatingTotalAmount_thenExpectedResult() {
    CalculateTotalAmount total = new CalculateTotalAmount("4.5",
            "2.69", "10", "7.25");

    assertEquals("11.68",
            total.calculateTotalAmount().toString());
  }
}
