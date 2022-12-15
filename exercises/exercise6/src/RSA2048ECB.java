import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;

public class RSA2048ECB {
    private PublicKey publicKey;
    private PrivateKey privateKey;
    private static final int KEY_SIZE = 2048;
    private static final String CIPHER = "RSA/ECB/PKCS1Padding";

    private static RSA2048ECB rsa2048ECB;
    private RSA2048ECB (){}


    public static RSA2048ECB getRsa2048ECB() {
        if (rsa2048ECB == null) {
            rsa2048ECB = new RSA2048ECB();
            try {
                rsa2048ECB.init();
            } catch (Exception ignored) {
            }
        }
        return rsa2048ECB;
    }

    private void init() throws Exception {
        // init key
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(KEY_SIZE);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        this.publicKey = keyPair.getPublic();
        this.privateKey = keyPair.getPrivate();
    }

    public String encrypt(String originMessage) throws Exception {
        System.out.println("Original Message : " + originMessage);

        Cipher cipher = Cipher.getInstance(CIPHER);
        cipher.init(Cipher.ENCRYPT_MODE, this.publicKey);

        byte[] messageInBytes = originMessage.getBytes();
        byte[] encryptedBytes = cipher.doFinal(messageInBytes);
        String base64EncryptedStr = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("Encrypted Message : " + base64EncryptedStr);
        return base64EncryptedStr;
    }

    public String decrypt(String encryptedMessage) throws Exception {
        System.out.println("Encrypted Message : " + encryptedMessage);

        Cipher cipher = Cipher.getInstance(CIPHER);
        cipher.init(Cipher.DECRYPT_MODE, this.privateKey);

        byte[] messageInBytes = Base64.getDecoder().decode(encryptedMessage);
        byte[] decryptedBytes = cipher.doFinal(messageInBytes);
        String decryptedMessage = new String(decryptedBytes);
        System.out.println("Decrypted Message : " + decryptedMessage);
        return decryptedMessage;
    }

    public String sign(String originMessage) throws Exception {
        System.out.println("Original Message : " + originMessage);

        Signature privateSignature = Signature.getInstance("SHA256withRSA");
        privateSignature.initSign(this.privateKey);

        byte[] messageInBytes = originMessage.getBytes();
        privateSignature.update(messageInBytes);
        byte[] signature = privateSignature.sign();
        String base64Signature = Base64.getEncoder().encodeToString(signature);
        System.out.println("Signature : " + base64Signature);
        return base64Signature;
    }

    public boolean verify(String originMessage, String signature) throws Exception {
        System.out.println("signature : " + signature);
        Signature publicSignature = Signature.getInstance("SHA256withRSA");
        publicSignature.initVerify(publicKey);
        byte[] messageInBytes = originMessage.getBytes();
        publicSignature.update(messageInBytes);

        byte[] signatureBytes = Base64.getDecoder().decode(signature);
        boolean verifyResult = publicSignature.verify(signatureBytes);
        System.out.println("Verify Result : " + verifyResult);
        return verifyResult;
    }
}
