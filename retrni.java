public class retrni {
    public static int st (int x, int y)
     {
        int z= x*y;
        return z;
     }
     public static int ss(int x,int y)
     {
        int d=x/y;
        return d;
     }
     public static String s(String str)
     {
    String k=str.toUpperCase();
    return k;
     }

    public static void main(String[] args) {
        int j= st(4,7); int d=ss(90,10);
        System.out.println(j);
        System.out.println(d);
        System.out.println(s("Mohan"));
    }
}
