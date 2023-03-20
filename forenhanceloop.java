
class forenhanceloo
{
    public int multi(int ...arr)
    {
        int m=1;
        for (int a:arr)
        {
            m=m*a;
        }
        return m;
}}
public class forenhanceloop {
    public static void main(String[] args) {
        varchpra v= new varchpra();
        int mul= v.multi(4,5,9,9,7);
        System.out.println(mul);
}
}
