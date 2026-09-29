class TypeCasting{
    public static void main(String[] args){
        //* Widening Typecasting */
        int d=10;
        double p=(double) d;
        System.out.println("Before Widening: "+d);
        System.out.println("After Widening: "+p);

        //* Narrowing Typecasting */
        double v1=19.99;
        int t1=(int) v1;
        System.out.println("Before Narrowing: "+v1);
        System.out.println("After Narrowing: "+t1);
    }
}