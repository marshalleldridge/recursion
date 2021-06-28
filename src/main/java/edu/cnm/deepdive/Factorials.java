package edu.cnm.deepdive;

public class Factorials {

  public static long computeRecursive(int num) {
    if (num<0) {
      throw new IllegalArgumentException();
    }

    return (num == 0) ? 1 : (num * computeRecursive(num-1));
  }
  
}
