public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String sendMessageUseAES(String message, Person receiver) {
        System.out.println(this.name + " Send message to " + receiver.getName());
        ASE256GMC ase256GMC = ASE256GMC.getASE256GMC();
        String encryptedMessage = null;
        try {
            encryptedMessage = ase256GMC.encrypt(message);
        } catch (Exception ignored) {
        }
        return encryptedMessage;
    }

    public void receiveMessageUseAES(String message) {
        System.out.println(this.name + " received message");
        ASE256GMC ase256GMC = ASE256GMC.getASE256GMC();
        try {
            ase256GMC.decrypt(message);
        } catch (Exception ignored) {
        }
    }

    public String sendMessageUseRSA(String message, Person receiver) {
        System.out.println(this.name + " Send message to " + receiver.getName());
        RSA2048ECB rsa2048ECB = RSA2048ECB.getRsa2048ECB();
        String encryptedMessage = null;
        try {
            encryptedMessage = rsa2048ECB.encrypt(message);
        } catch (Exception ignored) {
        }
        return encryptedMessage;
    }

    public void receiveMessageUseRSA(String message) {
        System.out.println(this.name + " received message");
        RSA2048ECB rsa2048ECB = RSA2048ECB.getRsa2048ECB();
        try {
            rsa2048ECB.decrypt(message);
        } catch (Exception ignored) {
        }
    }

    public String signMessage(String message, Person receiver) {
        System.out.println(this.name + " sign to " + receiver.getName());
        RSA2048ECB rsa2048ECB = RSA2048ECB.getRsa2048ECB();
        String signature = null;
        try {
            signature = rsa2048ECB.sign(message);
        } catch (Exception ignored) {
        }
        return signature;
    }

    public void verifyMessage(String message, String signature) {
        System.out.println(this.name + " verify message");
        RSA2048ECB rsa2048ECB = RSA2048ECB.getRsa2048ECB();
        try {
            rsa2048ECB.verify(message, signature);
        } catch (Exception ignored) {
        }
    }
}
