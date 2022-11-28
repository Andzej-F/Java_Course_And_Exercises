package formatting;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
  source: https://www.baeldung.com/java-bigdecimal-biginteger

   Let's write a method to calculate the total amount to
   be paid for an item given a quantity and unit price.
   Let's also apply a discount rate and sales tax rate.
   We round the final result to cents by using the setScale method:

    Example:
   quantity, unitPrice, discountRate, taxRate
   amount = quantity * unitPrice * ((100-discountRate)/100)*((100+taxRate)/100);
   amount = 4.5 * 2.69 * ((100-10)/100)*((100+7.25)/100);
   amount = 11.68435125 ~ 11.68
 */
public class CalculateTotalAmount {
  private BigDecimal quantity;
  private BigDecimal unitPrice;
  private BigDecimal discountRate;
  private BigDecimal taxRate;
  private final BigDecimal HUNDRED = new BigDecimal("100");

  public CalculateTotalAmount(String quantity, String unitPrice, String discountRate,
                              String taxRate) {
    this.quantity = new BigDecimal(quantity);
    this.unitPrice = new BigDecimal(unitPrice);
    this.discountRate = new BigDecimal(discountRate);
    this.taxRate = new BigDecimal(taxRate);
  }

  public BigDecimal calculateTotalAmount() {
    BigDecimal amount = this.quantity.multiply(this.unitPrice);
    BigDecimal discount = (HUNDRED.subtract(this.discountRate)).divide(HUNDRED);
    BigDecimal discountedAmount = amount.multiply(discount);
    this.taxRate = (HUNDRED.add(this.taxRate)).divide(HUNDRED);
    BigDecimal total = discountedAmount.multiply(this.taxRate);

    // round to 2 decimal places using HALF_UP
    BigDecimal roundedTotal = total.setScale(2, RoundingMode.HALF_UP);

    return roundedTotal;
  }
}
