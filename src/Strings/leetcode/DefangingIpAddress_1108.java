package Strings.leetcode;

public class DefangingIpAddress_1108 {
    static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");//i requires regex engine for replace all instead of that you can simply use the replace method


    }
}
