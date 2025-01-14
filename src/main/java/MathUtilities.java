 

public class MathUtilities{
    
  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd){
      Integer result = baseValue + valueToAdd;
      return result;
  } //passed

  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd){
      Double result = baseValue + valueToAdd;
      return result;
  } //passed

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Integer number) {
      Double result = (number.doubleValue() / 2);
      return result;
  } //passed

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number){
      if (number % 2 != 0) {
          return true;
      }
      return false;
  } //passed


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      return number * number;
  } //passed

}
