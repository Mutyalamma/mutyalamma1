
class ekshi
{ public void add(int x, int y)
    {
        System.out.println(x+y);
    }
}
class tarun extends ekshi   {
    public void sub(int x, int y)
        {
            System.out.println(x-y);
        }
}
class sai extends tarun
{
    public void multi(int x, int y)
    {
        System.out.println(x*y);
    }
}
class ram extends sai
{
public void div(int x, int y)
{
    System.out.println(x/y);
}
}

public class inheritance {
    public static void main(String[] args) {

      ram r=new ram();
      r.add(78,90);
      r.sub(90,34);
      r.multi(23,78);
      r.div(90,3);

    }
}
