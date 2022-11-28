package _5_Numbers;

//                    74. Numeric Wrapper Classes
public class WrapperClasses {
  public static void main(String[] args) {
    int num1 = 7;
    Integer num1B = Integer.valueOf(num1);// auto-boxing
    Double myDouble = Double.valueOf(2343.12);
    Float myFloat = Float.valueOf(2343.12f);
    Byte myByte = Byte.valueOf("23");
    storeData(num1);

//    Convert from String to number
    int age = Integer.parseInt(args[0]);
    double amount = Double.parseDouble("345.12");
    byte myByte2 = Byte.parseByte("127");
    System.out.println(Boolean.parseBoolean("10<5"));// false

    System.out.printf("You will be %d years of age in 1 year.%n", age + 1);
  }

  /**
   * Takes in any type of data and stores is somewhere generically
   */
  public static void storeData(Object obj) {
    // do something with obj
  }
}

