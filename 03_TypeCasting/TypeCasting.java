class TypeCasting {
    public static void main(String[] args) {
        //TODO: Widening converts a smaller numeric type to a larger type automatically.
        int d = 10;
        double p = (double) d; // Explicit cast to double.
        double p1 = d; // The compiler widens int to double automatically.
        System.out.println("Before Widening: " + d);
        System.out.println("After Widening: " + p);

        //TODO: Narrowing converts to a smaller type and may lose data.
        double v1 = 19.99;
        //? Casting 19.99 to int keeps only 19 and discards the fractional part.
        int t1 = (int) v1;
        System.out.println("Before Narrowing: " + v1);
        System.out.println("After Narrowing: " + t1);
    }
}
