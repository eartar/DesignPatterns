package pattern.factory.basic.solution;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderFood {
    private String username;
    private String password;

    public static class Factory{
        public static OrderFood YemekSepeti(String username, String password)
        {
            String encryptedUsername = FakeEncryption.EncryptRSA(username, "YemekSepetiSecretKey");
            String encryptedPassword = FakeEncryption.EncryptRSA(password, "YemekSepetiSecretKey");
            return new OrderFood(encryptedUsername, encryptedPassword);
        }

        public static OrderFood GetirYemek(String username, String password)
        {
            String encryptedUsername = FakeEncryption.EncryptAES(username, "GetirYemekSecretKey");
            String encryptedPassword = FakeEncryption.EncryptAES(password, "GetirYemekSecretKey");
            return new OrderFood(encryptedUsername, encryptedPassword);
        }
    }


}
