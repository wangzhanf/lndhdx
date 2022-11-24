package vip.epss;

import vip.epss.dao.AdminDao;
import vip.epss.dao.BusinessDao;
import vip.epss.dao.DaoImpl;
import vip.epss.pojo.Admin;
import vip.epss.pojo.Business;
import vip.epss.service.AdminService;
import vip.epss.service.BusinessService;
import vip.epss.ui.AdminView;
import vip.epss.ui.AdminViewImpl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("欢迎使用ELE后台系统");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        showMainMenu();//展示用户可以选择的主菜单
        return;
    }

    public static void showMainMenu(){
        //显式欢迎界面
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while(true){
            System.out.println("------------ELE管理系统-----------------");
            System.out.println("1   管理员登录");
            System.out.println("2   商家登录");
            System.out.println("3   商家注册");
            System.out.println("0   退出系统");
            System.out.println("--------------------------------------");
            System.out.print("请输入菜单编号（1，2，3，0）:");
            choice = scanner.nextInt();
            switch (choice){//switch的条件推荐使用整数表达式
                case 1:
                    adminLogin();
                    break;
                case 2:
                    businessLogin();
                    break;
                case 3:
                    businessRegister();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("输入错误请重新输入。");
            }
        }
    }

    public static void adminLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入管理员账号：");
        String name = scanner.nextLine();
        System.out.print("请输入管理员密码：");
        String pass = scanner.nextLine();
        AdminService adminService = new AdminService();
        String status = adminService.loginCheck(name, pass);
        System.out.println(status);
        //根据返回情况决定是转到管理员管理界面还是返回主菜单
        if(status.startsWith("恭喜")){
            AdminView adminView = new AdminViewImpl();
            adminView.showSubMenu();
        }else{
            return;
        }
    }

    public static void businessLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入商家账号：");
        String name = scanner.nextLine();
        System.out.print("请输入商家密码：");
        String pass = scanner.nextLine();
        BusinessService businessService = new BusinessService();
        Business ret = businessService.loginCheck(name,pass);

        //根据返回情况决定是转到商家管理界面还是返回主菜单
        if(ret != null){
            System.out.println("展现商家管理界面");
        }else{
            return;
        }
    }

    public static void businessRegister(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入商家账号：");
        String name = scanner.nextLine();
        System.out.print("请输入登录密码：");
        String pass = scanner.nextLine();
        System.out.print("请重复密码：");
        String repass = scanner.nextLine();
        BusinessService businessService = new BusinessService();
        String status = businessService.registerNew(name, pass, repass);
        System.out.println(status);
        //根据返回情况决定是转到商家管理界面还是返回主菜单
        if(status.startsWith("恭喜")){
            System.out.println("展现商家管理界面");
        }else{
            return;
        }
    }
}
