import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;
import java.security.SecureRandom;
import javax.crypto.spec.SecretKeySpec;

public class ASE256GMC {
    private SecretKey key;
    private byte[] IV;
    private static final int KEY_SIZE = 256;
    private static final String CIPHER = "AES/GCM/NoPadding";
    public static final int GCM_IV_LENGTH = 12;
    public static final int GCM_TAG_LENGTH = 16;

    private static ASE256GMC ase256GMC;
    private ASE256GMC (){}


    public static ASE256GMC getASE256GMC() {
        if (ase256GMC == null) {
            ase256GMC = new ASE256GMC();
            try {
                ase256GMC.init();
            } catch (Exception ignored) {
            }
        }
        return ase256GMC;
    }

    private void init() throws Exception {
        // init key
        KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(KEY_SIZE);
        this.key = generator.generateKey();

        // init IV
        byte[] IV = new byte[GCM_IV_LENGTH];
        SecureRandom random = new SecureRandom();
        random.nextBytes(IV);
        this.IV = IV;
    }

    public String encrypt(String originMessage) throws Exception {
        System.out.println("Original Message : " + originMessage);

        Cipher cipher = Cipher.getInstance(CIPHER);
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.key.getEncoded(), "AES");
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, this.IV);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, gcmParameterSpec);

        byte[] messageInBytes = originMessage.getBytes();
        byte[] encryptedBytes = cipher.doFinal(messageInBytes);
        String base64EncryptedStr = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("Encrypted Message : " + base64EncryptedStr);
        return base64EncryptedStr;
    }

    public String decrypt(String encryptedMessage) throws Exception {
        System.out.println("Encrypted Message : " + encryptedMessage);

        Cipher cipher = Cipher.getInstance(CIPHER);
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.key.getEncoded(), "AES");
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, this.IV);
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, gcmParameterSpec);

        byte[] messageInBytes = Base64.getDecoder().decode(encryptedMessage);
        byte[] decryptedBytes = cipher.doFinal(messageInBytes);
        String decryptedMessage = new String(decryptedBytes);
        System.out.println("Decrypted Message : " + decryptedMessage);
        return decryptedMessage;
    }
}
