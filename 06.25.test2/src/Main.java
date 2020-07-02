import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Author: dts
 * DateTime: 2020/6/25 11:17
 * Description: TODO
 */
public class Main {
    public static void main(String[] args) {
        //File file = new File("E:\\新建文件夹\\a.txt");
        /*File dest = new File("E:\\");
        File[] files = dest.listFiles();
        for (File f: files) {
            System.out.println(f.getAbsolutePath());
        }*/
        try(InputStream is = new FileInputStream("E:\\a.txt")){
            byte[] buffer = new byte[16];
            while (true){
                int b = is.read(buffer);
                if(b==-1){
                    break;
                }
                for (int i = 0; i < b; i++) {
                    int c = buffer[i];
                    System.out.printf("%c%n", c);
                    System.out.println("===================");
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
