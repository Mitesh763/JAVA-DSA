package _24_OOPS._4_Package;

class Account {
    // public modifier -- access anywhere
    public String name;

    // default modifier - only same package
    String username;

    // protected modifier - current package ANYWHERE AND DIFFERENT PACKAGE SUBCLASS ONLY
    protected String email;

    // private modifier -- ONLY CLASS
    private String password;

    // getter
    public String getpass(){
        return password;
    }

    // setter
    public void setPassword(String str){
        this.password = str;
    }
}
public class _4_Package {
    public static void main(String args[]){
        Account ac1 = new Account();
        ac1.setPassword("123q");
        System.out.println(ac1.getpass());
    }
}
