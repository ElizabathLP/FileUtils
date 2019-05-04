import ZipArcher.ZipUtils;

public class ZipTest {
    public static void main(String[] args) {
        try {
            ZipUtils.compress("D:\\fileUtil");
            ZipUtils.decompress("D:\\fileUtil.zip");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
