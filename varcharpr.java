
class varchpra
{
    public int multi(int ...arr)
    {
        int m=1;
        for (int i=0;i<arr.length;i++)
        {
            m=m*arr[i];
        }
        return m;
}
}
public class varcharpr {
    public static void main(String[] args) {
        varchpra v= new varchpra();
        int mul= v.multi(4,5,8,9);
        System.out.println(mul);
    }

    }

