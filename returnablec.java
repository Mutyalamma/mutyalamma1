class custonrc {
    int id;String str;
    public  int add()
    {
        System.out.println("my id is"+id+ " "+"my name is "+str);
        return id+1;
    }
}
public class returnablec{
    public static void main(String[] args) {
        custonc c= new custonc();
        c.id=90;c.str="muthyam";
        //System.out.println(c.add());

    }
}