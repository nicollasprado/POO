public class IP {
    private String binaryEquivalent;
    private String ipAddress;
    private String subnetMask;

    public IP(String ipAddres){
        this.ipAddress = ipAddres;
    }

    public IP(String ipAddress, String subnetMask){
        this.ipAddress = ipAddress;
        this.subnetMask = subnetMask;
    }


    public void generateBinaryEquivalent(){
        String ipStr = this.ipAddress;
        String binaryString = "";
        String buffer = "";
        int auxBufferIndex = 0;
        int iteredBits = 0;
        String numBlock = "";
        while(auxBufferIndex < ipStr.length()){
            if(buffer == "." && iteredBits == 8) {
                buffer = Character.toString(ipStr.charAt(auxBufferIndex));
            }
            else if(buffer != "."){
                buffer = Character.toString(ipStr.charAt(auxBufferIndex));
            }

            if(buffer != "."){
                numBlock += buffer;
            }
            else{
                int numBlockInt = Integer.parseInt(numBlock);

                if(iteredBits < 8){
                    binaryString = "0" + binaryString;
                }
                else if(iteredBits == 8){
                    iteredBits = 0;
                }
                numBlockInt %= 2;
                binaryString = (numBlockInt / 2) + binaryString;
                iteredBits++;
            }
            auxBufferIndex++;
        }
        this.binaryEquivalent = binaryString;
    }


    // Getters and Setters

    public String getBinaryEquivalent() {
        return binaryEquivalent;
    }

    public String getIpAdress() {
        return ipAddress;
    }

    public void setIpAdress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }
}
