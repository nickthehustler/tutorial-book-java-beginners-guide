class LogicalOpTable {

  public static int altAND(int x, int y) {
    if(x == 1 && x == y) return 1;

    return 0;
  }

  public static int altOR(int x, int y) {
    if(x == 1 || y == 1 ) return 1;

    return 0;
  }

  public static int altXOR(int x, int y) {
    if(x == y) return 0;

    return 1;
  }

  public static int altNOT(int x) {
    if(x == 1) return 0;

    return 1;
  }

  public static void main(String args[]) {

    boolean p, q;
    int x, y;

    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT(P)\tNOT(Q)");

    p = true; q = true;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t"   );
    System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));

    p = true; q = false;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t"   );
    System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));

    p = false; q = true;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t"   );
    System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));

    p = false; q = false;
    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t"   );
    System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));

    System.out.println("--------------------------------------------------------");

    System.out.println("X\tY\tAND\tOR\tXOR\tNOT(X)\tNOT(Y)");

    x = 1; y = 1;
    System.out.print(x + "\t" + y + "\t");
    System.out.print(LogicalOpTable.altAND(x,y) + "\t" + LogicalOpTable.altOR(x,y) + "\t"   );
    System.out.println(LogicalOpTable.altXOR(x,y) + "\t" + LogicalOpTable.altNOT(x) + "\t" + LogicalOpTable.altNOT(y));

    x = 1; y = 0;
    System.out.print(x + "\t" + y + "\t");
    System.out.print(LogicalOpTable.altAND(x,y) + "\t" + LogicalOpTable.altOR(x,y) + "\t"   );
    System.out.println(LogicalOpTable.altXOR(x,y) + "\t" + LogicalOpTable.altNOT(x) + "\t" + LogicalOpTable.altNOT(y));

    x = 0; y = 1;
    System.out.print(x + "\t" + y + "\t");
    System.out.print(LogicalOpTable.altAND(x,y) + "\t" + LogicalOpTable.altOR(x,y) + "\t"   );
    System.out.println(LogicalOpTable.altXOR(x,y) + "\t" + LogicalOpTable.altNOT(x) + "\t" + LogicalOpTable.altNOT(y));

    x = 0; y = 0;
    System.out.print(x + "\t" + y + "\t");
    System.out.print(LogicalOpTable.altAND(x,y) + "\t" + LogicalOpTable.altOR(x,y) + "\t"   );
    System.out.println(LogicalOpTable.altXOR(x,y) + "\t" + LogicalOpTable.altNOT(x) + "\t" + LogicalOpTable.altNOT(y));
  }
}
