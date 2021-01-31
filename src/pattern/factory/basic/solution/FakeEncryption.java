package pattern.factory.basic.solution;

public class FakeEncryption {
    public static String EncryptRSA(String msg, String secret){
        byte[] msgArr = msg.getBytes();
        byte[] secretArr = secret.getBytes();

        for(int i = 0; i<msgArr.length;i++)
            msgArr[i] = (byte) (msgArr[i] ^ secretArr[i % (secretArr.length-1)]);

        return msgArr.toString();
    }
    public static String EncryptAES(String msg, String secret){
        byte[] msgArr = msg.getBytes();
        byte[] secretArr = secret.getBytes();

        for(int i = 0; i<msgArr.length;i++)
            msgArr[i] = (byte) (msgArr[i] ^ secretArr[i % (secretArr.length-1)]);

        return msgArr.toString();
    }
}
