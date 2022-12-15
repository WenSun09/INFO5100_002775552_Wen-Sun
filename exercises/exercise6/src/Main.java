public class Main {
    public static void main(String[] args) {
        Person Alice = new Person("Alice");
        Person Bob = new Person("Bob");

        // AES-256 with GCM/NoPadding cipher
        System.out.println("Use AES-256 encryption with GCM/NoPadding cipher");
        String message = Alice.sendMessageUseAES("Hello World!", Bob);
        Bob.receiveMessageUseAES(message);

        // Use RSA-2048 encryption ECB/PKCS1Padding
        System.out.println("Use RSA-2048 encryption ECB/PKCS1Padding");
        message = Bob.sendMessageUseRSA("I like Java.", Alice);
        Alice.receiveMessageUseRSA(message);

        // Use RSA-2048 to sign and verify
        System.out.println("Use RSA-2048 to sign and verify");
        message = "Bob";
        String signature = Bob.signMessage(message, Alice);
        Alice.verifyMessage(message, signature);
    }
}