package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.*;
@WebListener
public class ApplicationListener implements ServletContextListener {
   private Integer count;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContextListener.super.contextInitialized(sce);
        System.out.println("web服务器启动，application对象创建");
        String s;
        //初始值从文件读取
        File file = new File("c:/b/a.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            s = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        count = Integer.valueOf(s);
        count ++;
        System.out.println("该网站已经被重启过"+this.count+"次");

        try {
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
        System.out.println("web服务器关闭，application对象销毁");
        //this.count
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            file = new File("c:/b/a.txt");
            fileWriter = new FileWriter(file);//不要使用追加哦
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(this.count.toString());
            bufferedWriter.flush();//刷新缓冲区
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
