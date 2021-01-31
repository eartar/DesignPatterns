package pattern.factory.basic.problem;

import lombok.Data;

@Data
public class OrderFood {
    private String username;
    private String password;

    public OrderFood(String username, String password, String provider) throws Exception {
        if (provider.equals("getir")) {
            this.username = FakeEncryption.EncryptRSA(username, "YemekSepetiSecretKey");
            this.password = FakeEncryption.EncryptRSA(password, "YemekSepetiSecretKey");
        } else if (provider.equals("yemeksepeti")) {
            this.username = FakeEncryption.EncryptAES(username, "GetirYemekSecretKey");
            this.password = FakeEncryption.EncryptAES(password, "GetirYemekSecretKey");
        } else
            throw new Exception("Unknown provider");

    }
}
