package _8_more_oop;

public enum WeekDays {
  SUNDAY("pot roast"),
  MONDAY("spaghetti"),
  TUESDAY("tacos"),
  WEDNESDAY("chicken"),
  THURSDAY("meatloaf"),
  FRIDAY("hamburgers"),
  SATURDAY("pizza");

  private String meal;

  WeekDays(String meal) {
    this.meal = meal;
  }

  public String getMeal() {
    return this.meal;
  }
}
