import FileEncoder.AESUtils;

public class AESTest {

    static String key = "S/WkX0F7+FLz9d66/6YG4Q==";

//    static {
//        try {
//            key = AESUtils.getSecretKey();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws Exception {
        long begin = System.currentTimeMillis();
        encryptFile();
        decryptFile();
        long end = System.currentTimeMillis();
        System.err.println("耗时：" + (end-begin)/1000 + "秒");
    }

    static void encryptFile() throws Exception {
        String sourceFilePath = "D:/learning.sql";
        String destFilePath = "D:/learning.bin";
        AESUtils.encryptFile(key, sourceFilePath, destFilePath);
    }

    static void decryptFile() throws Exception {
        String sourceFilePath = "D:/learning.bin";
        String destFilePath = "D:/learning.txt";
        AESUtils.decryptFile(key, sourceFilePath, destFilePath);
    }
}