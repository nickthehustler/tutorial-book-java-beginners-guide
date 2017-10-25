class Test {
  static void vaTest(int ... v) {
    System.out.println("Number of args: " + v.length);
    System.out.println("Contents: ");

    for(int i = 0; i < v.length; i++)
      System.out.println(" arg " + i + ": " + v[i]);

    System.out.println();
  }

  public static void main(String args[]) {
    Test.vaTest(1, 2, 3, 4, 5);

    Test.vaTest(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
  }
}
