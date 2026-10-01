class TypeCasting {
    public static void main(String[] args) {
        // Widening converts a smaller numeric type to a larger one.
        int d = 10;
        double p = (double) d; // Explicit cast to double.
        double p1 = d; // The compiler widens int to double automatically.
        System.out.println("Before Widening: " + d);
        System.out.println("After Widening: " + p);

        // Narrowing to a smaller type may lose data.
        double v1 = 19.99;
        // Casting to int discards the fractional part.
        int t1 = (int) v1;
        System.out.println("Before Narrowing: " + v1);
        System.out.println("After Narrowing: " + t1);
    }
}
