import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 读取文件内容 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\xx\\yy\\pass.txt");
        FileReader fileReader = new FileReader(file);
//        System.out.println(fileReader.read());
        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        System.out.println(bufferedReader.readLine());
        Map pass=  new HashMap<String,Integer>();
        while(true){
            String temp = bufferedReader.readLine();
            if(temp != null){
                String[] a = temp.split("\t");
//                System.out.println(a.length);
//                System.out.println(temp);
                pass.put(a[0],a[1]);
                continue;
            }
            break;
        }

        Set passSets = pass.keySet();
        Iterator iterator = passSets.iterator();
        while(iterator.hasNext()){
            System.out.println(pass.get(iterator.next()));;
        }


    }
}
