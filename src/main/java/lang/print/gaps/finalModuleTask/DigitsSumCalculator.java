package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
  public void calculateSum(int number) {
    int summed = 0;

    while (number > 0) {
      int digit = number % 10;
      summed = summed + digit;
      number /= 10;
    }

    System.out.println(summed);
  }
}
