public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(){
        this("Vasya", 9999, "qwerty@gmail.com");

    }



    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "Unknown@gmail.com");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println(this.name +" "+ this.creditLimit +" "+ this.email);
    }


//    public String getName() {
//        return name;
//    }
//
//    public int getCreditLimit() {
//        return creditLimit;
//    }
//
//    public String getEmail() {
//        return email;
//    }


}
