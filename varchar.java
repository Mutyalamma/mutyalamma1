
class vary{
    public int adding(int...arr)
    {  int s=0;
        for (int i=0;i<arr.length;i++){
            s=s+arr[i];
        }
return s;
    }

}

public class varchar {
    public static void main(String[] args) {
        vary v= new vary();
        int sum= v.adding(5,6);
        System.out.println(sum);


    }
}
