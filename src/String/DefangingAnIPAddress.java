package String;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.256.1.1"));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }


}
