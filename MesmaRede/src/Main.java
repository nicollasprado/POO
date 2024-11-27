public class Main {
    public static void main(String[] args) {
        IP ipAddr = new IP("10.10.10.254");
        ipAddr.generateBinaryEquivalent();
        System.out.println(ipAddr.getBinaryEquivalent());
    }
}