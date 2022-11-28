package codewars;

/*
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot
contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

Examples (Input --> Output)
"1234"   -->  true
"12345"  -->  false
"a234"   -->  false

 */

public class ValidatePin {
  public static boolean validatePin(String pin) {
    return pin.matches("\\d{4}|\\d{6}");
  }

  public static void main(String[] args) {
    System.out.println("1235".matches("\\d{4}"));
    System.out.println("123456".matches("\\d{4}|\\d{6}"));
  }
}
