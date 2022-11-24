import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class 文件1 {
    public static void main(String[] args) throws IOException {
        String path;
        //path应该是从键盘输入获取
        Scanner scanner = new Scanner(System.in);
        path = scanner.nextLine();
        File file = new File("c:/",path);
//        if(!file.exists()){
//            System.out.println("不存在该目录");
//            if(file.mkdirs()){
//                System.out.println("创建成功");
//            }else{
//                System.out.println("创建失败");
//            }
//        }
        if(!file.exists()){
            System.out.println("不存在该文件或目录");
            if(path.lastIndexOf("/") == path.length()-1){//输入的是目录
                if(!file.exists()){
                    System.out.println("不存在该目录");
                    if(file.mkdirs()){
                        System.out.println("创建目录成功");
                    }else{
                        System.out.println("创建目录失败");
                    }
                }
            }else{
                if(file.createNewFile()){
                    System.out.println("创建文件成功");
                }else{
                    System.out.println("创建文件失败");
                }
            }
        }
    }
}
