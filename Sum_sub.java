package hierarchal_inheritance;

public class Sum_sub extends Data{
    public int sum(){
        return n1+n2;
    }
    public int sub(){
        return n2-n1;
    }

    public static void main(String[] args) {
        Sum_sub s=new Sum_sub();
        System.out.println(s.sum());
        System.out.println(s.sub());
    }

    
}
