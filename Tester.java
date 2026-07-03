class Customer{
    private int custId;
    private String custName;
    public Customer(){
        System.out.println("Customer");
    }
    public int getcustId(){
        return custId;
    }
    public void setcustId( int custId){
        custId= custId;
    }
    
    public void setcustName(String custName) {
      custName = custName;
    }
}

class Guest extends Customer{
    private int delcharges;
    public guest(){
        System.out.println("guest customer");
    }
}

class Regular extends Customer{
     private int disc;
     public regular{
         system.out.println("Regular Customer");

     }

}
class Premium extends Regular{

}

public class Tester {

     public static void main(String[] args) {
        customer obj = new customer();
        guest gobj = new guest();
        regular robj = new regular();
        premium pobj = new premium();

    }
}