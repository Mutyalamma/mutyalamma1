 class regexpress {
    String regex="^\\d{10}$";
    String num;
    public void set (String str){
        if (str.matches(regex)){
            System.out.println("correct number is set");
        }
        else {
            System.out.println("wrong number provided");
        }
    }

}
public class regex{
    public static void main(String[] args) {
        regexpress re= new regexpress();
        re.set("99080890786");
    }
}
