
class raj{
    int radius;
    double area;
    public void set (int r){
    this.radius=r;
    }
    public double get ()
    {
        area=3.14*radius*radius;
        return area;
}
public class getm {
    public static void main(String[] args) {
        raj r=new raj();
    r.set(90);
        System.out.println(r.get());
    }
}

}
