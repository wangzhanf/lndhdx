import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class 写入文件 {
    public static void main(String[] args) throws IOException {
        File f = new File("c:/","xx/yy/pass.txt");
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bfw=null;
//        for(;;){
            bfw = new BufferedWriter(fw);
//        }
        bfw.write("\nww\t789");

        bfw.flush();//强制刷新缓冲区
        bfw.close();
    }
}
