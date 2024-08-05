package hierarchal_inheritance;

public class Multi_div extends Data{
    public int multi(){
        return n1*n2;
    }
    public int div(){
        return n2/n1;
    }

    public static void main(String[] args) {
        Multi_div m= new Multi_div();
        System.out.println(m.multi());
        System.out.println(m.div());
    }
    
}
