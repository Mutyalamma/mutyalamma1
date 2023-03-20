public class calcula {
        public void add(int num1,int num2)
        {
            System.out.println(num1+num2);
        }
        public void sub(int num1,int num2)
        {
            System.out.println(num1-num2);
        }
        public void mult(int num1,int num2)
        {
            System.out.println(num1*num2);
        }
        public void div(int num1,int num2)
        {
            System.out.println(num1%num2);
        }
    public static void main(String[] args) {
            calcula c= new calcula();
            c.add(15,34);
            //calcula d=new calcula();
            c.sub(56,12);
            //calcula e=new calcula();
            c.mult(12,12);
            //calcula f=new calcula();
            c.div(45,9);
    }
}
