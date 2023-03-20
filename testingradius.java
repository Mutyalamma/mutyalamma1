class eekshi{
    int radius;
    //public double rad()
    public double rad(int r){
        return 3.14*radius*radius;
    }

}
public class testingradius {
    public static void main(String[] args) {
        eekshi e=new eekshi();
        e.radius=70;
        //System.out.println(e.rad());

    }
}
